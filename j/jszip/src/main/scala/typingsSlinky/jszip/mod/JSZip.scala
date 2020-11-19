package typingsSlinky.jszip.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import typingsSlinky.jszip.anon.JSZipFileOptionsdirtrue
import typingsSlinky.jszip.anon.Promise
import typingsSlinky.jszip.jszipStrings.array
import typingsSlinky.jszip.jszipStrings.arraybuffer
import typingsSlinky.jszip.jszipStrings.base64
import typingsSlinky.jszip.jszipStrings.binarystring
import typingsSlinky.jszip.jszipStrings.blob
import typingsSlinky.jszip.jszipStrings.nodebuffer
import typingsSlinky.jszip.jszipStrings.string
import typingsSlinky.jszip.jszipStrings.text
import typingsSlinky.jszip.jszipStrings.uint8array
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSZip
  extends /**
  * Create JSZip instance
  */
/**
  * Create JSZip instance
  * If no parameters given an empty zip archive will be created
  *
  * @param data Serialized zip archive
  * @param options Description of the serialized zip archive
  */
Instantiable0[JSZip]
     with Instantiable1[/* data */ InputFileFormat, JSZip]
     with Instantiable2[js.UndefOr[/* data */ InputFileFormat], /* options */ JSZipLoadOptions, JSZip] {
  
  def apply(): JSZip = js.native
  
  var external: Promise = js.native
  
  def file(path: String): this.type = js.native
  /**
    * Add a file to the archive
    *
    * @param path Relative path to file
    * @param data Content of the file
    * @param options Optional information about the file
    * @return JSZip object
    */
  def file(path: String, data: String): this.type = js.native
  def file(path: String, data: String, options: JSZipFileOptions): this.type = js.native
  def file(path: String, data: js.Array[Double]): this.type = js.native
  def file(path: String, data: js.Array[Double], options: JSZipFileOptions): this.type = js.native
  def file(
    path: String,
    data: js.Promise[
      js.Array[Double] | js.typedarray.ArrayBuffer | Blob | ReadableStream | String | js.typedarray.Uint8Array
    ]
  ): this.type = js.native
  def file(
    path: String,
    data: js.Promise[
      js.Array[Double] | js.typedarray.ArrayBuffer | Blob | ReadableStream | String | js.typedarray.Uint8Array
    ],
    options: JSZipFileOptions
  ): this.type = js.native
  def file(path: String, data: Null, options: JSZipFileOptionsdirtrue): this.type = js.native
  def file(path: String, data: ReadableStream): this.type = js.native
  def file(path: String, data: ReadableStream, options: JSZipFileOptions): this.type = js.native
  def file(path: String, data: js.typedarray.ArrayBuffer): this.type = js.native
  def file(path: String, data: js.typedarray.ArrayBuffer, options: JSZipFileOptions): this.type = js.native
  def file(path: String, data: Blob): this.type = js.native
  def file(path: String, data: Blob, options: JSZipFileOptions): this.type = js.native
  def file(path: String, data: js.typedarray.Uint8Array): this.type = js.native
  def file(path: String, data: js.typedarray.Uint8Array, options: JSZipFileOptions): this.type = js.native
  /**
    * Get files matching a RegExp from archive
    *
    * @param path RegExp to match
    * @return Return all matching files or an empty array
    */
  def file(path: js.RegExp): js.Array[JSZipObject] = js.native
  /**
    * Get a file from the archive
    *
    * @param Path relative path to file
    * @return File matching path, null if no file found
    */
  @JSName("file")
  def file_Union(path: String): JSZipObject | Null = js.native
  
  var files: StringDictionary[JSZipObject] = js.native
  
  /**
    * Get all files which match the given filter function
    *
    * @param predicate Filter function
    * @return Array of matched elements
    */
  def filter(predicate: js.Function2[/* relativePath */ String, /* file */ JSZipObject, Boolean]): js.Array[JSZipObject] = js.native
  
  /**
    * Returns an new JSZip instance with the given folder as root
    *
    * @param name Name of the folder
    * @return New JSZip object with the given folder as root or null
    */
  def folder(name: String): JSZip | Null = js.native
  /**
    * Returns new JSZip instances with the matching folders as root
    *
    * @param name RegExp to match
    * @return New array of JSZipFile objects which match the RegExp
    */
  def folder(name: js.RegExp): js.Array[JSZipObject] = js.native
  
  /**
    * Call a callback function for each entry at this folder level.
    *
    * @param callback function
    */
  def forEach(callback: js.Function2[/* relativePath */ String, /* file */ JSZipObject, Unit]): Unit = js.native
  
  /**
    * Generates a new archive asynchronously
    *
    * @param options Optional options for the generator
    * @param onUpdate The optional function called on each internal update with the metadata.
    * @return The serialized archive
    */
  def generateAsync(): js.Promise[String] = js.native
  def generateAsync(options: js.UndefOr[scala.Nothing], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_array(options: JSZipGeneratorOptions[array]): js.Promise[js.Array[Double]] = js.native
  @JSName("generateAsync")
  def generateAsync_array(options: JSZipGeneratorOptions[array], onUpdate: OnUpdateCallback): js.Promise[js.Array[Double]] = js.native
  @JSName("generateAsync")
  def generateAsync_arraybuffer(options: JSZipGeneratorOptions[arraybuffer]): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("generateAsync")
  def generateAsync_arraybuffer(options: JSZipGeneratorOptions[arraybuffer], onUpdate: OnUpdateCallback): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("generateAsync")
  def generateAsync_base64(options: JSZipGeneratorOptions[base64]): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_base64(options: JSZipGeneratorOptions[base64], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_binarystring(options: JSZipGeneratorOptions[binarystring]): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_binarystring(options: JSZipGeneratorOptions[binarystring], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_blob(options: JSZipGeneratorOptions[blob]): js.Promise[Blob] = js.native
  @JSName("generateAsync")
  def generateAsync_blob(options: JSZipGeneratorOptions[blob], onUpdate: OnUpdateCallback): js.Promise[Blob] = js.native
  @JSName("generateAsync")
  def generateAsync_nodebuffer(options: JSZipGeneratorOptions[nodebuffer]): js.Promise[Buffer] = js.native
  @JSName("generateAsync")
  def generateAsync_nodebuffer(options: JSZipGeneratorOptions[nodebuffer], onUpdate: OnUpdateCallback): js.Promise[Buffer] = js.native
  @JSName("generateAsync")
  def generateAsync_string(options: JSZipGeneratorOptions[string]): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_string(options: JSZipGeneratorOptions[string], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_text(options: JSZipGeneratorOptions[text]): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_text(options: JSZipGeneratorOptions[text], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("generateAsync")
  def generateAsync_uint8array(options: JSZipGeneratorOptions[uint8array]): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("generateAsync")
  def generateAsync_uint8array(options: JSZipGeneratorOptions[uint8array], onUpdate: OnUpdateCallback): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Generates a new archive asynchronously
    *
    * @param options Optional options for the generator
    * @param onUpdate The optional function called on each internal update with the metadata.
    * @return A Node.js `ReadableStream`
    */
  def generateNodeStream(): ReadableStream = js.native
  def generateNodeStream(options: js.UndefOr[scala.Nothing], onUpdate: OnUpdateCallback): ReadableStream = js.native
  @JSName("generateNodeStream")
  def generateNodeStream_nodebuffer(options: JSZipGeneratorOptions[nodebuffer]): ReadableStream = js.native
  @JSName("generateNodeStream")
  def generateNodeStream_nodebuffer(options: JSZipGeneratorOptions[nodebuffer], onUpdate: OnUpdateCallback): ReadableStream = js.native
  
  /**
    * Deserialize zip file asynchronously
    *
    * @param data Serialized zip file
    * @param options Options for deserializing
    * @return Returns promise
    */
  def loadAsync(data: InputFileFormat): js.Promise[JSZip] = js.native
  def loadAsync(data: InputFileFormat, options: JSZipLoadOptions): js.Promise[JSZip] = js.native
  
  /**
    * Removes the file or folder from the archive
    *
    * @param path Relative path of file or folder
    * @return Returns the JSZip instance
    */
  def remove(path: String): JSZip = js.native
  
  var support: JSZipSupport = js.native
  
  var version: String = js.native
}
