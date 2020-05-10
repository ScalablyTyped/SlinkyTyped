package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import typingsSlinky.mfiles.MFiles.MFContentType
import typingsSlinky.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueForDisplay extends js.Object {
  val ContentType: MFContentType = js.native
  val DataType: MFDataType = js.native
  val DisplayValue: String = js.native
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  val PropertyDefName: String = js.native
  val PropertyValue: IPropertyValue = js.native
  val ReadOnly: Boolean = js.native
  def Clone(): IPropertyValueForDisplay = js.native
}

object IPropertyValueForDisplay {
  @scala.inline
  def apply(
    Clone: () => IPropertyValueForDisplay,
    ContentType: MFContentType,
    DataType: MFDataType,
    DisplayValue: String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    PropertyDefName: String,
    PropertyValue: IPropertyValue,
    ReadOnly: Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName.asInstanceOf[js.Any], PropertyValue = PropertyValue.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
  @scala.inline
  implicit class IPropertyValueForDisplayOps[Self <: IPropertyValueForDisplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyValueForDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContentType(value: MFContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
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
    def withPropertyDef(value: MFBuiltInPropertyDef | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValue(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

