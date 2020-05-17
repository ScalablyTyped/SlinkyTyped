package typingsSlinky.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationColumn extends js.Object {
  var destinationColumn: Double = js.native
  var destinationRow: Double = js.native
  var forceNumeric: js.UndefOr[Boolean] = js.native
  var ranges: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var reversedRowCoords: js.UndefOr[Boolean] = js.native
  var roundFloat: js.UndefOr[Boolean] = js.native
  var sourceColumn: js.UndefOr[Double] = js.native
  var suppressDataTypeErrors: js.UndefOr[Boolean] = js.native
}

object DestinationColumn {
  @scala.inline
  def apply(destinationColumn: Double, destinationRow: Double): DestinationColumn = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationColumn]
  }
  @scala.inline
  implicit class DestinationColumnOps[Self <: DestinationColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReversedRowCoords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedRowCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversedRowCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedRowCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressDataTypeErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressDataTypeErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressDataTypeErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressDataTypeErrors")(js.undefined)
        ret
    }
  }
  
}

