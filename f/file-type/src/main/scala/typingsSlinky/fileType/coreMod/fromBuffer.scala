package typingsSlinky.fileType.coreMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-type/core", "fromBuffer")
@js.native
object fromBuffer extends js.Object {
  
  /**
  	Detect the file type of a `Buffer`, `Uint8Array`, or `ArrayBuffer`.
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	If file access is available, it is recommended to use `.fromFile()` instead.
  	@param buffer - A buffer representing file data. It works best if the buffer contains the entire file, it may work with a smaller portion as well.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  def apply(buffer: Buffer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  def apply(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  def apply(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = js.native
}
