package typingsSlinky.rsocketCore.rsocketresumabletransportMod

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bufferSize: Double = js.native
  var resumeToken: Encodable = js.native
  var sessionDurationSeconds: Double = js.native
}

object Options {
  @scala.inline
  def apply(bufferSize: Double, resumeToken: Encodable, sessionDurationSeconds: Double): Options = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sessionDurationSeconds = sessionDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeTokenUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeToken(value: Encodable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

