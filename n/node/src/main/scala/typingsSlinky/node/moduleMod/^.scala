package typingsSlinky.node.moduleMod

import typingsSlinky.node.NodeRequire
import typingsSlinky.node.anon.TypeofModule
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("module", JSImport.Namespace)
@js.native
class ^ protected ()
  extends typingsSlinky.node.NodeJS.Module {
  def this(id: String) = this()
  def this(id: String, parent: Module) = this()
}
@JSImport("module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var Module: TypeofModule = js.native
  
  var builtinModules: js.Array[String] = js.native
  
  def createRequire(path: String): NodeRequire = js.native
  def createRequire(path: URL_): NodeRequire = js.native
  
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: String): NodeRequire = js.native
  
  def runMain(): Unit = js.native
  
  def wrap(code: String): String = js.native
}
