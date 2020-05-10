package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IgGridResponsiveOps[Self <: IgGridResponsive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedColumnWidthPerType(value: IgGridResponsiveAllowedColumnWidthPerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedColumnWidthPerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedColumnWidthPerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedColumnWidthPerType")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridResponsiveColumnSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVerticalRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVerticalRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVerticalRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVerticalRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withForceResponsiveGridWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResponsiveGridWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceResponsiveGridWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResponsiveGridWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertiesColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertiesColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withReactOnContainerWidthChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactOnContainerWidthChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactOnContainerWidthChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactOnContainerWidthChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveColumnHidden(value: (/* event */ Event_, /* ui */ ResponsiveColumnHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponsiveColumnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveColumnHiding(value: (/* event */ Event_, /* ui */ ResponsiveColumnHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponsiveColumnHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveColumnShowing(value: (/* event */ Event_, /* ui */ ResponsiveColumnShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponsiveColumnShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveColumnShown(value: (/* event */ Event_, /* ui */ ResponsiveColumnShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponsiveColumnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveColumnShown")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveModeChanged(value: (/* event */ Event_, /* ui */ ResponsiveModeChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveModeChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponsiveModeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveModeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveModes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveModes")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleColumnTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColumnTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleColumnTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColumnTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowWidthToRenderVertically(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidthToRenderVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowWidthToRenderVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidthToRenderVertically")(js.undefined)
        ret
    }
  }
  
}

