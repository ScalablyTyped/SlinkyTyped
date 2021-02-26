package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectFilter extends _Filter {
  
  /**
    * Condition. Can be 'eq' (exactly equal) or 'like' (contains the given string). Defaults to 'like'.
    */
  var condition: js.UndefOr[FilterCondition] = js.native
  
  /**
    * Default value for the select filter.
    */
  var defaultValue: js.UndefOr[String | Double | Boolean] = js.native
  
  /**
    * Options for the filter select.
    */
  var options: SelectFilterOptionsType = js.native
  
  /**
    * Placeholder text to show in the filter.
    */
  var selectText: js.UndefOr[String] = js.native
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Filter type must be 'SelectFilter'
    */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter = js.native
  
  /**
    * Disable the empty option in the dropdown filter.
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}
object SelectFilter {
  
  @scala.inline
  def apply(
    options: SelectFilterOptionsType,
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  ): SelectFilter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilter]
  }
  
  @scala.inline
  implicit class SelectFilterMutableBuilder[Self <: SelectFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: FilterCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double | Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setOptions(value: SelectFilterOptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectText(value: String): Self = StObject.set(x, "selectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectTextUndefined: Self = StObject.set(x, "selectText", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
  }
}
