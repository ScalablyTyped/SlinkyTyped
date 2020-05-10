package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMessage extends js.Object {
  /**
    * The default body of the message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The default message variables to use in the message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}

object DefaultMessage {
  @scala.inline
  def apply(): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMessage]
  }
  @scala.inline
  implicit class DefaultMessageOps[Self <: DefaultMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
  }
  
}

