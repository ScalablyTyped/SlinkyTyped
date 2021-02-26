package typingsSlinky.reactToastNotifications.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactToastNotifications.mod.ToastConsumerContext
import typingsSlinky.reactToastNotifications.mod.ToastConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastConsumer {
  
  @scala.inline
  def apply(children: ToastConsumerContext => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ToastConsumerProps]))
  }
  
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ToastConsumerProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
