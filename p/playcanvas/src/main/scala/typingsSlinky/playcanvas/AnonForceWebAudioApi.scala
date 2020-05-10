package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceWebAudioApi extends js.Object {
  var forceWebAudioApi: js.UndefOr[Boolean] = js.native
}

object AnonForceWebAudioApi {
  @scala.inline
  def apply(): AnonForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForceWebAudioApi]
  }
  @scala.inline
  implicit class AnonForceWebAudioApiOps[Self <: AnonForceWebAudioApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceWebAudioApi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceWebAudioApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceWebAudioApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceWebAudioApi")(js.undefined)
        ret
    }
  }
  
}

