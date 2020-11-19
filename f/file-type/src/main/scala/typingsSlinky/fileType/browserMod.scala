package typingsSlinky.fileType

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-type/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  /**
  	Supported file extensions.
  	*/
  val extensions: Set[typingsSlinky.fileType.coreMod.FileExtension] = js.native
  
  def fromBlob(blob: Blob): js.Promise[js.UndefOr[typingsSlinky.fileType.coreMod.FileTypeResult]] = js.native
  
  /**
  	Detect the file type of a `Buffer`, `Uint8Array`, or `ArrayBuffer`.
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	If file access is available, it is recommended to use `.fromFile()` instead.
  	@param buffer - A buffer representing file data. It works best if the buffer contains the entire file, it may work with a smaller portion as well.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  def fromBuffer(buffer: Buffer): js.Promise[js.UndefOr[typingsSlinky.fileType.coreMod.FileTypeResult]] = js.native
  def fromBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[typingsSlinky.fileType.coreMod.FileTypeResult]] = js.native
  def fromBuffer(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[typingsSlinky.fileType.coreMod.FileTypeResult]] = js.native
  
  def fromStream(stream: ReadableStream[_]): js.Promise[js.UndefOr[typingsSlinky.fileType.coreMod.FileTypeResult]] = js.native
  
  /**
  	Supported MIME types.
  	*/
  val mimeTypes: js.Array[typingsSlinky.fileType.coreMod.MimeType] = js.native
  
  type FileExtension = typingsSlinky.fileType.coreMod.FileExtension
  
  type FileTypeResult = typingsSlinky.fileType.coreMod.FileTypeResult
  
  type MimeType = typingsSlinky.fileType.coreMod.MimeType
}
