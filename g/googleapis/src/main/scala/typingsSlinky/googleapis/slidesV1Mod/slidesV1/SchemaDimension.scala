package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A magnitude in a single direction in the specified units.
  */
@js.native
trait SchemaDimension extends StObject {
  
  /**
    * The magnitude.
    */
  var magnitude: js.UndefOr[Double] = js.native
  
  /**
    * The units for magnitude.
    */
  var unit: js.UndefOr[String] = js.native
}
object SchemaDimension {
  
  @scala.inline
  def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  @scala.inline
  implicit class SchemaDimensionMutableBuilder[Self <: SchemaDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
