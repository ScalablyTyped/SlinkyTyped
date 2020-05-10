package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleMemberExpandingEventUIParam extends js.Object {
  /**
  	 * Gets the name of axis, which holds the member and the tuple.
  	 */
  var axisName: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the index of the member in the tuple.
  	 */
  var memberIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the index of the tuple in the axis.
  	 */
  var tupleIndex: js.UndefOr[Double] = js.native
}

object TupleMemberExpandingEventUIParam {
  @scala.inline
  def apply(): TupleMemberExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TupleMemberExpandingEventUIParam]
  }
  @scala.inline
  implicit class TupleMemberExpandingEventUIParamOps[Self <: TupleMemberExpandingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisName")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTupleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleIndex")(js.undefined)
        ret
    }
  }
  
}

