package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewPivotGridOptionsGridOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables/disables rendering of alternating row styles (odd and even rows receive different styling). Note that if a custom jQuery template is set, this has no effect and CSS for the row should be adjusted manually in the template contents.
    */
  var alternateRowStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * Caption text that will be shown above the pivot grid header.
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * Default column width that will be set for all columns.
    *
    * Valid values:
    * "string" The default column width can be set in pixels (px).
    * "number" The default column width can be set as a number.
    */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Enables/disables rendering of ui-state-hover classes when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
    */
  var enableHoverStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of grid features definitions. The supported features are Resizing and Tooltips. Each feature goes with its separate options that are documented for the feature accordingly.
    */
  var features: js.UndefOr[IgPivotViewPivotGridOptionsGridOptionsFeatures] = js.native
  
  /**
    * Headers will be fixed if this option is set to true, and only the grid data will be scrollable.
    */
  var fixedHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial tabIndex attribute that will be set on the container element.
    */
  var tabIndex: js.UndefOr[Double] = js.native
}
object IgPivotViewPivotGridOptionsGridOptions {
  
  @scala.inline
  def apply(): IgPivotViewPivotGridOptionsGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridOptionsGridOptions]
  }
  
  @scala.inline
  implicit class IgPivotViewPivotGridOptionsGridOptionsMutableBuilder[Self <: IgPivotViewPivotGridOptionsGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateRowStyles(value: Boolean): Self = StObject.set(x, "alternateRowStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateRowStylesUndefined: Self = StObject.set(x, "alternateRowStyles", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDefaultColumnWidth(value: String | Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
    
    @scala.inline
    def setEnableHoverStyles(value: Boolean): Self = StObject.set(x, "enableHoverStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHoverStylesUndefined: Self = StObject.set(x, "enableHoverStyles", js.undefined)
    
    @scala.inline
    def setFeatures(value: IgPivotViewPivotGridOptionsGridOptionsFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFixedHeaders(value: Boolean): Self = StObject.set(x, "fixedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeadersUndefined: Self = StObject.set(x, "fixedHeaders", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
