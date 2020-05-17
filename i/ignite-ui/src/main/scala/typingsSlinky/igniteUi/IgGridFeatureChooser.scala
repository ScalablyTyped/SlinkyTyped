package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridFeatureChooser
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.native
  var dropDownWidth: js.UndefOr[js.Any] = js.native
  var featureChooserDropDownOpened: js.UndefOr[FeatureChooserDropDownOpenedEvent] = js.native
  var featureChooserDropDownOpening: js.UndefOr[FeatureChooserDropDownOpeningEvent] = js.native
  var featureChooserRendered: js.UndefOr[FeatureChooserRenderedEvent] = js.native
  var featureChooserRendering: js.UndefOr[FeatureChooserRenderingEvent] = js.native
  var featureToggled: js.UndefOr[FeatureToggledEvent] = js.native
  var featureToggling: js.UndefOr[FeatureTogglingEvent] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  var menuToggling: js.UndefOr[MenuTogglingEvent] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
}

object IgGridFeatureChooser {
  @scala.inline
  def apply(): IgGridFeatureChooser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFeatureChooser]
  }
  @scala.inline
  implicit class IgGridFeatureChooserOps[Self <: IgGridFeatureChooser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserDropDownOpened(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserDropDownOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFeatureChooserDropDownOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserDropDownOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserDropDownOpening(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserDropDownOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFeatureChooserDropDownOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserDropDownOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserRendered(value: (/* event */ Event, /* ui */ FeatureChooserRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFeatureChooserRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserRendering(value: (/* event */ Event, /* ui */ FeatureChooserRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFeatureChooserRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureToggled(value: (/* event */ Event, /* ui */ FeatureToggledEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureToggled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFeatureToggled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureToggling(value: (/* event */ Event, /* ui */ FeatureTogglingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureToggling")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFeatureToggling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureToggling")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuToggling(value: (/* event */ Event, /* ui */ MenuTogglingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuToggling")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMenuToggling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuToggling")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
  }
  
}

