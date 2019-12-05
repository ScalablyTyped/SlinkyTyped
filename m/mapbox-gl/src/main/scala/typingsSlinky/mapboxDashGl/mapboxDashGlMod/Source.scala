package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.canvas
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.geojson
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.image_
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.raster
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.vector
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas
}

object Source {
  @scala.inline
  def apply(`type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

