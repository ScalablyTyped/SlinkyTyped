package typingsSlinky.plotlyJs.anon

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

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
@js.native
trait PartialSceneAnnotations extends js.Object {
  var annotations: js.UndefOr[PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]] = js.native
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.native
  var aspectratio: js.UndefOr[PartialPoint] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var camera: js.UndefOr[PartialCameraCenter] = js.native
  var captureevents: js.UndefOr[Boolean] = js.native
  var domain: js.UndefOr[PartialDomain] = js.native
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.native
  var hovermode: js.UndefOr[closest | `false`] = js.native
  var xaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
  var yaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
  var zaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
}

object PartialSceneAnnotations {
  @scala.inline
  def apply(): PartialSceneAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAnnotations]
  }
  @scala.inline
  implicit class PartialSceneAnnotationsOps[Self <: PartialSceneAnnotations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectmode(value: auto | cube | data | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectmode")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectratio(value: PartialPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectratio")(js.undefined)
        ret
    }
    @scala.inline
    def withBgcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: PartialCameraCenter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureevents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureevents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureevents")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: PartialDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDragmode(value: orbit | turntable | zoom | pan | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragmode")(js.undefined)
        ret
    }
    @scala.inline
    def withHovermode(value: closest | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovermode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovermode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovermode")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis(value: PartialSceneAxisAutorange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis(value: PartialSceneAxisAutorange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withZaxis(value: PartialSceneAxisAutorange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zaxis")(js.undefined)
        ret
    }
  }
  
}

