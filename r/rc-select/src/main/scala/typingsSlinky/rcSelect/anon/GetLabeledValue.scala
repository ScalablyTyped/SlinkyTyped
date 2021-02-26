package typingsSlinky.rcSelect.anon

import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcSelect.generatorMod.FlattenOptionsType
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLabeledValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] extends StObject {
  
  var getLabeledValue: typingsSlinky.rcSelect.generatorMod.GetLabeledValue[FOT] = js.native
  
  var labelInValue: Boolean = js.native
  
  var optionLabelProp: String = js.native
  
  var options: FOT = js.native
  
  var prevValue: DefaultValueType = js.native
}
object GetLabeledValue {
  
  @scala.inline
  def apply[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */](
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
  implicit class GetLabeledValueMutableBuilder[Self <: GetLabeledValue[_], FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] (val x: Self with GetLabeledValue[FOT]) extends AnyVal {
    
    @scala.inline
    def setGetLabeledValue(value: (/* value */ RawValueType, /* config */ LabelInValue[FOT]) => LabelValueType): Self = StObject.set(x, "getLabeledValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionLabelProp(value: String): Self = StObject.set(x, "optionLabelProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FOT): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValue(value: DefaultValueType): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValueVarargs(value: (LabelValueType | RawValueType)*): Self = StObject.set(x, "prevValue", js.Array(value :_*))
  }
}
