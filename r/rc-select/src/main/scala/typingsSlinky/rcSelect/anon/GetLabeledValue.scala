package typingsSlinky.rcSelect.anon

import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcSelect.generatorMod.FlattenOptionsType
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLabeledValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] extends js.Object {
  var getLabeledValue: typingsSlinky.rcSelect.generatorMod.GetLabeledValue[FOT]
  var labelInValue: Boolean
  var optionLabelProp: String
  var options: FOT
  var prevValue: DefaultValueType
}

object GetLabeledValue {
  @scala.inline
  def apply[/* <: typingsSlinky.rcSelect.generatorMod.FlattenOptionsType[js.Array[js.Object]] */ FOT](
    getLabeledValue: (/* value */ RawValueType, /* config */ LabelInValue[FOT]) => LabelValueType,
    labelInValue: Boolean,
    optionLabelProp: String,
    options: FOT,
    prevValue: DefaultValueType
  ): GetLabeledValue[FOT] = {
    val __obj = js.Dynamic.literal(getLabeledValue = js.Any.fromFunction2(getLabeledValue), labelInValue = labelInValue.asInstanceOf[js.Any], optionLabelProp = optionLabelProp.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabeledValue[FOT]]
  }
  @scala.inline
  implicit class GetLabeledValueOps[Self <: GetLabeledValue[_], /* <: typingsSlinky.rcSelect.generatorMod.FlattenOptionsType[js.Array[js.Object]] */ FOT] (val x: Self with GetLabeledValue[FOT]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLabeledValue(value: (/* value */ RawValueType, /* config */ LabelInValue[FOT]) => LabelValueType): Self = this.set("getLabeledValue", js.Any.fromFunction2(value))
    @scala.inline
    def setLabelInValue(value: Boolean): Self = this.set("labelInValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionLabelProp(value: String): Self = this.set("optionLabelProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: FOT): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevValueVarargs(value: (LabelValueType | RawValueType)*): Self = this.set("prevValue", js.Array(value :_*))
    @scala.inline
    def setPrevValue(value: DefaultValueType): Self = this.set("prevValue", value.asInstanceOf[js.Any])
  }
  
}

