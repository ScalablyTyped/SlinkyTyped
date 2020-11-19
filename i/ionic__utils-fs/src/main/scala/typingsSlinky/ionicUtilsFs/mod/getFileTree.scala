package typingsSlinky.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "getFileTree")
@js.native
object getFileTree extends js.Object {
  
  def apply[RE, DE](dir: String): js.Promise[(RegularFileNode with RE) | (DirectoryNode with DE)] = js.native
  def apply[RE, DE](dir: String, hasOnErrorOnFileNodeOnDirectoryNodeWalkerOptions: GetFileTreeOptions[RE, DE]): js.Promise[(RegularFileNode with RE) | (DirectoryNode with DE)] = js.native
}
