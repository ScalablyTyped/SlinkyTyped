package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.baseui.anon.ChildrenReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FocusOnce {
  
  @JSImport("baseui/modal", "FocusOnce")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FocusOnce.type): Default[tag.type, typingsSlinky.baseui.modalMod.FocusOnce] = new Default[tag.type, typingsSlinky.baseui.modalMod.FocusOnce](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChildrenReactNode): Default[tag.type, typingsSlinky.baseui.modalMod.FocusOnce] = new Default[tag.type, typingsSlinky.baseui.modalMod.FocusOnce](js.Array(this.component, p.asInstanceOf[js.Any]))
}
