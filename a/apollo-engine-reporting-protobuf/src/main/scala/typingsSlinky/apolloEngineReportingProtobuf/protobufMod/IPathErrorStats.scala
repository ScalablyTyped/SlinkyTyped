package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPathErrorStats extends js.Object {
  /** PathErrorStats children */
  var children: js.UndefOr[StringDictionary[IPathErrorStats] | Null] = js.native
  /** PathErrorStats errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.native
  /** PathErrorStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
}

object IPathErrorStats {
  @scala.inline
  def apply(): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathErrorStats]
  }
  @scala.inline
  implicit class IPathErrorStatsOps[Self <: IPathErrorStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: StringDictionary[IPathErrorStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withErrorsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorsCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(null)
        ret
    }
    @scala.inline
    def withRequestsWithErrorsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsWithErrorsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestsWithErrorsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsWithErrorsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestsWithErrorsCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsWithErrorsCount")(null)
        ret
    }
  }
  
}

