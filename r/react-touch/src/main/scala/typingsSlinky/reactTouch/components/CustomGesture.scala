package typingsSlinky.reactTouch.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTouch.mod.CustomGestureProps
import typingsSlinky.reactTouch.mod.moves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomGesture {
  
  @scala.inline
  def apply(config: js.Array[moves], onGesture: () => Unit): Default[tag.type, typingsSlinky.reactTouch.mod.CustomGesture] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = js.Any.fromFunction0(onGesture))
    new Default[tag.type, typingsSlinky.reactTouch.mod.CustomGesture](js.Array(this.component, __props.asInstanceOf[CustomGestureProps]))
  }
  
  @JSImport("react-touch", "CustomGesture")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CustomGestureProps): Default[tag.type, typingsSlinky.reactTouch.mod.CustomGesture] = new Default[tag.type, typingsSlinky.reactTouch.mod.CustomGesture](js.Array(this.component, p.asInstanceOf[js.Any]))
}
