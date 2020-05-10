package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import typingsSlinky.mfiles.MFiles.MFDefaultPropertyType
import typingsSlinky.mfiles.MFiles.MFEmailField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaultProperty extends js.Object {
  var DataFixedValueValue: ITypedValue = js.native
  var DataFromEmailAddVLItemIfNotFound: Boolean = js.native
  var DataFromEmailField: MFEmailField = js.native
  var DataFromEmailHeaderAddVLItemIfNotFound: Boolean = js.native
  var DataFromEmailHeaderField: String = js.native
  var DataFromEmailHeaderTreatLookupAsID: Boolean = js.native
  var DataFromEmailTreatLookupAsID: Boolean = js.native
  var DataFromHPDSSXMLAddVLItemIfNotFound: Boolean = js.native
  var DataFromHPDSSXMLPromptName: String = js.native
  var DataFromHPDSSXMLTreatLookupAsID: Boolean = js.native
  var DataFromOCRAddVLItemIfNotFound: Boolean = js.native
  var DataFromOCRTreatLookupAsID: Boolean = js.native
  var DataFromOCRZone: IOCRZone = js.native
  var DataFromXMLAddVLItemIfNotFound: Boolean = js.native
  var DataFromXMLTreatLookupAsID: Boolean = js.native
  var DataFromXMLXPathExpression: String = js.native
  var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
  val Type: MFDefaultPropertyType = js.native
  def Clone(): IDefaultProperty = js.native
  def SetFixedValue(TypedValue: ITypedValue): Unit = js.native
  def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
  def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit = js.native
}

object IDefaultProperty {
  @scala.inline
  def apply(
    Clone: () => IDefaultProperty,
    DataFixedValueValue: ITypedValue,
    DataFromEmailAddVLItemIfNotFound: Boolean,
    DataFromEmailField: MFEmailField,
    DataFromEmailHeaderAddVLItemIfNotFound: Boolean,
    DataFromEmailHeaderField: String,
    DataFromEmailHeaderTreatLookupAsID: Boolean,
    DataFromEmailTreatLookupAsID: Boolean,
    DataFromHPDSSXMLAddVLItemIfNotFound: Boolean,
    DataFromHPDSSXMLPromptName: String,
    DataFromHPDSSXMLTreatLookupAsID: Boolean,
    DataFromOCRAddVLItemIfNotFound: Boolean,
    DataFromOCRTreatLookupAsID: Boolean,
    DataFromOCRZone: IOCRZone,
    DataFromXMLAddVLItemIfNotFound: Boolean,
    DataFromXMLTreatLookupAsID: Boolean,
    DataFromXMLXPathExpression: String,
    PropertyDefID: MFBuiltInPropertyDef | Double,
    SetFixedValue: ITypedValue => Unit,
    SetFromEmail: (MFEmailField, Boolean, Boolean) => Unit,
    SetFromEmailHeader: (String, Boolean, Boolean) => Unit,
    SetFromHPDSSXML: (String, Boolean, Boolean) => Unit,
    SetFromOCR: (IOCRZone, Boolean, Boolean) => Unit,
    SetFromXML: (String, Boolean, Boolean) => Unit,
    Type: MFDefaultPropertyType
  ): IDefaultProperty = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DataFixedValueValue = DataFixedValueValue.asInstanceOf[js.Any], DataFromEmailAddVLItemIfNotFound = DataFromEmailAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailField = DataFromEmailField.asInstanceOf[js.Any], DataFromEmailHeaderAddVLItemIfNotFound = DataFromEmailHeaderAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailHeaderField = DataFromEmailHeaderField.asInstanceOf[js.Any], DataFromEmailHeaderTreatLookupAsID = DataFromEmailHeaderTreatLookupAsID.asInstanceOf[js.Any], DataFromEmailTreatLookupAsID = DataFromEmailTreatLookupAsID.asInstanceOf[js.Any], DataFromHPDSSXMLAddVLItemIfNotFound = DataFromHPDSSXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromHPDSSXMLPromptName = DataFromHPDSSXMLPromptName.asInstanceOf[js.Any], DataFromHPDSSXMLTreatLookupAsID = DataFromHPDSSXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRAddVLItemIfNotFound = DataFromOCRAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromOCRTreatLookupAsID = DataFromOCRTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRZone = DataFromOCRZone.asInstanceOf[js.Any], DataFromXMLAddVLItemIfNotFound = DataFromXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromXMLTreatLookupAsID = DataFromXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromXMLXPathExpression = DataFromXMLXPathExpression.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any], SetFixedValue = js.Any.fromFunction1(SetFixedValue), SetFromEmail = js.Any.fromFunction3(SetFromEmail), SetFromEmailHeader = js.Any.fromFunction3(SetFromEmailHeader), SetFromHPDSSXML = js.Any.fromFunction3(SetFromHPDSSXML), SetFromOCR = js.Any.fromFunction3(SetFromOCR), SetFromXML = js.Any.fromFunction3(SetFromXML), Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaultProperty]
  }
  @scala.inline
  implicit class IDefaultPropertyOps[Self <: IDefaultProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IDefaultProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDataFixedValueValue(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFixedValueValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromEmailAddVLItemIfNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromEmailAddVLItemIfNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromEmailField(value: MFEmailField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromEmailField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromEmailHeaderAddVLItemIfNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromEmailHeaderAddVLItemIfNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromEmailHeaderField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromEmailHeaderField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromEmailHeaderTreatLookupAsID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromEmailHeaderTreatLookupAsID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromEmailTreatLookupAsID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromEmailTreatLookupAsID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromHPDSSXMLAddVLItemIfNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromHPDSSXMLAddVLItemIfNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromHPDSSXMLPromptName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromHPDSSXMLPromptName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromHPDSSXMLTreatLookupAsID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromHPDSSXMLTreatLookupAsID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromOCRAddVLItemIfNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromOCRAddVLItemIfNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromOCRTreatLookupAsID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromOCRTreatLookupAsID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromOCRZone(value: IOCRZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromOCRZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromXMLAddVLItemIfNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromXMLAddVLItemIfNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromXMLTreatLookupAsID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromXMLTreatLookupAsID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFromXMLXPathExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFromXMLXPathExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDefID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFixedValue(value: ITypedValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFixedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFromEmail(value: (MFEmailField, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFromEmail")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFromEmailHeader(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFromEmailHeader")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFromHPDSSXML(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFromHPDSSXML")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFromOCR(value: (IOCRZone, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFromOCR")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFromXML(value: (String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFromXML")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withType(value: MFDefaultPropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

