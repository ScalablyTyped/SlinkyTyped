package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPlumb {
  
  @JSImport("jsplumb", "jsPlumb.addClass")
  @js.native
  def addClass(el: NodeListOf[Element with Node], clazz: String): Unit = js.native
  
  @JSImport("jsplumb", "jsPlumb.extend")
  @js.native
  def extend(target: js.Object, source: js.Object): js.Any = js.native
  
  @JSImport("jsplumb", "jsPlumb.getInstance")
  @js.native
  def getInstance(): jsPlumbInstance = js.native
  @JSImport("jsplumb", "jsPlumb.getInstance")
  @js.native
  def getInstance(_defaults: Defaults): jsPlumbInstance = js.native
  
  @JSImport("jsplumb", "jsPlumb.off")
  @js.native
  def off(el: js.Any, event: String, handler: js.Function): Unit = js.native
  
  @JSImport("jsplumb", "jsPlumb.on")
  @js.native
  def on(el: js.Any, event: String, delegateSelector: String, handler: js.Function): Unit = js.native
  @JSImport("jsplumb", "jsPlumb.on")
  @js.native
  def on(el: js.Any, event: String, handler: js.Function): Unit = js.native
  
  @JSImport("jsplumb", "jsPlumb.removeClass")
  @js.native
  def removeClass(el: NodeListOf[Element with Node], clazz: String): Unit = js.native
  
  @JSImport("jsplumb", "jsPlumb.revalidate")
  @js.native
  def revalidate(el: Element): Unit = js.native
}
