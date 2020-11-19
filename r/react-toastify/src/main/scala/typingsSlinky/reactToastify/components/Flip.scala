package typingsSlinky.reactToastify.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactToastify.typesMod.ToastPosition
import typingsSlinky.reactToastify.typesMod.ToastTransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flip {
  
  @JSImport("react-toastify", "Flip")
  @js.native
  object component extends js.Object
  
  def withProps(p: ToastTransitionProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    appear: Boolean,
    done: () => Unit,
    in: Boolean,
    nodeRef: ReactRef[HTMLElement],
    position: ToastPosition | String,
    preventExitTransition: Boolean
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], done = js.Any.fromFunction0(done), in = in.asInstanceOf[js.Any], nodeRef = nodeRef.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventExitTransition = preventExitTransition.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ToastTransitionProps]))
  }
}
