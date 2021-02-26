package typingsSlinky.reactSelect.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.transitionsMod.FadeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fade {
  
  @scala.inline
  def apply(component: ReactComponentClass[_], duration: Double, in: Boolean, onExited: () => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[FadeProps]))
  }
  
  @JSImport("react-select/src/animated/transitions", "Fade")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FadeProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
