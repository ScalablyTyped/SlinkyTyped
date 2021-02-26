package typingsSlinky.fileType

import typingsSlinky.fileType.fileTypeStrings.close
import typingsSlinky.fileType.fileTypeStrings.data
import typingsSlinky.fileType.fileTypeStrings.end
import typingsSlinky.fileType.fileTypeStrings.error
import typingsSlinky.fileType.fileTypeStrings.pause
import typingsSlinky.fileType.fileTypeStrings.readable
import typingsSlinky.fileType.fileTypeStrings.resume
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.Set
import typingsSlinky.strtok3.typesMod.ITokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  /**
  	Supported file extensions.
  	*/
  @JSImport("file-type/core", "extensions")
  @js.native
  val extensions: Set[FileExtension] = js.native
  
  @JSImport("file-type/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  @JSImport("file-type/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  /**
  	Detect the file type of a `Buffer`, `Uint8Array`, or `ArrayBuffer`.
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	If file access is available, it is recommended to use `.fromFile()` instead.
  	@param buffer - A buffer representing file data. It works best if the buffer contains the entire file, it may work with a smaller portion as well.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @JSImport("file-type/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  
  /**
  	Detect the file type of a Node.js [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param stream - A readable stream representing file data.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @JSImport("file-type/core", "fromStream")
  @js.native
  def fromStream(stream: Readable): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  
  /**
  	Detect the file type from an [`ITokenizer`](https://github.com/Borewit/strtok3#tokenizer) source.
  	This method is used internally, but can also be used for a special "tokenizer" reader.
  	A tokenizer propagates the internal read functions, allowing alternative transport mechanisms, to access files, to be implemented and used.
  	An example is [`@tokenizer/http`](https://github.com/Borewit/tokenizer-http), which requests data using [HTTP-range-requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/Range_requests). A difference with a conventional stream and the [*tokenizer*](https://github.com/Borewit/strtok3#tokenizer), is that it is able to *ignore* (seek, fast-forward) in the stream. For example, you may only need and read the first 6 bytes, and the last 128 bytes, which may be an advantage in case reading the entire file would take longer.
  	```
  	import {makeTokenizer} = require('@tokenizer/http');
  	import FileType = require('file-type');
  	const audioTrackUrl = 'https://test-audio.netlify.com/Various%20Artists%20-%202009%20-%20netBloc%20Vol%2024_%20tiuqottigeloot%20%5BMP3-V2%5D/01%20-%20Diablo%20Swing%20Orchestra%20-%20Heroines.mp3';
  	(async () => {
  		const httpTokenizer = await makeTokenizer(audioTrackUrl);
  		const fileType = await FileType.fromTokenizer(httpTokenizer);
  		console.log(fileType);
  		//=> {ext: 'mp3', mime: 'audio/mpeg'}
  	})();
  	```
  	@param tokenizer - File source implementing the tokenizer interface.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @JSImport("file-type/core", "fromTokenizer")
  @js.native
  def fromTokenizer(tokenizer: ITokenizer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  
  /**
  	Supported MIME types.
  	*/
  @JSImport("file-type/core", "mimeTypes")
  @js.native
  val mimeTypes: js.Array[MimeType] = js.native
  
  /**
  	Detect the file type of a readable stream.
  	@param readableStream - A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) containing a file to examine.
  	@returns A `Promise` which resolves to the original readable stream argument, but with an added `fileType` property, which is an object like the one returned from `FileType.fromFile()`.
  	@example
  	```
  	import * as fs from 'fs';
  	import * as crypto from 'crypto';
  	import fileType = require('file-type');
  	(async () => {
  		const read = fs.createReadStream('encrypted.enc');
  		const decipher = crypto.createDecipheriv(alg, key, iv);
  		const stream = await fileType.stream(read.pipe(decipher));
  		console.log(stream.fileType);
  		//=> {ext: 'mov', mime: 'video/quicktime'}
  		const write = fs.createWriteStream(`decrypted.${stream.fileType.ext}`);
  		stream.pipe(write);
  	})();
  	```
  	*/
  @JSImport("file-type/core", "stream")
  @js.native
  def stream(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fileType.fileTypeStrings.jpg
    - typingsSlinky.fileType.fileTypeStrings.png
    - typingsSlinky.fileType.fileTypeStrings.apng
    - typingsSlinky.fileType.fileTypeStrings.gif
    - typingsSlinky.fileType.fileTypeStrings.webp
    - typingsSlinky.fileType.fileTypeStrings.flif
    - typingsSlinky.fileType.fileTypeStrings.cr2
    - typingsSlinky.fileType.fileTypeStrings.cr3
    - typingsSlinky.fileType.fileTypeStrings.orf
    - typingsSlinky.fileType.fileTypeStrings.arw
    - typingsSlinky.fileType.fileTypeStrings.dng
    - typingsSlinky.fileType.fileTypeStrings.nef
    - typingsSlinky.fileType.fileTypeStrings.rw2
    - typingsSlinky.fileType.fileTypeStrings.raf
    - typingsSlinky.fileType.fileTypeStrings.tif
    - typingsSlinky.fileType.fileTypeStrings.bmp
    - typingsSlinky.fileType.fileTypeStrings.icns
    - typingsSlinky.fileType.fileTypeStrings.jxr
    - typingsSlinky.fileType.fileTypeStrings.psd
    - typingsSlinky.fileType.fileTypeStrings.indd
    - typingsSlinky.fileType.fileTypeStrings.zip
    - typingsSlinky.fileType.fileTypeStrings.tar
    - typingsSlinky.fileType.fileTypeStrings.rar
    - typingsSlinky.fileType.fileTypeStrings.gz
    - typingsSlinky.fileType.fileTypeStrings.bz2
    - typingsSlinky.fileType.fileTypeStrings.`7z`
    - typingsSlinky.fileType.fileTypeStrings.dmg
    - typingsSlinky.fileType.fileTypeStrings.mp4
    - typingsSlinky.fileType.fileTypeStrings.mid
    - typingsSlinky.fileType.fileTypeStrings.mkv
    - typingsSlinky.fileType.fileTypeStrings.webm
    - typingsSlinky.fileType.fileTypeStrings.mov
    - typingsSlinky.fileType.fileTypeStrings.avi
    - typingsSlinky.fileType.fileTypeStrings.mpg
    - typingsSlinky.fileType.fileTypeStrings.mp2
    - typingsSlinky.fileType.fileTypeStrings.mp3
    - typingsSlinky.fileType.fileTypeStrings.m4a
    - typingsSlinky.fileType.fileTypeStrings.ogg
    - typingsSlinky.fileType.fileTypeStrings.opus
    - typingsSlinky.fileType.fileTypeStrings.flac
    - typingsSlinky.fileType.fileTypeStrings.wav
    - typingsSlinky.fileType.fileTypeStrings.qcp
    - typingsSlinky.fileType.fileTypeStrings.amr
    - typingsSlinky.fileType.fileTypeStrings.pdf
    - typingsSlinky.fileType.fileTypeStrings.epub
    - typingsSlinky.fileType.fileTypeStrings.mobi
    - typingsSlinky.fileType.fileTypeStrings.exe
    - typingsSlinky.fileType.fileTypeStrings.swf
    - typingsSlinky.fileType.fileTypeStrings.rtf
    - typingsSlinky.fileType.fileTypeStrings.woff
    - typingsSlinky.fileType.fileTypeStrings.woff2
    - typingsSlinky.fileType.fileTypeStrings.eot
    - typingsSlinky.fileType.fileTypeStrings.ttf
    - typingsSlinky.fileType.fileTypeStrings.otf
    - typingsSlinky.fileType.fileTypeStrings.ico
    - typingsSlinky.fileType.fileTypeStrings.flv
    - typingsSlinky.fileType.fileTypeStrings.ps
    - typingsSlinky.fileType.fileTypeStrings.xz
    - typingsSlinky.fileType.fileTypeStrings.sqlite
    - typingsSlinky.fileType.fileTypeStrings.nes
    - typingsSlinky.fileType.fileTypeStrings.crx
    - typingsSlinky.fileType.fileTypeStrings.xpi
    - typingsSlinky.fileType.fileTypeStrings.cab
    - typingsSlinky.fileType.fileTypeStrings.deb
    - typingsSlinky.fileType.fileTypeStrings.ar
    - typingsSlinky.fileType.fileTypeStrings.rpm
    - typingsSlinky.fileType.fileTypeStrings.Z
    - typingsSlinky.fileType.fileTypeStrings.lz
    - typingsSlinky.fileType.fileTypeStrings.cfb
    - typingsSlinky.fileType.fileTypeStrings.mxf
    - typingsSlinky.fileType.fileTypeStrings.mts
    - typingsSlinky.fileType.fileTypeStrings.wasm
    - typingsSlinky.fileType.fileTypeStrings.blend
    - typingsSlinky.fileType.fileTypeStrings.bpg
    - typingsSlinky.fileType.fileTypeStrings.docx
    - typingsSlinky.fileType.fileTypeStrings.pptx
    - typingsSlinky.fileType.fileTypeStrings.xlsx
    - typingsSlinky.fileType.fileTypeStrings.`3gp`
    - typingsSlinky.fileType.fileTypeStrings.`3g2`
    - typingsSlinky.fileType.fileTypeStrings.jp2
    - typingsSlinky.fileType.fileTypeStrings.jpm
    - typingsSlinky.fileType.fileTypeStrings.jpx
    - typingsSlinky.fileType.fileTypeStrings.mj2
    - typingsSlinky.fileType.fileTypeStrings.aif
    - typingsSlinky.fileType.fileTypeStrings.odt
    - typingsSlinky.fileType.fileTypeStrings.ods
    - typingsSlinky.fileType.fileTypeStrings.odp
    - typingsSlinky.fileType.fileTypeStrings.xml
    - typingsSlinky.fileType.fileTypeStrings.heic
    - typingsSlinky.fileType.fileTypeStrings.cur
    - typingsSlinky.fileType.fileTypeStrings.ktx
    - typingsSlinky.fileType.fileTypeStrings.ape
    - typingsSlinky.fileType.fileTypeStrings.wv
    - typingsSlinky.fileType.fileTypeStrings.asf
    - typingsSlinky.fileType.fileTypeStrings.dcm
    - typingsSlinky.fileType.fileTypeStrings.mpc
    - typingsSlinky.fileType.fileTypeStrings.ics
    - typingsSlinky.fileType.fileTypeStrings.glb
    - typingsSlinky.fileType.fileTypeStrings.pcap
    - typingsSlinky.fileType.fileTypeStrings.dsf
    - typingsSlinky.fileType.fileTypeStrings.lnk
    - typingsSlinky.fileType.fileTypeStrings.alias
    - typingsSlinky.fileType.fileTypeStrings.voc
    - typingsSlinky.fileType.fileTypeStrings.ac3
    - typingsSlinky.fileType.fileTypeStrings.m4b
    - typingsSlinky.fileType.fileTypeStrings.m4p
    - typingsSlinky.fileType.fileTypeStrings.m4v
    - typingsSlinky.fileType.fileTypeStrings.f4a
    - typingsSlinky.fileType.fileTypeStrings.f4b
    - typingsSlinky.fileType.fileTypeStrings.f4p
    - typingsSlinky.fileType.fileTypeStrings.f4v
    - typingsSlinky.fileType.fileTypeStrings.mie
    - typingsSlinky.fileType.fileTypeStrings.ogv
    - typingsSlinky.fileType.fileTypeStrings.ogm
    - typingsSlinky.fileType.fileTypeStrings.oga
    - typingsSlinky.fileType.fileTypeStrings.spx
    - typingsSlinky.fileType.fileTypeStrings.ogx
    - typingsSlinky.fileType.fileTypeStrings.arrow
    - typingsSlinky.fileType.fileTypeStrings.shp
    - typingsSlinky.fileType.fileTypeStrings.aac
    - typingsSlinky.fileType.fileTypeStrings.mp1
    - typingsSlinky.fileType.fileTypeStrings.it
    - typingsSlinky.fileType.fileTypeStrings.s3m
    - typingsSlinky.fileType.fileTypeStrings.xm
    - typingsSlinky.fileType.fileTypeStrings.ai
    - typingsSlinky.fileType.fileTypeStrings.skp
    - typingsSlinky.fileType.fileTypeStrings.avif
    - typingsSlinky.fileType.fileTypeStrings.eps
    - typingsSlinky.fileType.fileTypeStrings.lzh
    - typingsSlinky.fileType.fileTypeStrings.pgp
    - typingsSlinky.fileType.fileTypeStrings.asar
    - typingsSlinky.fileType.fileTypeStrings.stl
  */
  trait FileExtension extends StObject
  object FileExtension {
    
    @scala.inline
    def `3g2`: typingsSlinky.fileType.fileTypeStrings.`3g2` = "3g2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`3g2`]
    
    @scala.inline
    def `3gp`: typingsSlinky.fileType.fileTypeStrings.`3gp` = "3gp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`3gp`]
    
    @scala.inline
    def `7z`: typingsSlinky.fileType.fileTypeStrings.`7z` = "7z".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`7z`]
    
    @scala.inline
    def Z: typingsSlinky.fileType.fileTypeStrings.Z = "Z".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.Z]
    
    @scala.inline
    def aac: typingsSlinky.fileType.fileTypeStrings.aac = "aac".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.aac]
    
    @scala.inline
    def ac3: typingsSlinky.fileType.fileTypeStrings.ac3 = "ac3".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ac3]
    
    @scala.inline
    def ai: typingsSlinky.fileType.fileTypeStrings.ai = "ai".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ai]
    
    @scala.inline
    def aif: typingsSlinky.fileType.fileTypeStrings.aif = "aif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.aif]
    
    @scala.inline
    def alias: typingsSlinky.fileType.fileTypeStrings.alias = "alias".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.alias]
    
    @scala.inline
    def amr: typingsSlinky.fileType.fileTypeStrings.amr = "amr".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.amr]
    
    @scala.inline
    def ape: typingsSlinky.fileType.fileTypeStrings.ape = "ape".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ape]
    
    @scala.inline
    def apng: typingsSlinky.fileType.fileTypeStrings.apng = "apng".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.apng]
    
    @scala.inline
    def ar: typingsSlinky.fileType.fileTypeStrings.ar = "ar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ar]
    
    @scala.inline
    def arrow: typingsSlinky.fileType.fileTypeStrings.arrow = "arrow".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.arrow]
    
    @scala.inline
    def arw: typingsSlinky.fileType.fileTypeStrings.arw = "arw".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.arw]
    
    @scala.inline
    def asar: typingsSlinky.fileType.fileTypeStrings.asar = "asar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.asar]
    
    @scala.inline
    def asf: typingsSlinky.fileType.fileTypeStrings.asf = "asf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.asf]
    
    @scala.inline
    def avi: typingsSlinky.fileType.fileTypeStrings.avi = "avi".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.avi]
    
    @scala.inline
    def avif: typingsSlinky.fileType.fileTypeStrings.avif = "avif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.avif]
    
    @scala.inline
    def blend: typingsSlinky.fileType.fileTypeStrings.blend = "blend".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.blend]
    
    @scala.inline
    def bmp: typingsSlinky.fileType.fileTypeStrings.bmp = "bmp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.bmp]
    
    @scala.inline
    def bpg: typingsSlinky.fileType.fileTypeStrings.bpg = "bpg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.bpg]
    
    @scala.inline
    def bz2: typingsSlinky.fileType.fileTypeStrings.bz2 = "bz2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.bz2]
    
    @scala.inline
    def cab: typingsSlinky.fileType.fileTypeStrings.cab = "cab".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.cab]
    
    @scala.inline
    def cfb: typingsSlinky.fileType.fileTypeStrings.cfb = "cfb".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.cfb]
    
    @scala.inline
    def cr2: typingsSlinky.fileType.fileTypeStrings.cr2 = "cr2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.cr2]
    
    @scala.inline
    def cr3: typingsSlinky.fileType.fileTypeStrings.cr3 = "cr3".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.cr3]
    
    @scala.inline
    def crx: typingsSlinky.fileType.fileTypeStrings.crx = "crx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.crx]
    
    @scala.inline
    def cur: typingsSlinky.fileType.fileTypeStrings.cur = "cur".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.cur]
    
    @scala.inline
    def dcm: typingsSlinky.fileType.fileTypeStrings.dcm = "dcm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.dcm]
    
    @scala.inline
    def deb: typingsSlinky.fileType.fileTypeStrings.deb = "deb".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.deb]
    
    @scala.inline
    def dmg: typingsSlinky.fileType.fileTypeStrings.dmg = "dmg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.dmg]
    
    @scala.inline
    def dng: typingsSlinky.fileType.fileTypeStrings.dng = "dng".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.dng]
    
    @scala.inline
    def docx: typingsSlinky.fileType.fileTypeStrings.docx = "docx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.docx]
    
    @scala.inline
    def dsf: typingsSlinky.fileType.fileTypeStrings.dsf = "dsf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.dsf]
    
    @scala.inline
    def eot: typingsSlinky.fileType.fileTypeStrings.eot = "eot".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.eot]
    
    @scala.inline
    def eps: typingsSlinky.fileType.fileTypeStrings.eps = "eps".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.eps]
    
    @scala.inline
    def epub: typingsSlinky.fileType.fileTypeStrings.epub = "epub".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.epub]
    
    @scala.inline
    def exe: typingsSlinky.fileType.fileTypeStrings.exe = "exe".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.exe]
    
    @scala.inline
    def f4a: typingsSlinky.fileType.fileTypeStrings.f4a = "f4a".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.f4a]
    
    @scala.inline
    def f4b: typingsSlinky.fileType.fileTypeStrings.f4b = "f4b".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.f4b]
    
    @scala.inline
    def f4p: typingsSlinky.fileType.fileTypeStrings.f4p = "f4p".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.f4p]
    
    @scala.inline
    def f4v: typingsSlinky.fileType.fileTypeStrings.f4v = "f4v".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.f4v]
    
    @scala.inline
    def flac: typingsSlinky.fileType.fileTypeStrings.flac = "flac".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.flac]
    
    @scala.inline
    def flif: typingsSlinky.fileType.fileTypeStrings.flif = "flif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.flif]
    
    @scala.inline
    def flv: typingsSlinky.fileType.fileTypeStrings.flv = "flv".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.flv]
    
    @scala.inline
    def gif: typingsSlinky.fileType.fileTypeStrings.gif = "gif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.gif]
    
    @scala.inline
    def glb: typingsSlinky.fileType.fileTypeStrings.glb = "glb".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.glb]
    
    @scala.inline
    def gz: typingsSlinky.fileType.fileTypeStrings.gz = "gz".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.gz]
    
    @scala.inline
    def heic: typingsSlinky.fileType.fileTypeStrings.heic = "heic".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.heic]
    
    @scala.inline
    def icns: typingsSlinky.fileType.fileTypeStrings.icns = "icns".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.icns]
    
    @scala.inline
    def ico: typingsSlinky.fileType.fileTypeStrings.ico = "ico".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ico]
    
    @scala.inline
    def ics: typingsSlinky.fileType.fileTypeStrings.ics = "ics".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ics]
    
    @scala.inline
    def indd: typingsSlinky.fileType.fileTypeStrings.indd = "indd".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.indd]
    
    @scala.inline
    def it: typingsSlinky.fileType.fileTypeStrings.it = "it".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.it]
    
    @scala.inline
    def jp2: typingsSlinky.fileType.fileTypeStrings.jp2 = "jp2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.jp2]
    
    @scala.inline
    def jpg: typingsSlinky.fileType.fileTypeStrings.jpg = "jpg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.jpg]
    
    @scala.inline
    def jpm: typingsSlinky.fileType.fileTypeStrings.jpm = "jpm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.jpm]
    
    @scala.inline
    def jpx: typingsSlinky.fileType.fileTypeStrings.jpx = "jpx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.jpx]
    
    @scala.inline
    def jxr: typingsSlinky.fileType.fileTypeStrings.jxr = "jxr".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.jxr]
    
    @scala.inline
    def ktx: typingsSlinky.fileType.fileTypeStrings.ktx = "ktx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ktx]
    
    @scala.inline
    def lnk: typingsSlinky.fileType.fileTypeStrings.lnk = "lnk".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.lnk]
    
    @scala.inline
    def lz: typingsSlinky.fileType.fileTypeStrings.lz = "lz".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.lz]
    
    @scala.inline
    def lzh: typingsSlinky.fileType.fileTypeStrings.lzh = "lzh".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.lzh]
    
    @scala.inline
    def m4a: typingsSlinky.fileType.fileTypeStrings.m4a = "m4a".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.m4a]
    
    @scala.inline
    def m4b: typingsSlinky.fileType.fileTypeStrings.m4b = "m4b".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.m4b]
    
    @scala.inline
    def m4p: typingsSlinky.fileType.fileTypeStrings.m4p = "m4p".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.m4p]
    
    @scala.inline
    def m4v: typingsSlinky.fileType.fileTypeStrings.m4v = "m4v".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.m4v]
    
    @scala.inline
    def mid: typingsSlinky.fileType.fileTypeStrings.mid = "mid".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mid]
    
    @scala.inline
    def mie: typingsSlinky.fileType.fileTypeStrings.mie = "mie".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mie]
    
    @scala.inline
    def mj2: typingsSlinky.fileType.fileTypeStrings.mj2 = "mj2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mj2]
    
    @scala.inline
    def mkv: typingsSlinky.fileType.fileTypeStrings.mkv = "mkv".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mkv]
    
    @scala.inline
    def mobi: typingsSlinky.fileType.fileTypeStrings.mobi = "mobi".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mobi]
    
    @scala.inline
    def mov: typingsSlinky.fileType.fileTypeStrings.mov = "mov".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mov]
    
    @scala.inline
    def mp1: typingsSlinky.fileType.fileTypeStrings.mp1 = "mp1".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mp1]
    
    @scala.inline
    def mp2: typingsSlinky.fileType.fileTypeStrings.mp2 = "mp2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mp2]
    
    @scala.inline
    def mp3: typingsSlinky.fileType.fileTypeStrings.mp3 = "mp3".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mp3]
    
    @scala.inline
    def mp4: typingsSlinky.fileType.fileTypeStrings.mp4 = "mp4".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mp4]
    
    @scala.inline
    def mpc: typingsSlinky.fileType.fileTypeStrings.mpc = "mpc".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mpc]
    
    @scala.inline
    def mpg: typingsSlinky.fileType.fileTypeStrings.mpg = "mpg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mpg]
    
    @scala.inline
    def mts: typingsSlinky.fileType.fileTypeStrings.mts = "mts".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mts]
    
    @scala.inline
    def mxf: typingsSlinky.fileType.fileTypeStrings.mxf = "mxf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.mxf]
    
    @scala.inline
    def nef: typingsSlinky.fileType.fileTypeStrings.nef = "nef".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.nef]
    
    @scala.inline
    def nes: typingsSlinky.fileType.fileTypeStrings.nes = "nes".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.nes]
    
    @scala.inline
    def odp: typingsSlinky.fileType.fileTypeStrings.odp = "odp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.odp]
    
    @scala.inline
    def ods: typingsSlinky.fileType.fileTypeStrings.ods = "ods".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ods]
    
    @scala.inline
    def odt: typingsSlinky.fileType.fileTypeStrings.odt = "odt".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.odt]
    
    @scala.inline
    def oga: typingsSlinky.fileType.fileTypeStrings.oga = "oga".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.oga]
    
    @scala.inline
    def ogg: typingsSlinky.fileType.fileTypeStrings.ogg = "ogg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ogg]
    
    @scala.inline
    def ogm: typingsSlinky.fileType.fileTypeStrings.ogm = "ogm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ogm]
    
    @scala.inline
    def ogv: typingsSlinky.fileType.fileTypeStrings.ogv = "ogv".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ogv]
    
    @scala.inline
    def ogx: typingsSlinky.fileType.fileTypeStrings.ogx = "ogx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ogx]
    
    @scala.inline
    def opus: typingsSlinky.fileType.fileTypeStrings.opus = "opus".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.opus]
    
    @scala.inline
    def orf: typingsSlinky.fileType.fileTypeStrings.orf = "orf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.orf]
    
    @scala.inline
    def otf: typingsSlinky.fileType.fileTypeStrings.otf = "otf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.otf]
    
    @scala.inline
    def pcap: typingsSlinky.fileType.fileTypeStrings.pcap = "pcap".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.pcap]
    
    @scala.inline
    def pdf: typingsSlinky.fileType.fileTypeStrings.pdf = "pdf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.pdf]
    
    @scala.inline
    def pgp: typingsSlinky.fileType.fileTypeStrings.pgp = "pgp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.pgp]
    
    @scala.inline
    def png: typingsSlinky.fileType.fileTypeStrings.png = "png".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.png]
    
    @scala.inline
    def pptx: typingsSlinky.fileType.fileTypeStrings.pptx = "pptx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.pptx]
    
    @scala.inline
    def ps: typingsSlinky.fileType.fileTypeStrings.ps = "ps".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ps]
    
    @scala.inline
    def psd: typingsSlinky.fileType.fileTypeStrings.psd = "psd".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.psd]
    
    @scala.inline
    def qcp: typingsSlinky.fileType.fileTypeStrings.qcp = "qcp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.qcp]
    
    @scala.inline
    def raf: typingsSlinky.fileType.fileTypeStrings.raf = "raf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.raf]
    
    @scala.inline
    def rar: typingsSlinky.fileType.fileTypeStrings.rar = "rar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.rar]
    
    @scala.inline
    def rpm: typingsSlinky.fileType.fileTypeStrings.rpm = "rpm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.rpm]
    
    @scala.inline
    def rtf: typingsSlinky.fileType.fileTypeStrings.rtf = "rtf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.rtf]
    
    @scala.inline
    def rw2: typingsSlinky.fileType.fileTypeStrings.rw2 = "rw2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.rw2]
    
    @scala.inline
    def s3m: typingsSlinky.fileType.fileTypeStrings.s3m = "s3m".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.s3m]
    
    @scala.inline
    def shp: typingsSlinky.fileType.fileTypeStrings.shp = "shp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.shp]
    
    @scala.inline
    def skp: typingsSlinky.fileType.fileTypeStrings.skp = "skp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.skp]
    
    @scala.inline
    def spx: typingsSlinky.fileType.fileTypeStrings.spx = "spx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.spx]
    
    @scala.inline
    def sqlite: typingsSlinky.fileType.fileTypeStrings.sqlite = "sqlite".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.sqlite]
    
    @scala.inline
    def stl: typingsSlinky.fileType.fileTypeStrings.stl = "stl".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.stl]
    
    @scala.inline
    def swf: typingsSlinky.fileType.fileTypeStrings.swf = "swf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.swf]
    
    @scala.inline
    def tar: typingsSlinky.fileType.fileTypeStrings.tar = "tar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.tar]
    
    @scala.inline
    def tif: typingsSlinky.fileType.fileTypeStrings.tif = "tif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.tif]
    
    @scala.inline
    def ttf: typingsSlinky.fileType.fileTypeStrings.ttf = "ttf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.ttf]
    
    @scala.inline
    def voc: typingsSlinky.fileType.fileTypeStrings.voc = "voc".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.voc]
    
    @scala.inline
    def wasm: typingsSlinky.fileType.fileTypeStrings.wasm = "wasm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.wasm]
    
    @scala.inline
    def wav: typingsSlinky.fileType.fileTypeStrings.wav = "wav".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.wav]
    
    @scala.inline
    def webm: typingsSlinky.fileType.fileTypeStrings.webm = "webm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.webm]
    
    @scala.inline
    def webp: typingsSlinky.fileType.fileTypeStrings.webp = "webp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.webp]
    
    @scala.inline
    def woff: typingsSlinky.fileType.fileTypeStrings.woff = "woff".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.woff]
    
    @scala.inline
    def woff2: typingsSlinky.fileType.fileTypeStrings.woff2 = "woff2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.woff2]
    
    @scala.inline
    def wv: typingsSlinky.fileType.fileTypeStrings.wv = "wv".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.wv]
    
    @scala.inline
    def xlsx: typingsSlinky.fileType.fileTypeStrings.xlsx = "xlsx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.xlsx]
    
    @scala.inline
    def xm: typingsSlinky.fileType.fileTypeStrings.xm = "xm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.xm]
    
    @scala.inline
    def xml: typingsSlinky.fileType.fileTypeStrings.xml = "xml".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.xml]
    
    @scala.inline
    def xpi: typingsSlinky.fileType.fileTypeStrings.xpi = "xpi".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.xpi]
    
    @scala.inline
    def xz: typingsSlinky.fileType.fileTypeStrings.xz = "xz".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.xz]
    
    @scala.inline
    def zip: typingsSlinky.fileType.fileTypeStrings.zip = "zip".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.zip]
  }
  
  @js.native
  trait FileTypeResult extends StObject {
    
    /**
    		One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
    		*/
    val ext: FileExtension = js.native
    
    /**
    		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    		*/
    val mime: MimeType = js.native
  }
  object FileTypeResult {
    
    @scala.inline
    def apply(ext: FileExtension, mime: MimeType): FileTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeResult]
    }
    
    @scala.inline
    implicit class FileTypeResultMutableBuilder[Self <: FileTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExt(value: FileExtension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: MimeType): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fileType.fileTypeStrings.imageSlashjpeg
    - typingsSlinky.fileType.fileTypeStrings.imageSlashpng
    - typingsSlinky.fileType.fileTypeStrings.imageSlashgif
    - typingsSlinky.fileType.fileTypeStrings.imageSlashwebp
    - typingsSlinky.fileType.fileTypeStrings.imageSlashflif
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-canon-cr2`
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-canon-cr3`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashtiff
    - typingsSlinky.fileType.fileTypeStrings.imageSlashbmp
    - typingsSlinky.fileType.fileTypeStrings.imageSlashicns
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashvndDotms-photo`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-indesign`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashepubPlussignzip
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-xpinstall`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashzip
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-tar`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashgzip
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-bzip2`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`
    - typingsSlinky.fileType.fileTypeStrings.videoSlashmp4
    - typingsSlinky.fileType.fileTypeStrings.audioSlashmidi
    - typingsSlinky.fileType.fileTypeStrings.`videoSlashx-matroska`
    - typingsSlinky.fileType.fileTypeStrings.videoSlashwebm
    - typingsSlinky.fileType.fileTypeStrings.videoSlashquicktime
    - typingsSlinky.fileType.fileTypeStrings.videoSlashvndDotavi
    - typingsSlinky.fileType.fileTypeStrings.audioSlashvndDotwave
    - typingsSlinky.fileType.fileTypeStrings.audioSlashqcelp
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-ms-asf`
    - typingsSlinky.fileType.fileTypeStrings.`videoSlashx-ms-asf`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`
    - typingsSlinky.fileType.fileTypeStrings.videoSlashmpeg
    - typingsSlinky.fileType.fileTypeStrings.videoSlash3gpp
    - typingsSlinky.fileType.fileTypeStrings.audioSlashmpeg
    - typingsSlinky.fileType.fileTypeStrings.audioSlashmp4
    - typingsSlinky.fileType.fileTypeStrings.audioSlashopus
    - typingsSlinky.fileType.fileTypeStrings.videoSlashogg
    - typingsSlinky.fileType.fileTypeStrings.audioSlashogg
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashogg
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-flac`
    - typingsSlinky.fileType.fileTypeStrings.audioSlashape
    - typingsSlinky.fileType.fileTypeStrings.audioSlashwavpack
    - typingsSlinky.fileType.fileTypeStrings.audioSlashamr
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashpdf
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-msdownload`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashrtf
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashwasm
    - typingsSlinky.fileType.fileTypeStrings.fontSlashwoff
    - typingsSlinky.fileType.fileTypeStrings.fontSlashwoff2
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`
    - typingsSlinky.fileType.fileTypeStrings.fontSlashttf
    - typingsSlinky.fileType.fileTypeStrings.fontSlashotf
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-icon`
    - typingsSlinky.fileType.fileTypeStrings.`videoSlashx-flv`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashpostscript
    - typingsSlinky.fileType.fileTypeStrings.applicationSlasheps
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-xz`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-sqlite3`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-deb`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-unix-archive`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-rpm`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-compress`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-lzip`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-cfb`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-mie`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashmxf
    - typingsSlinky.fileType.fileTypeStrings.videoSlashmp2t
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-blender`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashbpg
    - typingsSlinky.fileType.fileTypeStrings.imageSlashjp2
    - typingsSlinky.fileType.fileTypeStrings.imageSlashjpx
    - typingsSlinky.fileType.fileTypeStrings.imageSlashjpm
    - typingsSlinky.fileType.fileTypeStrings.imageSlashmj2
    - typingsSlinky.fileType.fileTypeStrings.audioSlashaiff
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashxml
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashheif
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashheif-sequence`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashheic
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashheic-sequence`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashktx
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashdicom
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-musepack`
    - typingsSlinky.fileType.fileTypeStrings.textSlashcalendar
    - typingsSlinky.fileType.fileTypeStrings.`modelSlashgltf-binary`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-dsf`
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashxDotappleDotalias
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-voc`
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-m4a`
    - typingsSlinky.fileType.fileTypeStrings.imageSlashapng
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-olympus-orf`
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-sony-arw`
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-adobe-dng`
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-nikon-nef`
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`
    - typingsSlinky.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`
    - typingsSlinky.fileType.fileTypeStrings.`videoSlashx-m4v`
    - typingsSlinky.fileType.fileTypeStrings.videoSlash3gpp2
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-esri-shape`
    - typingsSlinky.fileType.fileTypeStrings.audioSlashaac
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-it`
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-s3m`
    - typingsSlinky.fileType.fileTypeStrings.`audioSlashx-xm`
    - typingsSlinky.fileType.fileTypeStrings.videoSlashMP1S
    - typingsSlinky.fileType.fileTypeStrings.videoSlashMP2P
    - typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp
    - typingsSlinky.fileType.fileTypeStrings.imageSlashavif
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`
    - typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-asar`
    - typingsSlinky.fileType.fileTypeStrings.modelSlashstl
  */
  trait MimeType extends StObject
  object MimeType {
    
    @scala.inline
    def applicationSlashdicom: typingsSlinky.fileType.fileTypeStrings.applicationSlashdicom = "application/dicom".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashdicom]
    
    @scala.inline
    def applicationSlasheps: typingsSlinky.fileType.fileTypeStrings.applicationSlasheps = "application/eps".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlasheps]
    
    @scala.inline
    def applicationSlashepubPlussignzip: typingsSlinky.fileType.fileTypeStrings.applicationSlashepubPlussignzip = "application/epub+zip".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashepubPlussignzip]
    
    @scala.inline
    def applicationSlashgzip: typingsSlinky.fileType.fileTypeStrings.applicationSlashgzip = "application/gzip".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashgzip]
    
    @scala.inline
    def applicationSlashmxf: typingsSlinky.fileType.fileTypeStrings.applicationSlashmxf = "application/mxf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashmxf]
    
    @scala.inline
    def applicationSlashogg: typingsSlinky.fileType.fileTypeStrings.applicationSlashogg = "application/ogg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashogg]
    
    @scala.inline
    def applicationSlashpdf: typingsSlinky.fileType.fileTypeStrings.applicationSlashpdf = "application/pdf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashpdf]
    
    @scala.inline
    def `applicationSlashpgp-encrypted`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashpgp-encrypted` = "application/pgp-encrypted".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`]
    
    @scala.inline
    def applicationSlashpostscript: typingsSlinky.fileType.fileTypeStrings.applicationSlashpostscript = "application/postscript".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashpostscript]
    
    @scala.inline
    def applicationSlashrtf: typingsSlinky.fileType.fileTypeStrings.applicationSlashrtf = "application/rtf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashrtf]
    
    @scala.inline
    def `applicationSlashvndDotms-asf`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-asf` = "application/vnd.ms-asf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`]
    
    @scala.inline
    def `applicationSlashvndDotms-cab-compressed`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed` = "application/vnd.ms-cab-compressed".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`]
    
    @scala.inline
    def `applicationSlashvndDotms-fontobject`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject` = "application/vnd.ms-fontobject".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`]
    
    @scala.inline
    def applicationSlashvndDotoasisDotopendocumentDotpresentation: typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation = "application/vnd.oasis.opendocument.presentation".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation]
    
    @scala.inline
    def applicationSlashvndDotoasisDotopendocumentDotspreadsheet: typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet = "application/vnd.oasis.opendocument.spreadsheet".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet]
    
    @scala.inline
    def applicationSlashvndDotoasisDotopendocumentDottext: typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext = "application/vnd.oasis.opendocument.text".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext]
    
    @scala.inline
    def `applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation` = "application/vnd.openxmlformats-officedocument.presentationml.presentation".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`]
    
    @scala.inline
    def `applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet` = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`]
    
    @scala.inline
    def `applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument` = "application/vnd.openxmlformats-officedocument.wordprocessingml.document".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`]
    
    @scala.inline
    def applicationSlashvndDotsketchupDotskp: typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp = "application/vnd.sketchup.skp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp]
    
    @scala.inline
    def applicationSlashvndDottcpdumpDotpcap: typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap = "application/vnd.tcpdump.pcap".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap]
    
    @scala.inline
    def applicationSlashwasm: typingsSlinky.fileType.fileTypeStrings.applicationSlashwasm = "application/wasm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashwasm]
    
    @scala.inline
    def `applicationSlashx-7z-compressed`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-7z-compressed` = "application/x-7z-compressed".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`]
    
    @scala.inline
    def `applicationSlashx-apache-arrow`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-apache-arrow` = "application/x-apache-arrow".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`]
    
    @scala.inline
    def `applicationSlashx-apple-diskimage`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage` = "application/x-apple-diskimage".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`]
    
    @scala.inline
    def `applicationSlashx-asar`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-asar` = "application/x-asar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-asar`]
    
    @scala.inline
    def `applicationSlashx-blender`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-blender` = "application/x-blender".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-blender`]
    
    @scala.inline
    def `applicationSlashx-bzip2`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-bzip2` = "application/x-bzip2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-bzip2`]
    
    @scala.inline
    def `applicationSlashx-cfb`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-cfb` = "application/x-cfb".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-cfb`]
    
    @scala.inline
    def `applicationSlashx-compress`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-compress` = "application/x-compress".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-compress`]
    
    @scala.inline
    def `applicationSlashx-deb`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-deb` = "application/x-deb".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-deb`]
    
    @scala.inline
    def `applicationSlashx-esri-shape`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-esri-shape` = "application/x-esri-shape".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-esri-shape`]
    
    @scala.inline
    def `applicationSlashx-google-chrome-extension`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension` = "application/x-google-chrome-extension".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`]
    
    @scala.inline
    def `applicationSlashx-indesign`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-indesign` = "application/x-indesign".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-indesign`]
    
    @scala.inline
    def `applicationSlashx-lzh-compressed`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed` = "application/x-lzh-compressed".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`]
    
    @scala.inline
    def `applicationSlashx-lzip`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-lzip` = "application/x-lzip".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-lzip`]
    
    @scala.inline
    def `applicationSlashx-mie`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-mie` = "application/x-mie".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-mie`]
    
    @scala.inline
    def `applicationSlashx-mobipocket-ebook`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook` = "application/x-mobipocket-ebook".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`]
    
    @scala.inline
    def `applicationSlashx-msdownload`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-msdownload` = "application/x-msdownload".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-msdownload`]
    
    @scala.inline
    def `applicationSlashx-nintendo-nes-rom`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom` = "application/x-nintendo-nes-rom".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`]
    
    @scala.inline
    def `applicationSlashx-rar-compressed`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-rar-compressed` = "application/x-rar-compressed".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`]
    
    @scala.inline
    def `applicationSlashx-rpm`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-rpm` = "application/x-rpm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-rpm`]
    
    @scala.inline
    def `applicationSlashx-shockwave-flash`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash` = "application/x-shockwave-flash".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`]
    
    @scala.inline
    def `applicationSlashx-sqlite3`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-sqlite3` = "application/x-sqlite3".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-sqlite3`]
    
    @scala.inline
    def `applicationSlashx-tar`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-tar` = "application/x-tar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-tar`]
    
    @scala.inline
    def `applicationSlashx-unix-archive`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-unix-archive` = "application/x-unix-archive".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-unix-archive`]
    
    @scala.inline
    def `applicationSlashx-xpinstall`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-xpinstall` = "application/x-xpinstall".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-xpinstall`]
    
    @scala.inline
    def `applicationSlashx-xz`: typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-xz` = "application/x-xz".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`applicationSlashx-xz`]
    
    @scala.inline
    def applicationSlashxDotappleDotalias: typingsSlinky.fileType.fileTypeStrings.applicationSlashxDotappleDotalias = "application/x.apple.alias".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashxDotappleDotalias]
    
    @scala.inline
    def applicationSlashxDotmsDotshortcut: typingsSlinky.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut = "application/x.ms.shortcut".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut]
    
    @scala.inline
    def applicationSlashxml: typingsSlinky.fileType.fileTypeStrings.applicationSlashxml = "application/xml".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashxml]
    
    @scala.inline
    def applicationSlashzip: typingsSlinky.fileType.fileTypeStrings.applicationSlashzip = "application/zip".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.applicationSlashzip]
    
    @scala.inline
    def audioSlashaac: typingsSlinky.fileType.fileTypeStrings.audioSlashaac = "audio/aac".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashaac]
    
    @scala.inline
    def audioSlashaiff: typingsSlinky.fileType.fileTypeStrings.audioSlashaiff = "audio/aiff".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashaiff]
    
    @scala.inline
    def audioSlashamr: typingsSlinky.fileType.fileTypeStrings.audioSlashamr = "audio/amr".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashamr]
    
    @scala.inline
    def audioSlashape: typingsSlinky.fileType.fileTypeStrings.audioSlashape = "audio/ape".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashape]
    
    @scala.inline
    def audioSlashmidi: typingsSlinky.fileType.fileTypeStrings.audioSlashmidi = "audio/midi".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashmidi]
    
    @scala.inline
    def audioSlashmp4: typingsSlinky.fileType.fileTypeStrings.audioSlashmp4 = "audio/mp4".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashmp4]
    
    @scala.inline
    def audioSlashmpeg: typingsSlinky.fileType.fileTypeStrings.audioSlashmpeg = "audio/mpeg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashmpeg]
    
    @scala.inline
    def audioSlashogg: typingsSlinky.fileType.fileTypeStrings.audioSlashogg = "audio/ogg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashogg]
    
    @scala.inline
    def audioSlashopus: typingsSlinky.fileType.fileTypeStrings.audioSlashopus = "audio/opus".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashopus]
    
    @scala.inline
    def audioSlashqcelp: typingsSlinky.fileType.fileTypeStrings.audioSlashqcelp = "audio/qcelp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashqcelp]
    
    @scala.inline
    def `audioSlashvndDotdolbyDotdd-raw`: typingsSlinky.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw` = "audio/vnd.dolby.dd-raw".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`]
    
    @scala.inline
    def audioSlashvndDotwave: typingsSlinky.fileType.fileTypeStrings.audioSlashvndDotwave = "audio/vnd.wave".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashvndDotwave]
    
    @scala.inline
    def audioSlashwavpack: typingsSlinky.fileType.fileTypeStrings.audioSlashwavpack = "audio/wavpack".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.audioSlashwavpack]
    
    @scala.inline
    def `audioSlashx-dsf`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-dsf` = "audio/x-dsf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-dsf`]
    
    @scala.inline
    def `audioSlashx-flac`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-flac` = "audio/x-flac".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-flac`]
    
    @scala.inline
    def `audioSlashx-it`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-it` = "audio/x-it".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-it`]
    
    @scala.inline
    def `audioSlashx-m4a`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-m4a` = "audio/x-m4a".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-m4a`]
    
    @scala.inline
    def `audioSlashx-ms-asf`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-ms-asf` = "audio/x-ms-asf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-ms-asf`]
    
    @scala.inline
    def `audioSlashx-musepack`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-musepack` = "audio/x-musepack".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-musepack`]
    
    @scala.inline
    def `audioSlashx-s3m`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-s3m` = "audio/x-s3m".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-s3m`]
    
    @scala.inline
    def `audioSlashx-voc`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-voc` = "audio/x-voc".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-voc`]
    
    @scala.inline
    def `audioSlashx-xm`: typingsSlinky.fileType.fileTypeStrings.`audioSlashx-xm` = "audio/x-xm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`audioSlashx-xm`]
    
    @scala.inline
    def fontSlashotf: typingsSlinky.fileType.fileTypeStrings.fontSlashotf = "font/otf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.fontSlashotf]
    
    @scala.inline
    def fontSlashttf: typingsSlinky.fileType.fileTypeStrings.fontSlashttf = "font/ttf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.fontSlashttf]
    
    @scala.inline
    def fontSlashwoff: typingsSlinky.fileType.fileTypeStrings.fontSlashwoff = "font/woff".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.fontSlashwoff]
    
    @scala.inline
    def fontSlashwoff2: typingsSlinky.fileType.fileTypeStrings.fontSlashwoff2 = "font/woff2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.fontSlashwoff2]
    
    @scala.inline
    def imageSlashapng: typingsSlinky.fileType.fileTypeStrings.imageSlashapng = "image/apng".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashapng]
    
    @scala.inline
    def imageSlashavif: typingsSlinky.fileType.fileTypeStrings.imageSlashavif = "image/avif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashavif]
    
    @scala.inline
    def imageSlashbmp: typingsSlinky.fileType.fileTypeStrings.imageSlashbmp = "image/bmp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashbmp]
    
    @scala.inline
    def imageSlashbpg: typingsSlinky.fileType.fileTypeStrings.imageSlashbpg = "image/bpg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashbpg]
    
    @scala.inline
    def imageSlashflif: typingsSlinky.fileType.fileTypeStrings.imageSlashflif = "image/flif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashflif]
    
    @scala.inline
    def imageSlashgif: typingsSlinky.fileType.fileTypeStrings.imageSlashgif = "image/gif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashgif]
    
    @scala.inline
    def imageSlashheic: typingsSlinky.fileType.fileTypeStrings.imageSlashheic = "image/heic".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashheic]
    
    @scala.inline
    def `imageSlashheic-sequence`: typingsSlinky.fileType.fileTypeStrings.`imageSlashheic-sequence` = "image/heic-sequence".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashheic-sequence`]
    
    @scala.inline
    def imageSlashheif: typingsSlinky.fileType.fileTypeStrings.imageSlashheif = "image/heif".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashheif]
    
    @scala.inline
    def `imageSlashheif-sequence`: typingsSlinky.fileType.fileTypeStrings.`imageSlashheif-sequence` = "image/heif-sequence".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashheif-sequence`]
    
    @scala.inline
    def imageSlashicns: typingsSlinky.fileType.fileTypeStrings.imageSlashicns = "image/icns".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashicns]
    
    @scala.inline
    def imageSlashjp2: typingsSlinky.fileType.fileTypeStrings.imageSlashjp2 = "image/jp2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashjp2]
    
    @scala.inline
    def imageSlashjpeg: typingsSlinky.fileType.fileTypeStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashjpeg]
    
    @scala.inline
    def imageSlashjpm: typingsSlinky.fileType.fileTypeStrings.imageSlashjpm = "image/jpm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashjpm]
    
    @scala.inline
    def imageSlashjpx: typingsSlinky.fileType.fileTypeStrings.imageSlashjpx = "image/jpx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashjpx]
    
    @scala.inline
    def imageSlashktx: typingsSlinky.fileType.fileTypeStrings.imageSlashktx = "image/ktx".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashktx]
    
    @scala.inline
    def imageSlashmj2: typingsSlinky.fileType.fileTypeStrings.imageSlashmj2 = "image/mj2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashmj2]
    
    @scala.inline
    def imageSlashpng: typingsSlinky.fileType.fileTypeStrings.imageSlashpng = "image/png".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashpng]
    
    @scala.inline
    def imageSlashtiff: typingsSlinky.fileType.fileTypeStrings.imageSlashtiff = "image/tiff".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashtiff]
    
    @scala.inline
    def imageSlashvndDotadobeDotphotoshop: typingsSlinky.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop = "image/vnd.adobe.photoshop".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop]
    
    @scala.inline
    def `imageSlashvndDotms-photo`: typingsSlinky.fileType.fileTypeStrings.`imageSlashvndDotms-photo` = "image/vnd.ms-photo".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashvndDotms-photo`]
    
    @scala.inline
    def imageSlashwebp: typingsSlinky.fileType.fileTypeStrings.imageSlashwebp = "image/webp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.imageSlashwebp]
    
    @scala.inline
    def `imageSlashx-adobe-dng`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-adobe-dng` = "image/x-adobe-dng".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-adobe-dng`]
    
    @scala.inline
    def `imageSlashx-canon-cr2`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-canon-cr2` = "image/x-canon-cr2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-canon-cr2`]
    
    @scala.inline
    def `imageSlashx-canon-cr3`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-canon-cr3` = "image/x-canon-cr3".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-canon-cr3`]
    
    @scala.inline
    def `imageSlashx-fujifilm-raf`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf` = "image/x-fujifilm-raf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`]
    
    @scala.inline
    def `imageSlashx-icon`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-icon` = "image/x-icon".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-icon`]
    
    @scala.inline
    def `imageSlashx-nikon-nef`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-nikon-nef` = "image/x-nikon-nef".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-nikon-nef`]
    
    @scala.inline
    def `imageSlashx-olympus-orf`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-olympus-orf` = "image/x-olympus-orf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-olympus-orf`]
    
    @scala.inline
    def `imageSlashx-panasonic-rw2`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2` = "image/x-panasonic-rw2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`]
    
    @scala.inline
    def `imageSlashx-sony-arw`: typingsSlinky.fileType.fileTypeStrings.`imageSlashx-sony-arw` = "image/x-sony-arw".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`imageSlashx-sony-arw`]
    
    @scala.inline
    def `modelSlashgltf-binary`: typingsSlinky.fileType.fileTypeStrings.`modelSlashgltf-binary` = "model/gltf-binary".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`modelSlashgltf-binary`]
    
    @scala.inline
    def modelSlashstl: typingsSlinky.fileType.fileTypeStrings.modelSlashstl = "model/stl".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.modelSlashstl]
    
    @scala.inline
    def textSlashcalendar: typingsSlinky.fileType.fileTypeStrings.textSlashcalendar = "text/calendar".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.textSlashcalendar]
    
    @scala.inline
    def videoSlash3gpp: typingsSlinky.fileType.fileTypeStrings.videoSlash3gpp = "video/3gpp".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlash3gpp]
    
    @scala.inline
    def videoSlash3gpp2: typingsSlinky.fileType.fileTypeStrings.videoSlash3gpp2 = "video/3gpp2".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlash3gpp2]
    
    @scala.inline
    def videoSlashMP1S: typingsSlinky.fileType.fileTypeStrings.videoSlashMP1S = "video/MP1S".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashMP1S]
    
    @scala.inline
    def videoSlashMP2P: typingsSlinky.fileType.fileTypeStrings.videoSlashMP2P = "video/MP2P".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashMP2P]
    
    @scala.inline
    def videoSlashmp2t: typingsSlinky.fileType.fileTypeStrings.videoSlashmp2t = "video/mp2t".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashmp2t]
    
    @scala.inline
    def videoSlashmp4: typingsSlinky.fileType.fileTypeStrings.videoSlashmp4 = "video/mp4".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashmp4]
    
    @scala.inline
    def videoSlashmpeg: typingsSlinky.fileType.fileTypeStrings.videoSlashmpeg = "video/mpeg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashmpeg]
    
    @scala.inline
    def videoSlashogg: typingsSlinky.fileType.fileTypeStrings.videoSlashogg = "video/ogg".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashogg]
    
    @scala.inline
    def videoSlashquicktime: typingsSlinky.fileType.fileTypeStrings.videoSlashquicktime = "video/quicktime".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashquicktime]
    
    @scala.inline
    def videoSlashvndDotavi: typingsSlinky.fileType.fileTypeStrings.videoSlashvndDotavi = "video/vnd.avi".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashvndDotavi]
    
    @scala.inline
    def videoSlashwebm: typingsSlinky.fileType.fileTypeStrings.videoSlashwebm = "video/webm".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.videoSlashwebm]
    
    @scala.inline
    def `videoSlashx-flv`: typingsSlinky.fileType.fileTypeStrings.`videoSlashx-flv` = "video/x-flv".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`videoSlashx-flv`]
    
    @scala.inline
    def `videoSlashx-m4v`: typingsSlinky.fileType.fileTypeStrings.`videoSlashx-m4v` = "video/x-m4v".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`videoSlashx-m4v`]
    
    @scala.inline
    def `videoSlashx-matroska`: typingsSlinky.fileType.fileTypeStrings.`videoSlashx-matroska` = "video/x-matroska".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`videoSlashx-matroska`]
    
    @scala.inline
    def `videoSlashx-ms-asf`: typingsSlinky.fileType.fileTypeStrings.`videoSlashx-ms-asf` = "video/x-ms-asf".asInstanceOf[typingsSlinky.fileType.fileTypeStrings.`videoSlashx-ms-asf`]
  }
  
  /* Inlined node.stream.Readable & { readonly fileType :file-type.file-type/core.FileTypeResult | undefined} */
  @js.native
  trait ReadableStreamWithFileType extends StObject {
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: js.Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    val fileType: js.UndefOr[FileTypeResult] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
}
