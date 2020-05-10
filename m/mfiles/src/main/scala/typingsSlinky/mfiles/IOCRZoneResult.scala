package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFOCRDimensionUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCRZoneResult extends js.Object {
  val Confidence: Double = js.native
  val DimensionUnit: MFOCRDimensionUnit = js.native
  val Height: Double = js.native
  val ID: Double = js.native
  val Left: Double = js.native
  val RecognizedOnPage: Double = js.native
  val ResultValue: ITypedValue = js.native
  val Top: Double = js.native
  val Width: Double = js.native
}

object IOCRZoneResult {
  @scala.inline
  def apply(
    Confidence: Double,
    DimensionUnit: MFOCRDimensionUnit,
    Height: Double,
    ID: Double,
    Left: Double,
    RecognizedOnPage: Double,
    ResultValue: ITypedValue,
    Top: Double,
    Width: Double
  ): IOCRZoneResult = {
    val __obj = js.Dynamic.literal(Confidence = Confidence.asInstanceOf[js.Any], DimensionUnit = DimensionUnit.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], RecognizedOnPage = RecognizedOnPage.asInstanceOf[js.Any], ResultValue = ResultValue.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRZoneResult]
  }
  @scala.inline
  implicit class IOCRZoneResultOps[Self <: IOCRZoneResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionUnit(value: MFOCRDimensionUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DimensionUnit")(value.asInstanceOf[js.Any])
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
    def withRecognizedOnPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecognizedOnPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultValue(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultValue")(value.asInstanceOf[js.Any])
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

