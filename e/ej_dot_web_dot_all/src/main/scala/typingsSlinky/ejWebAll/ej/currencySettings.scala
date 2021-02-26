package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait currencySettings extends StObject {
  
  var decimals: Double = js.native
  
  var groupSizes: js.Array[Double] = js.native
  
  var pattern: js.Array[String] = js.native
  
  var symbol: String = js.native
}
object currencySettings {
  
  @scala.inline
  def apply(decimals: Double, groupSizes: js.Array[Double], pattern: js.Array[String], symbol: String): currencySettings = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[currencySettings]
  }
  
  @scala.inline
  implicit class currencySettingsMutableBuilder[Self <: currencySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "groupSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizesVarargs(value: Double*): Self = StObject.set(x, "groupSizes", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
