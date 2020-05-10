package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.mapboxGl.mapboxGlStrings.boxzoomcancel
import typingsSlinky.mapboxGl.mapboxGlStrings.boxzoomend
import typingsSlinky.mapboxGl.mapboxGlStrings.boxzoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapBoxZoomEvent extends MapboxEvent[MouseEvent] {
  var boxZoomBounds: LngLatBounds = js.native
  @JSName("type")
  var type_MapBoxZoomEvent: boxzoomstart | boxzoomend | boxzoomcancel = js.native
}

