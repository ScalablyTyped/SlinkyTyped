package typingsSlinky.node.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.NodeRequire
import typingsSlinky.node.moduleMod.Module
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofModule
  extends Instantiable1[/* id */ String, Module]
     with Instantiable2[/* id */ String, /* parent */ Module, Module] {
  
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
