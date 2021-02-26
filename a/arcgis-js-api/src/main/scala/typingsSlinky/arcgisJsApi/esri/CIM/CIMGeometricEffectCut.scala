package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectCut
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance from the beginning of a line that the display of the stroke starts. The beginning of the line is determined by the direction in which the line was digitized.
    */
  var beginCut: js.UndefOr[Double] = js.native
  
  /**
    * The distance from the end of a line that the display of the stroke ends. The end of the line is determined by the direction in which the line was digitized.
    */
  var endCut: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the effect should be applied in the opposite manner. This displays the stroke symbol only at the ends of the line and leaves the rest of the line unsymbolized.
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * The distance around the middle of a line that the display of the stroke is interrupted.
    */
  var middleCut: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectCut: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut = js.native
}
object CIMGeometricEffectCut {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut): CIMGeometricEffectCut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectCut]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectCutMutableBuilder[Self <: CIMGeometricEffectCut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCut(value: Double): Self = StObject.set(x, "beginCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCutUndefined: Self = StObject.set(x, "beginCut", js.undefined)
    
    @scala.inline
    def setEndCut(value: Double): Self = StObject.set(x, "endCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCutUndefined: Self = StObject.set(x, "endCut", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setMiddleCut(value: Double): Self = StObject.set(x, "middleCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleCutUndefined: Self = StObject.set(x, "middleCut", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
