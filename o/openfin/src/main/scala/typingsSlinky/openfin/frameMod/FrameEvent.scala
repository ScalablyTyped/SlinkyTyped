package typingsSlinky.openfin.frameMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.frame
import typingsSlinky.openfin.openfinStrings.iframe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ @js.native
trait FrameEvent[Type] extends WindowEvent[frame, Type] {
  var entityType: iframe = js.native
  var frameName: String = js.native
}

object FrameEvent {
  @scala.inline
  def apply[Type](entityType: iframe, frameName: String, name: String, topic: frame, `type`: Type, uuid: String): FrameEvent[Type] = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameEvent[Type]]
  }
  @scala.inline
  implicit class FrameEventOps[Self[`type`] <: FrameEvent[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def withEntityType(value: iframe): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameName(value: String): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

