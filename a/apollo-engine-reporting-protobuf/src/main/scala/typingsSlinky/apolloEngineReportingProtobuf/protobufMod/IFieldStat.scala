package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldStat extends js.Object {
  /** FieldStat count */
  var count: js.UndefOr[Double | Null] = js.native
  /** FieldStat errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.native
  /** FieldStat latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** FieldStat name */
  var name: js.UndefOr[String | Null] = js.native
  /** FieldStat requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
  /** FieldStat returnType */
  var returnType: js.UndefOr[String | Null] = js.native
}

object IFieldStat {
  @scala.inline
  def apply(): IFieldStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldStat]
  }
  @scala.inline
  implicit class IFieldStatOps[Self <: IFieldStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(null)
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
    def withLatencyCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLatencyCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyCount")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
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
    @scala.inline
    def withReturnType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(null)
        ret
    }
  }
  
}

