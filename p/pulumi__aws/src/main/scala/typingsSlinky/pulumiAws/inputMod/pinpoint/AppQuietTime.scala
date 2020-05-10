package typingsSlinky.pulumiAws.inputMod.pinpoint

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppQuietTime extends js.Object {
  /**
    * The default end time for quiet time in ISO 8601 format. Required if `start` is set
    */
  var end: js.UndefOr[Input[String]] = js.native
  /**
    * The default start time for quiet time in ISO 8601 format. Required if `end` is set
    */
  var start: js.UndefOr[Input[String]] = js.native
}

object AppQuietTime {
  @scala.inline
  def apply(): AppQuietTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppQuietTime]
  }
  @scala.inline
  implicit class AppQuietTimeOps[Self <: AppQuietTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

