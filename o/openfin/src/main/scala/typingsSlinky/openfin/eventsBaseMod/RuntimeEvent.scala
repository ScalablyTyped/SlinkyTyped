package typingsSlinky.openfin.eventsBaseMod

import typingsSlinky.openfin.frameMod.FrameEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.eventsBaseMod.BaseEvent[Topic, Type]
  - typingsSlinky.openfin.eventsBaseMod.ApplicationEvent[Topic, Type]
  - typingsSlinky.openfin.frameMod.FrameEvent[Type]
  - typingsSlinky.openfin.eventsBaseMod.WindowEvent[Topic, Type]
*/
trait RuntimeEvent[Topic, Type] extends js.Object

object RuntimeEvent {
  @scala.inline
  implicit def apply[Topic, Type](value: ApplicationEvent[Topic, Type]): RuntimeEvent[Topic, Type] = value.asInstanceOf[RuntimeEvent[Topic, Type]]
  @scala.inline
  implicit def apply[Topic, Type](value: BaseEvent[Topic, Type]): RuntimeEvent[Topic, Type] = value.asInstanceOf[RuntimeEvent[Topic, Type]]
  @scala.inline
  implicit def apply[Topic, Type](value: FrameEvent[Type]): RuntimeEvent[Topic, Type] = value.asInstanceOf[RuntimeEvent[Topic, Type]]
  @scala.inline
  implicit def apply[Topic, Type](value: WindowEvent[Topic, Type]): RuntimeEvent[Topic, Type] = value.asInstanceOf[RuntimeEvent[Topic, Type]]
}

