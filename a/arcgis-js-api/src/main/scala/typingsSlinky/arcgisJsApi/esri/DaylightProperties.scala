package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.date
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.season
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightProperties extends WidgetProperties {
  /**
    * Controls whether the widget displays a date or a season picker. When the date picker is set, the user selects the date from a calendar. The season picker allows the user to choose a season from a drop-down list. Each season uses a fixed date corresponding to the Northern equinoxes and solstices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#dateOrSeason)
    *
    * @default "date"
    */
  var dateOrSeason: js.UndefOr[season | date] = js.native
  /**
    * Controls the speed of the daytime and date animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.native
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  /**
    * The view model for the Daylight widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DaylightViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#viewModel)
    */
  var viewModel: js.UndefOr[DaylightViewModelProperties] = js.native
  /**
    * This property provides the ability to display or hide the individual elements of the widget. Play buttons, shadow toggle button, date picker and timezone selector can be displayed or hidden by setting their corresponding properties to `true` or `false`. By default, all the elements are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    */
  var visibleElements: js.UndefOr[DaylightVisibleElements] = js.native
}

object DaylightProperties {
  @scala.inline
  def apply(): DaylightProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightProperties]
  }
  @scala.inline
  implicit class DaylightPropertiesOps[Self <: DaylightProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateOrSeason(value: season | date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOrSeason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateOrSeason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOrSeason")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaySpeedMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playSpeedMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaySpeedMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playSpeedMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: DaylightViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleElements(value: DaylightVisibleElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(js.undefined)
        ret
    }
  }
  
}

