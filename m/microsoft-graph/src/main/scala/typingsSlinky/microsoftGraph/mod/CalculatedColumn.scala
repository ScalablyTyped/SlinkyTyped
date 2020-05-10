package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedColumn extends js.Object {
  // For dateTime output types, the format of the value. Must be one of dateOnly or dateTime.
  var format: js.UndefOr[String] = js.native
  // The formula used to compute the value for this column.
  var formula: js.UndefOr[String] = js.native
  // The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text.
  var outputType: js.UndefOr[String] = js.native
}

object CalculatedColumn {
  @scala.inline
  def apply(): CalculatedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculatedColumn]
  }
  @scala.inline
  implicit class CalculatedColumnOps[Self <: CalculatedColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(js.undefined)
        ret
    }
  }
  
}

