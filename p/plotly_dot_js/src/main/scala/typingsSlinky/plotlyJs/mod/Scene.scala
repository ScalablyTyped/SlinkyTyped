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

@js.native
trait Scene extends js.Object {
  var annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign] = js.native
  var aspectmode: auto | cube | data | manual = js.native
  var aspectratio: PartialPoint = js.native
  var bgcolor: String = js.native
  var camera: PartialCamera = js.native
  var captureevents: Boolean = js.native
  var domain: PartialDomain = js.native
  var dragmode: orbit | turntable | zoom | pan | `false` = js.native
  var hovermode: closest | `false` = js.native
  var xaxis: PartialSceneAxisBackgroundcolor = js.native
  var yaxis: PartialSceneAxisBackgroundcolor = js.native
  var zaxis: PartialSceneAxisBackgroundcolor = js.native
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
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAspectmode(value: auto | cube | data | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAspectratio(value: PartialPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: PartialCamera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptureevents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: PartialDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragmode(value: orbit | turntable | zoom | pan | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHovermode(value: closest | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovermode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis(value: PartialSceneAxisBackgroundcolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis(value: PartialSceneAxisBackgroundcolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZaxis(value: PartialSceneAxisBackgroundcolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zaxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

