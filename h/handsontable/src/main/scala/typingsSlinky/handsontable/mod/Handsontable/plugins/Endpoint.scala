package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.handsontableStrings.average
import typingsSlinky.handsontable.handsontableStrings.count
import typingsSlinky.handsontable.handsontableStrings.custom
import typingsSlinky.handsontable.handsontableStrings.max
import typingsSlinky.handsontable.handsontableStrings.min
import typingsSlinky.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  var customFunction: (js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ this.type, Double]) | Null = js.native
  var destinationColumn: Double = js.native
  var destinationRow: Double = js.native
  var forceNumeric: Boolean = js.native
  var ranges: js.Array[js.Array[Double]] = js.native
  var readOnly: Boolean = js.native
  var result: Double = js.native
  var reversedRowCoords: Boolean = js.native
  var roundFloat: Boolean = js.native
  var sourceColumn: Double = js.native
  var suppressDataTypeErrors: Boolean = js.native
  var `type`: sum | min | max | count | average | custom = js.native
}

object Endpoint {
  @scala.inline
  def apply(
    destinationColumn: Double,
    destinationRow: Double,
    forceNumeric: Boolean,
    ranges: js.Array[js.Array[Double]],
    readOnly: Boolean,
    result: Double,
    reversedRowCoords: Boolean,
    roundFloat: Boolean,
    sourceColumn: Double,
    suppressDataTypeErrors: Boolean,
    `type`: sum | min | max | count | average | custom
  ): Endpoint = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any], forceNumeric = forceNumeric.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], reversedRowCoords = reversedRowCoords.asInstanceOf[js.Any], roundFloat = roundFloat.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], suppressDataTypeErrors = suppressDataTypeErrors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
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
    def withRanges(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversedRowCoords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedRowCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressDataTypeErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressDataTypeErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: sum | min | max | count | average | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFunction(value: js.ThisFunction1[/* this */ ColumnSummary, Endpoint, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFunction")(null)
        ret
    }
  }
  
}

