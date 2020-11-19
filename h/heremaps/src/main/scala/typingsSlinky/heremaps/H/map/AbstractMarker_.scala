package typingsSlinky.heremaps.H.map

import typingsSlinky.heremaps.H.geo.IPoint
import typingsSlinky.heremaps.H.geo.MultiPoint
import typingsSlinky.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents marker, which offers a means of identifying a location on the map with an icon.
  */
@js.native
trait AbstractMarker_ extends Object {
  
  /**
    * @property draggable
    * @description This property ensure that the marker can receive drag events.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * This method returns this marker's current position.
    * @returns {H.geo.Point} - current marker geo position
    */
  def getGeometry(): Point | MultiPoint = js.native
  
  /**
    * Returns this marker's current icon.
    * @returns {!(H.map.Icon | H.map.DomIcon)}
    */
  def getIcon(): Icon | DomIcon = js.native
  
  /**
    * This method sets the marker's current position.
    * @param position {H.geo.IPoint}
    * @returns {H.map.AbstractMarker} - the marker itself
    */
  def setGeometry(position: IPoint): AbstractMarker = js.native
  def setGeometry(position: MultiPoint): AbstractMarker = js.native
  
  def setIcon(icon: DomIcon): AbstractMarker = js.native
  /**
    * Sets the marker's current icon.
    * @param icon {!(H.map.Icon | H.map.DomIcon)} - The new marker icon
    * @returns {H.map.AbstractMarker} - the marker itself
    */
  def setIcon(icon: Icon): AbstractMarker = js.native
}
