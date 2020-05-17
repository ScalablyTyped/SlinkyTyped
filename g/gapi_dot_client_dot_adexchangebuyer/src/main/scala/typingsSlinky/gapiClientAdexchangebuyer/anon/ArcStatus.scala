package typingsSlinky.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcStatus extends js.Object {
  /** ARC approval status. */
  var arcStatus: js.UndefOr[String] = js.native
  /** External deal ID. */
  var dealId: js.UndefOr[String] = js.native
  /** Publisher ID. */
  var webPropertyId: js.UndefOr[Double] = js.native
}

object ArcStatus {
  @scala.inline
  def apply(): ArcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcStatus]
  }
  @scala.inline
  implicit class ArcStatusOps[Self <: ArcStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDealId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

