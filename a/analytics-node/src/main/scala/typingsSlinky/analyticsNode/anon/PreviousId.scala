package typingsSlinky.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousId extends js.Object {
  var integrations: js.UndefOr[typingsSlinky.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
  var previousId: String | Double = js.native
}

object PreviousId {
  @scala.inline
  def apply(previousId: String | Double): PreviousId = {
    val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousId]
  }
  @scala.inline
  implicit class PreviousIdOps[Self <: PreviousId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrations(value: typingsSlinky.analyticsNode.mod.AnalyticsNode.Integrations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrations")(js.undefined)
        ret
    }
  }
  
}

