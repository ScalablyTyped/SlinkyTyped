package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Position
import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Geolocation
@JSImport("rx", "DOM.geolocation")
@js.native
object geolocation extends js.Object {
  
  def getCurrentPosition(): Observable[Position] = js.native
  def getCurrentPosition(geolocationOptions: GeolocationOptions): Observable[Position] = js.native
  
  def watchPosition(): Observable[Position] = js.native
  def watchPosition(geolocationOptions: GeolocationOptions): Observable[Position] = js.native
}
