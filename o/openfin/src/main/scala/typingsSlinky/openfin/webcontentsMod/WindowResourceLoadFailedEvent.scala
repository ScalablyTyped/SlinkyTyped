package typingsSlinky.openfin.webcontentsMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowResourceLoadFailedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var errorCode: Double = js.native
  var errorDescription: String = js.native
  var isMainFrame: Boolean = js.native
  var validatedURL: String = js.native
}

object WindowResourceLoadFailedEvent {
  @scala.inline
  def apply[Topic, Type](
    errorCode: Double,
    errorDescription: String,
    isMainFrame: Boolean,
    name: String,
    topic: Topic,
    `type`: Type,
    uuid: String,
    validatedURL: String
  ): WindowResourceLoadFailedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any], isMainFrame = isMainFrame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], validatedURL = validatedURL.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResourceLoadFailedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowResourceLoadFailedEventOps[Self[topic, `type`] <: WindowResourceLoadFailedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withErrorCode(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDescription(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMainFrame(value: Boolean): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMainFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatedURL(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

