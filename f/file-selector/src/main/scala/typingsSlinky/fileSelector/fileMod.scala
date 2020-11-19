package typingsSlinky.fileSelector

import typingsSlinky.std.File
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-selector/dist/file", JSImport.Namespace)
@js.native
object fileMod extends js.Object {
  
  val COMMON_MIME_TYPES: Map[String, String] = js.native
  
  def toFileWithPath(file: FileWithPath): FileWithPath = js.native
  def toFileWithPath(file: FileWithPath, path: String): FileWithPath = js.native
  
  @js.native
  trait FileWithPath extends File {
    
    val path: js.UndefOr[String] = js.native
  }
}
