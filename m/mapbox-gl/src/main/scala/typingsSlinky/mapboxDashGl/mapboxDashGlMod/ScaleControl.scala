package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import typingsSlinky.mapboxDashGl.Anon_MaxWidth
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.imperial
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.metric
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Evented {
  def this(options: Anon_MaxWidth) = this()
  @JSName("setUnit")
  def setUnit_imperial(unit: imperial): Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: metric): Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: nautical): Unit = js.native
}

