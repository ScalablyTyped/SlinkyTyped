package typingsSlinky.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.End
import typingsSlinky.oracleOraclejet.anon.Value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.milestone
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.normal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.summary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTaskSettableProperties> */
@js.native
trait ojGanttTaskSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var baseline: js.UndefOr[End] = js.native
  
  var borderRadius: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | Null] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelPosition: js.UndefOr[start | innerCenter | innerStart | innerEnd | end | none] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var progress: js.UndefOr[Value] = js.native
  
  var rowId: js.UndefOr[js.Any] = js.native
  
  var shortDesc: js.UndefOr[String | Null] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var `type`: js.UndefOr[normal | milestone | summary | auto] = js.native
}
object ojGanttTaskSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojGanttTaskSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttTaskSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojGanttTaskSettablePropertiesLenientMutableBuilder[Self <: ojGanttTaskSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseline(value: End): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(value: start | innerCenter | innerStart | innerEnd | end | none): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setProgress(value: Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setRowId(value: js.Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    @scala.inline
    def setType(value: normal | milestone | summary | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
