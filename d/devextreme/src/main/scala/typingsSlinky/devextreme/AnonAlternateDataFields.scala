package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlternateDataFields extends js.Object {
  var alternateDataFields: js.UndefOr[Boolean] = js.native
  var customizeChart: js.UndefOr[js.Function] = js.native
  var customizeSeries: js.UndefOr[js.Function] = js.native
  var dataFieldsDisplayMode: js.UndefOr[String] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var processCell: js.UndefOr[js.Function] = js.native
  var putDataFieldsInto: js.UndefOr[String] = js.native
}

object AnonAlternateDataFields {
  @scala.inline
  def apply(): AnonAlternateDataFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlternateDataFields]
  }
  @scala.inline
  implicit class AnonAlternateDataFieldsOps[Self <: AnonAlternateDataFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateDataFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateDataFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateDataFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateDataFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeChart(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomizeChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeChart")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeSeries(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomizeSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFieldsDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFieldsDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFieldsDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFieldsDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCell(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCell")(js.undefined)
        ret
    }
    @scala.inline
    def withPutDataFieldsInto(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putDataFieldsInto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPutDataFieldsInto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putDataFieldsInto")(js.undefined)
        ret
    }
  }
  
}

