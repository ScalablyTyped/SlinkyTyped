package typingsSlinky.imageType

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("image-type", JSImport.Namespace)
  @js.native
  def apply(input: js.typedarray.Uint8Array): ImageTypeResult | Null = js.native
  /**
  	Detect the image type of a `Buffer`/`Uint8Array`.
  	@param input - Input to examine to determine the file type. It only needs the first `.minimumBytes` bytes.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	import imageType = require('image-type');
  	const buffer = readChunk.sync('unicorn.png', 0, 12);
  	imageType(buffer);
  	//=> {ext: 'png', mime: 'image/png'}
  	// Or from a remote location:
  	import * as http from 'http';
  	const url = 'https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif';
  	http.get(url, response => {
  		response.on('readable', () => {
  			const chunk = response.read(imageType.minimumBytes);
  			response.destroy();
  			console.log(imageType(chunk));
  			//=> {ext: 'gif', mime: 'image/gif'}
  		});
  	});
  	```
  	*/
  @JSImport("image-type", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): ImageTypeResult | Null = js.native
  
  @JSImport("image-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("image-type", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imageType */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imageType */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	*/
  @JSImport("image-type", "minimumBytes")
  @js.native
  val minimumBytes: Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.imageType.imageTypeStrings.jpg
    - typingsSlinky.imageType.imageTypeStrings.png
    - typingsSlinky.imageType.imageTypeStrings.gif
    - typingsSlinky.imageType.imageTypeStrings.webp
    - typingsSlinky.imageType.imageTypeStrings.flif
    - typingsSlinky.imageType.imageTypeStrings.cr2
    - typingsSlinky.imageType.imageTypeStrings.tif
    - typingsSlinky.imageType.imageTypeStrings.bmp
    - typingsSlinky.imageType.imageTypeStrings.jxr
    - typingsSlinky.imageType.imageTypeStrings.psd
    - typingsSlinky.imageType.imageTypeStrings.ico
    - typingsSlinky.imageType.imageTypeStrings.bpg
    - typingsSlinky.imageType.imageTypeStrings.jp2
    - typingsSlinky.imageType.imageTypeStrings.jpm
    - typingsSlinky.imageType.imageTypeStrings.jpx
    - typingsSlinky.imageType.imageTypeStrings.heic
    - typingsSlinky.imageType.imageTypeStrings.cur
    - typingsSlinky.imageType.imageTypeStrings.dcm
  */
  trait ImageType extends StObject
  object ImageType {
    
    @scala.inline
    def bmp: typingsSlinky.imageType.imageTypeStrings.bmp = "bmp".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.bmp]
    
    @scala.inline
    def bpg: typingsSlinky.imageType.imageTypeStrings.bpg = "bpg".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.bpg]
    
    @scala.inline
    def cr2: typingsSlinky.imageType.imageTypeStrings.cr2 = "cr2".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.cr2]
    
    @scala.inline
    def cur: typingsSlinky.imageType.imageTypeStrings.cur = "cur".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.cur]
    
    @scala.inline
    def dcm: typingsSlinky.imageType.imageTypeStrings.dcm = "dcm".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.dcm]
    
    @scala.inline
    def flif: typingsSlinky.imageType.imageTypeStrings.flif = "flif".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.flif]
    
    @scala.inline
    def gif: typingsSlinky.imageType.imageTypeStrings.gif = "gif".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.gif]
    
    @scala.inline
    def heic: typingsSlinky.imageType.imageTypeStrings.heic = "heic".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.heic]
    
    @scala.inline
    def ico: typingsSlinky.imageType.imageTypeStrings.ico = "ico".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.ico]
    
    @scala.inline
    def jp2: typingsSlinky.imageType.imageTypeStrings.jp2 = "jp2".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.jp2]
    
    @scala.inline
    def jpg: typingsSlinky.imageType.imageTypeStrings.jpg = "jpg".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.jpg]
    
    @scala.inline
    def jpm: typingsSlinky.imageType.imageTypeStrings.jpm = "jpm".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.jpm]
    
    @scala.inline
    def jpx: typingsSlinky.imageType.imageTypeStrings.jpx = "jpx".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.jpx]
    
    @scala.inline
    def jxr: typingsSlinky.imageType.imageTypeStrings.jxr = "jxr".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.jxr]
    
    @scala.inline
    def png: typingsSlinky.imageType.imageTypeStrings.png = "png".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.png]
    
    @scala.inline
    def psd: typingsSlinky.imageType.imageTypeStrings.psd = "psd".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.psd]
    
    @scala.inline
    def tif: typingsSlinky.imageType.imageTypeStrings.tif = "tif".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.tif]
    
    @scala.inline
    def webp: typingsSlinky.imageType.imageTypeStrings.webp = "webp".asInstanceOf[typingsSlinky.imageType.imageTypeStrings.webp]
  }
  
  @js.native
  trait ImageTypeResult extends StObject {
    
    /**
    		One of the supported [file types](https://github.com/sindresorhus/image-type#supported-file-types).
    		*/
    var ext: ImageType = js.native
    
    /**
    		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    		*/
    var mime: String = js.native
  }
  object ImageTypeResult {
    
    @scala.inline
    def apply(ext: ImageType, mime: String): ImageTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTypeResult]
    }
    
    @scala.inline
    implicit class ImageTypeResultMutableBuilder[Self <: ImageTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExt(value: ImageType): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
