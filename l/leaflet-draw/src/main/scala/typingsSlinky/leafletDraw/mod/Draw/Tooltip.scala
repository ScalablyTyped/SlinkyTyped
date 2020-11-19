package typingsSlinky.leafletDraw.mod.Draw

import typingsSlinky.leaflet.mod.Class
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leafletDraw.anon.Subtext
import typingsSlinky.leafletDraw.mod.DrawMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Draw.Tooltip")
@js.native
class Tooltip protected () extends Class {
  def this(map: DrawMap) = this()
  
  def dispose(): Unit = js.native
  
  def removeError(): Tooltip = js.native
  
  def showAsError(): Tooltip = js.native
  
  def updateContent(): Tooltip = js.native
  def updateContent(labelText: Subtext): Tooltip = js.native
  
  def updatePosition(latlng: LatLng_): Tooltip = js.native
}
