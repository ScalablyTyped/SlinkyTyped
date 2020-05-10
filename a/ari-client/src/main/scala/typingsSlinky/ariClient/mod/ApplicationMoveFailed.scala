package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationMoveFailed extends Event {
  var args: String | js.Array[String] = js.native
  /* Properties */
  var channel: Channel = js.native
  var destination: String = js.native
}

object ApplicationMoveFailed {
  @scala.inline
  def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    destination: String,
    timestamp: js.Date,
    `type`: String
  ): ApplicationMoveFailed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMoveFailed]
  }
  @scala.inline
  implicit class ApplicationMoveFailedOps[Self <: ApplicationMoveFailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

