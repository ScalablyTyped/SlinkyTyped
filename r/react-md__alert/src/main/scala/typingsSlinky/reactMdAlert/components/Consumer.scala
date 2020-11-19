package typingsSlinky.reactMdAlert.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactMdAlert.messageQueueContextMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  @JSImport("@react-md/alert/types/MessageQueueContext", "MessageQueueContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[js.Array[Message]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: js.Array[Message] => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[js.Array[Message]]]))
  }
}
