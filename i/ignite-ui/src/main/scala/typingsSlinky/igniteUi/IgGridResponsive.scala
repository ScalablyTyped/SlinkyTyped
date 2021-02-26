package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridResponsive
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * When windowWidthToRenderVertically is null, determine minimal widths columns can take before
    * forcing vertical rendering for the grid
    *
    */
  var allowedColumnWidthPerType: js.UndefOr[IgGridResponsiveAllowedColumnWidthPerType] = js.native
  
  /**
    * A list of column settings that specifies how columns will react based on the environment the grid is run on.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridResponsiveColumnSetting]] = js.native
  
  /**
    * Enable or disable the responsive vertical rendering for the grid.
    *
    */
  var enableVerticalRendering: js.UndefOr[Boolean] = js.native
  
  /**
    * If this option is set to true the widget will ensure the grid's width is always set to 100%.
    *
    */
  var forceResponsiveGridWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of the properties column when vertical rendering is enabled
    *
    *
    * Valid values:
    * "string" The width in a (%) string
    * "number" The width as a number in percents
    */
  var propertiesColumnWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * If this option is set to true an igResponsiveContainer widget will be attached to the igGrid control which will notify the feature when changes in the width of the container occur.
    *
    */
  var reactOnContainerWidthChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired after a hiding operation is executed on the collection of columns.
    */
  var responsiveColumnHidden: js.UndefOr[ResponsiveColumnHiddenEvent] = js.native
  
  /**
    * Event fired before a hiding operation is executed on a collection of columns.
    */
  var responsiveColumnHiding: js.UndefOr[ResponsiveColumnHidingEvent] = js.native
  
  /**
    * Event fired before a showing operation is executed on a collection of columns.
    */
  var responsiveColumnShowing: js.UndefOr[ResponsiveColumnShowingEvent] = js.native
  
  /**
    * Event fired after a showing operation is executed on the collection of columns.
    */
  var responsiveColumnShown: js.UndefOr[ResponsiveColumnShownEvent] = js.native
  
  /**
    * Event which is fired when the widget detects an environment change.
    */
  var responsiveModeChanged: js.UndefOr[ResponsiveModeChangedEvent] = js.native
  
  /**
    * The recognized types of environments and their configuration.
    *
    */
  var responsiveModes: js.UndefOr[js.Any] = js.native
  
  /**
    * The amount of pixels the window needs to resize with for the grid to respond.
    *
    */
  var responsiveSensitivity: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a template to render a record with in a list-view style layout per mode.
    *
    */
  var singleColumnTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * The width of the values column when vertical rendering is enabled
    *
    *
    * Valid values:
    * "string" The width in a (%) string
    * "number" The width as a number in percents
    */
  var valuesColumnWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * The window's width under which the grid will render its contents vertically.
    *
    *
    * Valid values:
    * "string" The width in a (px) string
    * "number" The width as a number
    * "null" The grid will determine when to render this mode automatically.
    */
  var windowWidthToRenderVertically: js.UndefOr[String | Double] = js.native
}
object IgGridResponsive {
  
  @scala.inline
  def apply(): IgGridResponsive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsive]
  }
  
  @scala.inline
  implicit class IgGridResponsiveMutableBuilder[Self <: IgGridResponsive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedColumnWidthPerType(value: IgGridResponsiveAllowedColumnWidthPerType): Self = StObject.set(x, "allowedColumnWidthPerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedColumnWidthPerTypeUndefined: Self = StObject.set(x, "allowedColumnWidthPerType", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridResponsiveColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridResponsiveColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setEnableVerticalRendering(value: Boolean): Self = StObject.set(x, "enableVerticalRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVerticalRenderingUndefined: Self = StObject.set(x, "enableVerticalRendering", js.undefined)
    
    @scala.inline
    def setForceResponsiveGridWidth(value: Boolean): Self = StObject.set(x, "forceResponsiveGridWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceResponsiveGridWidthUndefined: Self = StObject.set(x, "forceResponsiveGridWidth", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setPropertiesColumnWidth(value: String | Double): Self = StObject.set(x, "propertiesColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesColumnWidthUndefined: Self = StObject.set(x, "propertiesColumnWidth", js.undefined)
    
    @scala.inline
    def setReactOnContainerWidthChanges(value: Boolean): Self = StObject.set(x, "reactOnContainerWidthChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactOnContainerWidthChangesUndefined: Self = StObject.set(x, "reactOnContainerWidthChanges", js.undefined)
    
    @scala.inline
    def setResponsiveColumnHidden(value: (/* event */ Event, /* ui */ ResponsiveColumnHiddenEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponsiveColumnHiddenUndefined: Self = StObject.set(x, "responsiveColumnHidden", js.undefined)
    
    @scala.inline
    def setResponsiveColumnHiding(value: (/* event */ Event, /* ui */ ResponsiveColumnHidingEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponsiveColumnHidingUndefined: Self = StObject.set(x, "responsiveColumnHiding", js.undefined)
    
    @scala.inline
    def setResponsiveColumnShowing(value: (/* event */ Event, /* ui */ ResponsiveColumnShowingEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponsiveColumnShowingUndefined: Self = StObject.set(x, "responsiveColumnShowing", js.undefined)
    
    @scala.inline
    def setResponsiveColumnShown(value: (/* event */ Event, /* ui */ ResponsiveColumnShownEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponsiveColumnShownUndefined: Self = StObject.set(x, "responsiveColumnShown", js.undefined)
    
    @scala.inline
    def setResponsiveModeChanged(value: (/* event */ Event, /* ui */ ResponsiveModeChangedEventUIParam) => Unit): Self = StObject.set(x, "responsiveModeChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponsiveModeChangedUndefined: Self = StObject.set(x, "responsiveModeChanged", js.undefined)
    
    @scala.inline
    def setResponsiveModes(value: js.Any): Self = StObject.set(x, "responsiveModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveModesUndefined: Self = StObject.set(x, "responsiveModes", js.undefined)
    
    @scala.inline
    def setResponsiveSensitivity(value: Double): Self = StObject.set(x, "responsiveSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveSensitivityUndefined: Self = StObject.set(x, "responsiveSensitivity", js.undefined)
    
    @scala.inline
    def setSingleColumnTemplate(value: js.Any): Self = StObject.set(x, "singleColumnTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleColumnTemplateUndefined: Self = StObject.set(x, "singleColumnTemplate", js.undefined)
    
    @scala.inline
    def setValuesColumnWidth(value: String | Double): Self = StObject.set(x, "valuesColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesColumnWidthUndefined: Self = StObject.set(x, "valuesColumnWidth", js.undefined)
    
    @scala.inline
    def setWindowWidthToRenderVertically(value: String | Double): Self = StObject.set(x, "windowWidthToRenderVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidthToRenderVerticallyUndefined: Self = StObject.set(x, "windowWidthToRenderVertically", js.undefined)
  }
}
