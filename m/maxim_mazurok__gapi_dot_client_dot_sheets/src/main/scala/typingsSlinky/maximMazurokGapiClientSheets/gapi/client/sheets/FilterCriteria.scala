package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterCriteria extends StObject {
  
  /** A condition that must be true for values to be shown. (This does not override hidden_values -- if a value is listed there, it will still be hidden.) */
  var condition: js.UndefOr[BooleanCondition] = js.native
  
  /** Values that should be hidden. */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
  
  /** The background fill color to filter by; only cells with this fill color are shown. Mutually exclusive with visible_foreground_color. */
  var visibleBackgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The background fill color to filter by; only cells with this fill color are shown. This field is mutually exclusive with visible_foreground_color, and must be set to an RGB-type
    * color. If visible_background_color is also set, this field takes precedence.
    */
  var visibleBackgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The foreground color to filter by; only cells with this foreground color are shown. Mutually exclusive with visible_background_color. */
  var visibleForegroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The foreground color to filter by; only cells with this foreground color are shown. This field is mutually exclusive with visible_background_color, and must be set to an RGB-type
    * color. If visible_foreground_color is also set, this field takes precedence.
    */
  var visibleForegroundColorStyle: js.UndefOr[ColorStyle] = js.native
}
object FilterCriteria {
  
  @scala.inline
  def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaMutableBuilder[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setHiddenValues(value: js.Array[String]): Self = StObject.set(x, "hiddenValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenValuesUndefined: Self = StObject.set(x, "hiddenValues", js.undefined)
    
    @scala.inline
    def setHiddenValuesVarargs(value: String*): Self = StObject.set(x, "hiddenValues", js.Array(value :_*))
    
    @scala.inline
    def setVisibleBackgroundColor(value: Color): Self = StObject.set(x, "visibleBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "visibleBackgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleBackgroundColorStyleUndefined: Self = StObject.set(x, "visibleBackgroundColorStyle", js.undefined)
    
    @scala.inline
    def setVisibleBackgroundColorUndefined: Self = StObject.set(x, "visibleBackgroundColor", js.undefined)
    
    @scala.inline
    def setVisibleForegroundColor(value: Color): Self = StObject.set(x, "visibleForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleForegroundColorStyle(value: ColorStyle): Self = StObject.set(x, "visibleForegroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleForegroundColorStyleUndefined: Self = StObject.set(x, "visibleForegroundColorStyle", js.undefined)
    
    @scala.inline
    def setVisibleForegroundColorUndefined: Self = StObject.set(x, "visibleForegroundColor", js.undefined)
  }
}
