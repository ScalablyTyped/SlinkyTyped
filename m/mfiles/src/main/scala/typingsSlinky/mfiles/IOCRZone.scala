package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFDataType
import typingsSlinky.mfiles.MFiles.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCRZone extends js.Object {
  var Barcode: Boolean = js.native
  var DataType: MFDataType = js.native
  var DimensionUnit: MFOCRDimensionUnit = js.native
  val HasOCROptions: Boolean = js.native
  var Height: Double = js.native
  var ID: Double = js.native
  var Left: Double = js.native
  var Name: String = js.native
  var OCROptions: IOCROptions = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def ClearOCROptions(): Unit = js.native
  def Clone(): IOCRZone = js.native
  def SetOCROptions(OCROptions: IOCROptions): Unit = js.native
}

object IOCRZone {
  @scala.inline
  def apply(
    Barcode: Boolean,
    ClearOCROptions: () => Unit,
    Clone: () => IOCRZone,
    DataType: MFDataType,
    DimensionUnit: MFOCRDimensionUnit,
    HasOCROptions: Boolean,
    Height: Double,
    ID: Double,
    Left: Double,
    Name: String,
    OCROptions: IOCROptions,
    SetOCROptions: IOCROptions => Unit,
    Top: Double,
    Width: Double
  ): IOCRZone = {
    val __obj = js.Dynamic.literal(Barcode = Barcode.asInstanceOf[js.Any], ClearOCROptions = js.Any.fromFunction0(ClearOCROptions), Clone = js.Any.fromFunction0(Clone), DataType = DataType.asInstanceOf[js.Any], DimensionUnit = DimensionUnit.asInstanceOf[js.Any], HasOCROptions = HasOCROptions.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OCROptions = OCROptions.asInstanceOf[js.Any], SetOCROptions = js.Any.fromFunction1(SetOCROptions), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRZone]
  }
  @scala.inline
  implicit class IOCRZoneOps[Self <: IOCRZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarcode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Barcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearOCROptions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearOCROptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IOCRZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDataType(value: MFDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionUnit(value: MFOCRDimensionUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DimensionUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasOCROptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasOCROptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOCROptions(value: IOCROptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCROptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetOCROptions(value: IOCROptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetOCROptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

