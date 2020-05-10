package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEndLoadEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var documentName: String = js.native
  var isMain: Boolean = js.native
}

object WindowEndLoadEvent {
  @scala.inline
  def apply[Topic, Type](documentName: String, isMain: Boolean, name: String, topic: Topic, `type`: Type, uuid: String): WindowEndLoadEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowEndLoadEventOps[Self[topic, `type`] <: WindowEndLoadEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withDocumentName(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMain(value: Boolean): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

