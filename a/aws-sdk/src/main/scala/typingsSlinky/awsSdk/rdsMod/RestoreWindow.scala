package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreWindow extends js.Object {
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[js.Date] = js.native
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[js.Date] = js.native
}

object RestoreWindow {
  @scala.inline
  def apply(): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreWindow]
  }
  @scala.inline
  implicit class RestoreWindowOps[Self <: RestoreWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarliestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarliestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestTime")(js.undefined)
        ret
    }
  }
  
}

