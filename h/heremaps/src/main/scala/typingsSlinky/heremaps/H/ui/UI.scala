package typingsSlinky.heremaps.H.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.heremaps.H.Map_
import typingsSlinky.heremaps.H.ui.i18n.Localization
import typingsSlinky.heremaps.H.util.ICapturable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates map UI functionality.
  */
@js.native
trait UI extends ICapturable {
  
  /**
    * This method adds an info bubble to the UI.
    * @param bubble {H.ui.InfoBubble} - the info bubble to be added
    */
  def addBubble(bubble: InfoBubble): Unit = js.native
  
  /**
    * This method appends a control to the UI.
    * @param name {string} - the name under which to register this control
    * @param control {H.ui.Control} - the control to add to this UI
    */
  def addControl(name: String, control: Control): Unit = js.native
  
  /**
    * This method returns a list of info bubble objects which are currently attached to this UI.
    * @returns {Array<H.ui.InfoBubble>} - the list of info bubbles
    */
  def getBubbles(): js.Array[InfoBubble] = js.native
  
  /**
    * This method returns a UI control which was previously registered with the provided name.
    * @param name {string} - the name under which the control was registered.
    * @returns {H.ui.Control} - the control or undefined if the control does not exist.
    */
  def getControl(name: String): Control = js.native
  
  /**
    * This method returns this ui's root element.
    * @returns {Element} - the root element
    */
  def getElement(): Element = js.native
  
  /**
    * Returns the map instance to which this UI was added.
    * @returns {H.Map}
    */
  def getMap(): Map_ = js.native
  
  /**
    * This method returns this UI object's current unit system.
    * @returns {H.ui.UnitSystem} - the current unit system
    */
  def getUnitSystem(): UnitSystem = js.native
  
  /**
    * This method removes a previously added info bubble from the UI.
    * @param bubble {H.ui.InfoBubble} - the info bubble to be removed
    */
  def removeBubble(bubble: InfoBubble): Unit = js.native
  
  /**
    * Removes a previously registered control from the UI object.
    * @param name {string} - the name under which this control was previously registered
    * @returns {H.ui.Control} - the removed control
    */
  def removeControl(name: String): Control = js.native
  
  /**
    * This method sets this UI object's unit system for displaying distances.
    * @param unitSystem {H.ui.UnitSystem} - the unit system to use
    */
  def setUnitSystem(unitSystem: UnitSystem): Unit = js.native
  
  /**
    * Toggles this UI's unit system between {@link H.ui.UnitSystem.METRIC} and {@link H.ui.UnitSystem.IMPERIAL}.
    */
  def toggleUnitSystem(): Unit = js.native
}
object UI {
  
  /**
    * Optional parameters to be passed to the UI constructor.
    * @property unitSystem {H.ui.UnitSystem=} - An optional unit system to be used by the UI, default is H.ui.UnitSystem.METRIC
    * @property zoom {(H.ui.ZoomControl.Options | boolean)=} -
    * @property zoomrectangle {(H.ui.ZoomRectangle.Options | boolean)=} -
    * @property mapsettings {(H.ui.MapSettingsControl.Options | boolean)=} -
    * @property scalebar {(H.ui.ScaleBar.Options | boolean)=} -
    * @property panorama {(H.ui.Pano.Options | boolean)=} -
    * @property distancemeasurement {(H.ui.DistanceMeasurement.Options | boolean)=} -
    * @property locale {(H.ui.i18n.Localization | string)=} - defines language in which UI can be rendered. It can be predefined H.ui.i18n.Localization object with custom translation map,
    * or a string one of following 'en-US', 'de-DE', 'es-ES', 'fi-FI', 'fr-FR', 'it-IT', 'nl-NL', 'pl-PL', 'pt-BR', 'pt-PT', 'ru-RU', 'tr-TR', 'zh-CN'. If not defined ui will use 'en-US'
    * by default
    */
  @js.native
  trait Options extends StObject {
    
    var distancemeasurement: js.UndefOr[typingsSlinky.heremaps.H.ui.DistanceMeasurement.Options | Boolean] = js.native
    
    var locale: js.UndefOr[Localization | String] = js.native
    
    var mapsettings: js.UndefOr[typingsSlinky.heremaps.H.ui.MapSettingsControl.Options | Boolean] = js.native
    
    var panorama: js.UndefOr[typingsSlinky.heremaps.H.ui.Pano.Options | Boolean] = js.native
    
    var scalebar: js.UndefOr[typingsSlinky.heremaps.H.ui.ScaleBar.Options | Boolean] = js.native
    
    var unitSystem: js.UndefOr[UnitSystem] = js.native
    
    var zoom: js.UndefOr[typingsSlinky.heremaps.H.ui.ZoomControl.Options | Boolean] = js.native
    
    var zoomrectangle: js.UndefOr[typingsSlinky.heremaps.H.ui.ZoomRectangle.Options | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistancemeasurement(value: typingsSlinky.heremaps.H.ui.DistanceMeasurement.Options | Boolean): Self = StObject.set(x, "distancemeasurement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistancemeasurementUndefined: Self = StObject.set(x, "distancemeasurement", js.undefined)
      
      @scala.inline
      def setLocale(value: Localization | String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMapsettings(value: typingsSlinky.heremaps.H.ui.MapSettingsControl.Options | Boolean): Self = StObject.set(x, "mapsettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapsettingsUndefined: Self = StObject.set(x, "mapsettings", js.undefined)
      
      @scala.inline
      def setPanorama(value: typingsSlinky.heremaps.H.ui.Pano.Options | Boolean): Self = StObject.set(x, "panorama", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanoramaUndefined: Self = StObject.set(x, "panorama", js.undefined)
      
      @scala.inline
      def setScalebar(value: typingsSlinky.heremaps.H.ui.ScaleBar.Options | Boolean): Self = StObject.set(x, "scalebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalebarUndefined: Self = StObject.set(x, "scalebar", js.undefined)
      
      @scala.inline
      def setUnitSystem(value: UnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
      
      @scala.inline
      def setZoom(value: typingsSlinky.heremaps.H.ui.ZoomControl.Options | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      @scala.inline
      def setZoomrectangle(value: typingsSlinky.heremaps.H.ui.ZoomRectangle.Options | Boolean): Self = StObject.set(x, "zoomrectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomrectangleUndefined: Self = StObject.set(x, "zoomrectangle", js.undefined)
    }
  }
}
