package typingsSlinky.jestSnapshot.anon

import typingsSlinky.prettier.mod.FileInfoOptions
import typingsSlinky.prettier.mod.FileInfoResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofgetFileInfo extends js.Object {
  
  def apply(filePath: String): js.Promise[FileInfoResult] = js.native
  def apply(filePath: String, options: FileInfoOptions): js.Promise[FileInfoResult] = js.native
  
  def sync(filePath: String): FileInfoResult = js.native
  def sync(filePath: String, options: FileInfoOptions): FileInfoResult = js.native
}
