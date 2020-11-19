package typingsSlinky.heremaps.H.map.provider

import typingsSlinky.heremaps.H.geo.Rect
import typingsSlinky.heremaps.H.map.ICopyright
import typingsSlinky.heremaps.H.util.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Provider defines an object which works as a database for the map. Providers can exists in different forms they can implement client side object storage or they can request data from
  * the remote service.
  * @property uri {string} - This provider's unique resource identifier, if not provided at construction time it defaults to provider's uid
  * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
  * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
  * @property uid {string} - Provider instance unique identifier, generated at construction time
  */
@js.native
trait Provider_ extends EventTarget {
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method returns the copyrights of the provided content for a certain geographical area at a specified zoom level.
    * @param bounds {H.geo.Rect} - The bounding area for which to retrieve the copyright information
    * @param level {number} - The zoom level for which to retrieve the copyright information
    * @returns {?Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
    */
  def getCopyrights(bounds: Rect, level: Double): js.Array[ICopyright] = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var uid: String = js.native
  
  var uri: String = js.native
}
