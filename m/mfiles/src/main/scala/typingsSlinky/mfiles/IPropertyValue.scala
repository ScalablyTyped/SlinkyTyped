package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValue extends js.Object {
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  var TypedValue: ITypedValue = js.native
  var Value: ITypedValue = js.native
  def Clone(): IPropertyValue = js.native
  def CloneFrom(PropertyValue: IPropertyValue): Unit = js.native
  def GetValueAsLocalizedText(): String = js.native
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String = js.native
  def GetValueAsUnlocalizedText(): String = js.native
}

object IPropertyValue {
  @scala.inline
  def apply(
    Clone: () => IPropertyValue,
    CloneFrom: IPropertyValue => Unit,
    GetValueAsLocalizedText: () => String,
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsUnlocalizedText: () => String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  @scala.inline
  implicit class IPropertyValueOps[Self <: IPropertyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IPropertyValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValueAsLocalizedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsLocalizedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsText")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withGetValueAsUnlocalizedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsUnlocalizedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPropertyDef(value: MFBuiltInPropertyDef | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypedValue(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

