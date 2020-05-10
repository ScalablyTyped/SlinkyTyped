package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEventPatternResponse extends js.Object {
  /**
    * Indicates whether the event matches the event pattern.
    */
  var Result: js.UndefOr[Boolean] = js.native
}

object TestEventPatternResponse {
  @scala.inline
  def apply(): TestEventPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEventPatternResponse]
  }
  @scala.inline
  implicit class TestEventPatternResponseOps[Self <: TestEventPatternResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(js.undefined)
        ret
    }
  }
  
}

