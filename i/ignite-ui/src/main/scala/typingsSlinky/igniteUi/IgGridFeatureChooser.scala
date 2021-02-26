package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgGridFeatureChooserMutableBuilder[Self <: IgGridFeatureChooser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setDropDownWidth(value: js.Any): Self = StObject.set(x, "dropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownWidthUndefined: Self = StObject.set(x, "dropDownWidth", js.undefined)
    
    @scala.inline
    def setFeatureChooserDropDownOpened(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpenedEventUIParam) => Unit): Self = StObject.set(x, "featureChooserDropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureChooserDropDownOpenedUndefined: Self = StObject.set(x, "featureChooserDropDownOpened", js.undefined)
    
    @scala.inline
    def setFeatureChooserDropDownOpening(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpeningEventUIParam) => Unit): Self = StObject.set(x, "featureChooserDropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureChooserDropDownOpeningUndefined: Self = StObject.set(x, "featureChooserDropDownOpening", js.undefined)
    
    @scala.inline
    def setFeatureChooserRendered(value: (/* event */ Event, /* ui */ FeatureChooserRenderedEventUIParam) => Unit): Self = StObject.set(x, "featureChooserRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureChooserRenderedUndefined: Self = StObject.set(x, "featureChooserRendered", js.undefined)
    
    @scala.inline
    def setFeatureChooserRendering(value: (/* event */ Event, /* ui */ FeatureChooserRenderingEventUIParam) => Unit): Self = StObject.set(x, "featureChooserRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureChooserRenderingUndefined: Self = StObject.set(x, "featureChooserRendering", js.undefined)
    
    @scala.inline
    def setFeatureToggled(value: (/* event */ Event, /* ui */ FeatureToggledEventUIParam) => Unit): Self = StObject.set(x, "featureToggled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureToggledUndefined: Self = StObject.set(x, "featureToggled", js.undefined)
    
    @scala.inline
    def setFeatureToggling(value: (/* event */ Event, /* ui */ FeatureTogglingEventUIParam) => Unit): Self = StObject.set(x, "featureToggling", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureTogglingUndefined: Self = StObject.set(x, "featureToggling", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMenuToggling(value: (/* event */ Event, /* ui */ MenuTogglingEventUIParam) => Unit): Self = StObject.set(x, "menuToggling", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMenuTogglingUndefined: Self = StObject.set(x, "menuToggling", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
  }
}
