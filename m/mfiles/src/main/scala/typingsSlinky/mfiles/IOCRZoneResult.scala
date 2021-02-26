package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFOCRDimensionUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRZoneResult extends StObject {
  
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
  implicit class IOCRZoneResultMutableBuilder[Self <: IOCRZoneResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUnit(value: MFOCRDimensionUnit): Self = StObject.set(x, "DimensionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognizedOnPage(value: Double): Self = StObject.set(x, "RecognizedOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultValue(value: ITypedValue): Self = StObject.set(x, "ResultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
