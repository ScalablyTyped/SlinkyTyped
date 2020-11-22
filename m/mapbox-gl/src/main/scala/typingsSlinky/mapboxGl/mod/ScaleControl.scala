package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.anon.MaxWidth
import typingsSlinky.mapboxGl.mapboxGlStrings.imperial
import typingsSlinky.mapboxGl.mapboxGlStrings.metric
import typingsSlinky.mapboxGl.mapboxGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Control {
  def this(options: MaxWidth) = this()
  
  @JSName("setUnit")
  def setUnit_imperial(unit: imperial): Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: metric): Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: nautical): Unit = js.native
}
