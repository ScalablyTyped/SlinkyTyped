package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestTiming extends js.Object {
  /**
    * How long it took to run the test process.
    *
    * - In response: present if previously set. - In create/update request: optional
    */
  var testProcessDuration: js.UndefOr[Duration] = js.native
}

object TestTiming {
  @scala.inline
  def apply(): TestTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTiming]
  }
  @scala.inline
  implicit class TestTimingOps[Self <: TestTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestProcessDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testProcessDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestProcessDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testProcessDuration")(js.undefined)
        ret
    }
  }
  
}

