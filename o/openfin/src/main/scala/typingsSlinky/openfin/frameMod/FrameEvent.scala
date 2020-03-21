package typingsSlinky.openfin.frameMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.frame
import typingsSlinky.openfin.openfinStrings.iframe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ trait FrameEvent[Type] extends WindowEvent[frame, Type] {
  var entityType: iframe
  var frameName: String
}

object FrameEvent {
  @scala.inline
  def apply[Type](entityType: iframe, frameName: String, name: String, topic: frame, `type`: Type, uuid: String): FrameEvent[Type] = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameEvent[Type]]
  }
}

