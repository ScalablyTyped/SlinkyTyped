package typingsSlinky.oracleOraclejet.ojchartMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojChartGroupSettableProperties> */
@js.native
trait ojChartGroupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var drilling: js.UndefOr[on | off | inherit] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
}
object ojChartGroupSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojChartGroupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojChartGroupSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojChartGroupSettablePropertiesLenientMutableBuilder[Self <: ojChartGroupSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrilling(value: on | off | inherit): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
  }
}
