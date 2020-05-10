package typingsSlinky.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleSpecification extends js.Object {
  var durationLabelTypes: js.UndefOr[js.Array[DurationLabelTypeDef]] = js.native
  var durationLabelsLong: js.UndefOr[DurationLabelDef] = js.native
  var durationLabelsShort: js.UndefOr[DurationLabelDef] = js.native
  var durationLabelsStandard: js.UndefOr[DurationLabelDef] = js.native
  var durationPluralKey: js.UndefOr[
    js.Function3[/* token */ String, /* integerValue */ Double, /* decimalValue */ Double, String]
  ] = js.native
  var durationTimeTemplates: js.UndefOr[DurationTimeDef] = js.native
}

object LocaleSpecification {
  @scala.inline
  def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  @scala.inline
  implicit class LocaleSpecificationOps[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationLabelTypes(value: js.Array[DurationLabelTypeDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationLabelTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationLabelsLong(value: DurationLabelDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelsLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationLabelsLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelsLong")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationLabelsShort(value: DurationLabelDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationLabelsShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelsShort")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationLabelsStandard(value: DurationLabelDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelsStandard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationLabelsStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationLabelsStandard")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationPluralKey(value: (/* token */ String, /* integerValue */ Double, /* decimalValue */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationPluralKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDurationPluralKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationPluralKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationTimeTemplates(value: DurationTimeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationTimeTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationTimeTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationTimeTemplates")(js.undefined)
        ret
    }
  }
  
}

