package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFilteringEventUIParam extends js.Object {
  /**
  	 * Gets the column index. Applicable only when filtering mode is "simple".
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the column key. Applicable only when filtering mode is "simple".
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the filtering expressions. Filtering expressions could be changed in this event handler and after that data binding is applied. In this way the user could control filtering more easily before applying data-binding.
  	 */
  var newExpressions: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object DataFilteringEventUIParam {
  @scala.inline
  def apply(): DataFilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilteringEventUIParam]
  }
  @scala.inline
  implicit class DataFilteringEventUIParamOps[Self <: DataFilteringEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNewExpressions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExpressions")(js.undefined)
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
  }
  
}

