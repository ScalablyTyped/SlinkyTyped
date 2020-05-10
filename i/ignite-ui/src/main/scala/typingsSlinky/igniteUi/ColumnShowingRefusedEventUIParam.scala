package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnShowingRefusedEventUIParam extends js.Object {
  /**
  	 * Array of column keys. Has a value only if the column's key is a string.
  	 */
  var columnKeys: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnShowingRefusedEventUIParam {
  @scala.inline
  def apply(): ColumnShowingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnShowingRefusedEventUIParam]
  }
  @scala.inline
  implicit class ColumnShowingRefusedEventUIParamOps[Self <: ColumnShowingRefusedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKeys")(js.undefined)
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

