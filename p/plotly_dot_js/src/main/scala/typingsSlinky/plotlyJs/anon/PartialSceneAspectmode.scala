package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Annotations
import typingsSlinky.plotlyJs.mod.Camera
import typingsSlinky.plotlyJs.mod.Domain
import typingsSlinky.plotlyJs.mod.Point
import typingsSlinky.plotlyJs.mod.SceneAxis
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
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
trait PartialSceneAspectmode extends js.Object {
  var annotations: js.UndefOr[Partial[Annotations] | js.Array[Partial[Annotations]]] = js.undefined
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.undefined
  var aspectratio: js.UndefOr[Partial[Point]] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var camera: js.UndefOr[Partial[Camera]] = js.undefined
  var captureevents: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[Partial[Domain]] = js.undefined
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.undefined
  var hovermode: js.UndefOr[closest | `false`] = js.undefined
  var xaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
  var yaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
  var zaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
}

object PartialSceneAspectmode {
  @scala.inline
  def apply(
    annotations: Partial[Annotations] | js.Array[Partial[Annotations]] = null,
    aspectmode: auto | cube | data | manual = null,
    aspectratio: Partial[Point] = null,
    bgcolor: String = null,
    camera: Partial[Camera] = null,
    captureevents: js.UndefOr[Boolean] = js.undefined,
    domain: Partial[Domain] = null,
    dragmode: orbit | turntable | zoom | pan | `false` = null,
    hovermode: closest | `false` = null,
    xaxis: Partial[SceneAxis] = null,
    yaxis: Partial[SceneAxis] = null,
    zaxis: Partial[SceneAxis] = null
  ): PartialSceneAspectmode = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (aspectmode != null) __obj.updateDynamic("aspectmode")(aspectmode.asInstanceOf[js.Any])
    if (aspectratio != null) __obj.updateDynamic("aspectratio")(aspectratio.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(captureevents)) __obj.updateDynamic("captureevents")(captureevents.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (dragmode != null) __obj.updateDynamic("dragmode")(dragmode.asInstanceOf[js.Any])
    if (hovermode != null) __obj.updateDynamic("hovermode")(hovermode.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    if (zaxis != null) __obj.updateDynamic("zaxis")(zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSceneAspectmode]
  }
}

