package typingsSlinky.heremaps.global.H.ui

import typingsSlinky.heremaps.H.Map_
import typingsSlinky.heremaps.H.service.DefaultLayers
import typingsSlinky.heremaps.H.service.Platform.MapTypes
import typingsSlinky.heremaps.H.ui.UI.Options
import typingsSlinky.heremaps.H.ui.i18n.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates map UI functionality.
  */
@JSGlobal("H.ui.UI")
@js.native
class UI protected ()
  extends typingsSlinky.heremaps.H.ui.UI {
  /**
    * Constructor
    * @param map {H.Map}
    * @param opt_options {H.ui.UI.Options=}
    */
  def this(map: Map_) = this()
  def this(map: Map_, opt_options: Options) = this()
}
/* static members */
@JSGlobal("H.ui.UI")
@js.native
object UI extends js.Object {
  
  def createDefault(map: Map_, mapTypes: DefaultLayers): typingsSlinky.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: DefaultLayers, opt_locale: String): typingsSlinky.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: DefaultLayers, opt_locale: Localization): typingsSlinky.heremaps.H.ui.UI = js.native
  /**
    * This function creates the default UI including the zoom control,
    * map settings control and scalebar and panorama discovery control.
    * The default controls will be assigned the following values:
    *
    * Zoom control:
    *     id: 'zoom'
    *     alignment: 'right-middle'
    * Map settings control:
    *     id: 'mapsettings'
    *     alignment: 'bottom-right'
    * Scalebar:
    *     id: 'scalebar'
    *     alignment: 'bottom-right'
    * Pano:
    *     id: 'panorama'
    *     alignment: 'top-right'
    *
    * @param map {H.Map} - The map instance to which to append the UI
    * @param mapTypes {Object<H.service.MapType>} - The map types to use
    * @param opt_locale {(H.ui.i18n.Localization | string)=} - the language to use (or a full localization object).
    * @returns {H.ui.UI} - the UI instance configured with the default controls
    */
  def createDefault(map: Map_, mapTypes: MapTypes): typingsSlinky.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: MapTypes, opt_locale: String): typingsSlinky.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: MapTypes, opt_locale: Localization): typingsSlinky.heremaps.H.ui.UI = js.native
}
