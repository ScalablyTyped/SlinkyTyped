package typingsSlinky.heremaps.H.ui

import typingsSlinky.heremaps.H.map.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a menu control allowing to control which map type the map shows, etc.
  */
@js.native
trait MapSettingsControl_ extends Control {
  
  /**
    * Sets the traffic incidents layer to be shown when activating the respective button on the map settings control.
    * @param incidentsLayer {H.map.layer.Layer} - the incidents layer
    */
  def setIncidentsLayer(incidentsLayer: Layer): Unit = js.native
}
