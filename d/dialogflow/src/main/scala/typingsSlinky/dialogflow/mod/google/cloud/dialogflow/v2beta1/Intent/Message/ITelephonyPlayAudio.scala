package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TelephonyPlayAudio. */
@js.native
trait ITelephonyPlayAudio extends js.Object {
  /** TelephonyPlayAudio audioUri */
  var audioUri: js.UndefOr[String | Null] = js.native
}

object ITelephonyPlayAudio {
  @scala.inline
  def apply(): ITelephonyPlayAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITelephonyPlayAudio]
  }
  @scala.inline
  implicit class ITelephonyPlayAudioOps[Self <: ITelephonyPlayAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioUri")(null)
        ret
    }
  }
  
}

