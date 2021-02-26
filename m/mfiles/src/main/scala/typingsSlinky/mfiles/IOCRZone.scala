package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFDataType
import typingsSlinky.mfiles.MFiles.MFOCRDimensionUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRZone extends StObject {
  
  var Barcode: Boolean = js.native
  
  def ClearOCROptions(): Unit = js.native
  
  def Clone(): IOCRZone = js.native
  
  var DataType: MFDataType = js.native
  
  var DimensionUnit: MFOCRDimensionUnit = js.native
  
  val HasOCROptions: Boolean = js.native
  
  var Height: Double = js.native
  
  var ID: Double = js.native
  
  var Left: Double = js.native
  
  var Name: String = js.native
  
  var OCROptions: IOCROptions = js.native
  
  def SetOCROptions(OCROptions: IOCROptions): Unit = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
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
  implicit class IOCRZoneMutableBuilder[Self <: IOCRZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarcode(value: Boolean): Self = StObject.set(x, "Barcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOCROptions(value: () => Unit): Self = StObject.set(x, "ClearOCROptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone(value: () => IOCRZone): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUnit(value: MFOCRDimensionUnit): Self = StObject.set(x, "DimensionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOCROptions(value: Boolean): Self = StObject.set(x, "HasOCROptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOCROptions(value: IOCROptions): Self = StObject.set(x, "OCROptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOCROptions(value: IOCROptions => Unit): Self = StObject.set(x, "SetOCROptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
