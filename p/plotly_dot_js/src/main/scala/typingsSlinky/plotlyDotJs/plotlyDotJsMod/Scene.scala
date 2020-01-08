package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsBooleans.`false`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.auto
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.closest
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.cube
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.data
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.manual
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.orbit
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.pan
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.turntable
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.zoom
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var annotations: Partial[Annotations] | js.Array[Partial[Annotations]]
  var aspectmode: auto | cube | data | manual
  var aspectratio: Partial[Point]
  var bgcolor: String
  var camera: Partial[Camera]
  var captureevents: Boolean
  var domain: Partial[Domain]
  var dragmode: orbit | turntable | zoom | pan | `false`
  var hovermode: closest | `false`
  var xaxis: Partial[SceneAxis]
  var yaxis: Partial[SceneAxis]
  var zaxis: Partial[SceneAxis]
}

object Scene {
  @scala.inline
  def apply(
    annotations: Partial[Annotations] | js.Array[Partial[Annotations]],
    aspectmode: auto | cube | data | manual,
    aspectratio: Partial[Point],
    bgcolor: String,
    camera: Partial[Camera],
    captureevents: Boolean,
    domain: Partial[Domain],
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: Partial[SceneAxis],
    yaxis: Partial[SceneAxis],
    zaxis: Partial[SceneAxis]
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene]
  }
}

