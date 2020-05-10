package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypedValue extends js.Object {
  val DataType: MFDataType = js.native
  val DisplayValue: String = js.native
  var Value: js.Any = js.native
  def Clone(): ITypedValue = js.native
  def CloneFrom(TypedValue: ITypedValue): Unit = js.native
  def CompareTo(TypedValue: ITypedValue): Double = js.native
  def GetLookupID(): Double = js.native
  def GetValueAsLocalizedText(): String = js.native
  def GetValueAsLookup(): ILookup = js.native
  def GetValueAsLookups(): ILookups = js.native
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String = js.native
  def GetValueAsTextWithExpression(Expression: IExpression, Locale: Double): String = js.native
  def GetValueAsTimestamp(): ITimestamp = js.native
  def GetValueAsUnlocalizedText(): String = js.native
  def IsNULL(): Boolean = js.native
  def IsUninitialized(): Boolean = js.native
  def Serialize(): js.Array[Double] = js.native
  def SetValue(DataType: MFDataType, Value: js.Any): Unit = js.native
  def SetValueToLookup(Lookup: ILookup): Unit = js.native
  def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): Unit = js.native
  def SetValueToNULL(DataType: MFDataType): Unit = js.native
  def Unserialize(Bytes: js.Array[Double], ReadFromOldSerializingFormat: Boolean): Unit = js.native
}

object ITypedValue {
  @scala.inline
  def apply(
    Clone: () => ITypedValue,
    CloneFrom: ITypedValue => Unit,
    CompareTo: ITypedValue => Double,
    DataType: MFDataType,
    DisplayValue: String,
    GetLookupID: () => Double,
    GetValueAsLocalizedText: () => String,
    GetValueAsLookup: () => ILookup,
    GetValueAsLookups: () => ILookups,
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsTextWithExpression: (IExpression, Double) => String,
    GetValueAsTimestamp: () => ITimestamp,
    GetValueAsUnlocalizedText: () => String,
    IsNULL: () => Boolean,
    IsUninitialized: () => Boolean,
    Serialize: () => js.Array[Double],
    SetValue: (MFDataType, js.Any) => Unit,
    SetValueToLookup: ILookup => Unit,
    SetValueToMultiSelectLookup: ILookups => Unit,
    SetValueToNULL: MFDataType => Unit,
    Unserialize: (js.Array[Double], Boolean) => Unit,
    Value: js.Any
  ): ITypedValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), CompareTo = js.Any.fromFunction1(CompareTo), DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetLookupID = js.Any.fromFunction0(GetLookupID), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsLookup = js.Any.fromFunction0(GetValueAsLookup), GetValueAsLookups = js.Any.fromFunction0(GetValueAsLookups), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsTextWithExpression = js.Any.fromFunction2(GetValueAsTextWithExpression), GetValueAsTimestamp = js.Any.fromFunction0(GetValueAsTimestamp), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), IsNULL = js.Any.fromFunction0(IsNULL), IsUninitialized = js.Any.fromFunction0(IsUninitialized), Serialize = js.Any.fromFunction0(Serialize), SetValue = js.Any.fromFunction2(SetValue), SetValueToLookup = js.Any.fromFunction1(SetValueToLookup), SetValueToMultiSelectLookup = js.Any.fromFunction1(SetValueToMultiSelectLookup), SetValueToNULL = js.Any.fromFunction1(SetValueToNULL), Unserialize = js.Any.fromFunction2(Unserialize), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypedValue]
  }
  @scala.inline
  implicit class ITypedValueOps[Self <: ITypedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: ITypedValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompareTo(value: ITypedValue => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompareTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataType(value: MFDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLookupID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLookupID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueAsLocalizedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsLocalizedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueAsLookup(value: () => ILookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsLookup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueAsLookups(value: () => ILookups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsLookups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsText")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withGetValueAsTextWithExpression(value: (IExpression, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsTextWithExpression")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetValueAsTimestamp(value: () => ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsTimestamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueAsUnlocalizedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValueAsUnlocalizedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNULL(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNULL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUninitialized(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUninitialized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (MFDataType, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValueToLookup(value: ILookup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValueToLookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValueToMultiSelectLookup(value: ILookups => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValueToMultiSelectLookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValueToNULL(value: MFDataType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValueToNULL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnserialize(value: (js.Array[Double], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unserialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

