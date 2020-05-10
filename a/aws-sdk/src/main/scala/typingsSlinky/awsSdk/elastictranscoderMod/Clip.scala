package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clip extends js.Object {
  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  var TimeSpan: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.TimeSpan] = js.native
}

object Clip {
  @scala.inline
  def apply(): Clip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clip]
  }
  @scala.inline
  implicit class ClipOps[Self <: Clip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeSpan(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeSpan")(js.undefined)
        ret
    }
  }
  
}

