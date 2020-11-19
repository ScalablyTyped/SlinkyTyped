package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends js.Object {
  
  var children: js.Array[Module] = js.native
  
  var exports: js.Any = js.native
  
  var filename: String = js.native
  
  var id: String = js.native
  
  var loaded: Boolean = js.native
  
  var parent: Module | Null = js.native
  
  /**
    * @since 11.14.0
    *
    * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
    */
  var path: String = js.native
  
  var paths: js.Array[String] = js.native
  
  /* tslint:disable-next-line:callable-types */
  def require(id: String): js.Any = js.native
  @JSName("require")
  var require_Original: Require = js.native
}
