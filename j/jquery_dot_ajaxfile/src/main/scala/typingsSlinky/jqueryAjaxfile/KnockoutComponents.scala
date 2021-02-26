package typingsSlinky.jqueryAjaxfile

import org.scalajs.dom.raw.Node
import typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes.Config
import typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes.Definition
import typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes.EmptyConfig
import typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComponents extends StObject {
  
  def clearCachedDefinition(componentName: String): Unit = js.native
  
  var defaultLoader: Loader = js.native
  
  def get(componentName: String, callback: js.Function1[/* definition */ Definition, Unit]): Unit = js.native
  
  def getComponentNameForNode(node: Node): String = js.native
  
  def isRegistered(componentName: String): Boolean = js.native
  
  var loaders: js.Array[Loader] = js.native
  
  // overloads for register method:
  def register(componentName: String, config: Config): Unit = js.native
  def register(componentName: String, config: EmptyConfig): Unit = js.native
  
  def unregister(componentName: String): Unit = js.native
}
