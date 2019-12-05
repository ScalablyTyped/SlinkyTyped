package typingsSlinky.leafletDashDraw.leafletMod.Draw

import typingsSlinky.leaflet.leafletMod.Class
import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leafletDashDraw.Anon_Subtext
import typingsSlinky.leafletDashDraw.leafletMod.DrawMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Tooltip")
@js.native
class Tooltip protected () extends Class {
  def this(map: DrawMap) = this()
  def dispose(): Unit = js.native
  def removeError(): Tooltip = js.native
  def showAsError(): Tooltip = js.native
  def updateContent(): Tooltip = js.native
  def updateContent(labelText: Anon_Subtext): Tooltip = js.native
  def updatePosition(latlng: LatLng): Tooltip = js.native
}

