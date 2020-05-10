package typingsSlinky.reactSelect.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.transitionsMod.FadeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fade {
  @JSImport("react-select/src/animated/transitions", "Fade")
  @js.native
  object component extends js.Object
  
  def withProps(p: FadeProps): Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Fade] = new Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Fade](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(component: ReactComponentClass[_], duration: Double, in: Boolean, onExited: () => Unit): Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Fade] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
    new Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Fade](js.Array(this.component, __props.asInstanceOf[FadeProps]))
  }
}

