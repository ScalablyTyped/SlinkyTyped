package typingsSlinky.esriDashLeaflet.esriDashLeafletMod

import typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FindOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Find` is an abstraction for the find API included in Map Services. It provides a chainable API for
  * building request parameters and executing find tasks.
  */
@JSImport("esri-leaflet", "Find")
@js.native
class Find protected ()
  extends typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Find {
  def this(options: FindOptions) = this()
  def this(options: typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.MapService) = this()
}

@JSImport("esri-leaflet", "find")
@js.native
object find extends js.Object {
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  def apply(options: FindOptions): typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Find = js.native
  def apply(options: typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.MapService): typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Find = js.native
}

