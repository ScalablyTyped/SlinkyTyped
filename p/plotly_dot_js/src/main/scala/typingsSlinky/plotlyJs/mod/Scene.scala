package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialAnnotationsAlign
import typingsSlinky.plotlyJs.anon.PartialCamera
import typingsSlinky.plotlyJs.anon.PartialDomain
import typingsSlinky.plotlyJs.anon.PartialPoint
import typingsSlinky.plotlyJs.anon.PartialSceneAxisBackgroundcolor
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.closest
import typingsSlinky.plotlyJs.plotlyJsStrings.cube
import typingsSlinky.plotlyJs.plotlyJsStrings.data
import typingsSlinky.plotlyJs.plotlyJsStrings.manual
import typingsSlinky.plotlyJs.plotlyJsStrings.orbit
import typingsSlinky.plotlyJs.plotlyJsStrings.pan
import typingsSlinky.plotlyJs.plotlyJsStrings.turntable
import typingsSlinky.plotlyJs.plotlyJsStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]
  var aspectmode: auto | cube | data | manual
  var aspectratio: PartialPoint
  var bgcolor: String
  var camera: PartialCamera
  var captureevents: Boolean
  var domain: PartialDomain
  var dragmode: orbit | turntable | zoom | pan | `false`
  var hovermode: closest | `false`
  var xaxis: PartialSceneAxisBackgroundcolor
  var yaxis: PartialSceneAxisBackgroundcolor
  var zaxis: PartialSceneAxisBackgroundcolor
}

object Scene {
  @scala.inline
  def apply(
    annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign],
    aspectmode: auto | cube | data | manual,
    aspectratio: PartialPoint,
    bgcolor: String,
    camera: PartialCamera,
    captureevents: Boolean,
    domain: PartialDomain,
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: PartialSceneAxisBackgroundcolor,
    yaxis: PartialSceneAxisBackgroundcolor,
    zaxis: PartialSceneAxisBackgroundcolor
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

