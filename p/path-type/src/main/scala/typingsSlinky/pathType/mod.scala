package typingsSlinky.pathType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path-type", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val isDirectory: PathTypeFunction = js.native
  
  val isDirectorySync: PathTypeSyncFunction = js.native
  
  val isFile: PathTypeFunction = js.native
  
  val isFileSync: PathTypeSyncFunction = js.native
  
  val isSymlink: PathTypeFunction = js.native
  
  val isSymlinkSync: PathTypeSyncFunction = js.native
  
  type PathTypeFunction = js.Function1[/* path */ String, js.Promise[Boolean]]
  
  type PathTypeSyncFunction = js.Function1[/* path */ String, Boolean]
}
