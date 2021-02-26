package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.days
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hours
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.months
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale extends StObject {
  
  var converter: js.UndefOr[Converters | typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  
  var zoomOrder: js.UndefOr[js.Array[String]] = js.native
}
object Scale {
  
  @scala.inline
  def apply(scale: seconds | minutes | hours | days | weeks | months | quarters | years): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: Converters | typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOrder(value: js.Array[String]): Self = StObject.set(x, "zoomOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOrderUndefined: Self = StObject.set(x, "zoomOrder", js.undefined)
    
    @scala.inline
    def setZoomOrderVarargs(value: String*): Self = StObject.set(x, "zoomOrder", js.Array(value :_*))
  }
}
