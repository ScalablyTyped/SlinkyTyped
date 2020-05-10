package typingsSlinky.cropperjs.Cropper

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.native
  var autoCrop: js.UndefOr[Boolean] = js.native
  var autoCropArea: js.UndefOr[Double] = js.native
  var background: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var checkCrossOrigin: js.UndefOr[Boolean] = js.native
  var checkOrientation: js.UndefOr[Boolean] = js.native
  var crop: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var cropBoxMovable: js.UndefOr[Boolean] = js.native
  var cropBoxResizable: js.UndefOr[Boolean] = js.native
  var cropend: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var cropmove: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var cropstart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var data: js.UndefOr[Data] = js.native
  var dragMode: js.UndefOr[DragMode] = js.native
  var guides: js.UndefOr[Boolean] = js.native
  var highlight: js.UndefOr[Boolean] = js.native
  var initialAspectRatio: js.UndefOr[Double] = js.native
  var minCanvasHeight: js.UndefOr[Double] = js.native
  var minCanvasWidth: js.UndefOr[Double] = js.native
  var minContainerHeight: js.UndefOr[Double] = js.native
  var minContainerWidth: js.UndefOr[Double] = js.native
  var minCropBoxHeight: js.UndefOr[Double] = js.native
  var minCropBoxWidth: js.UndefOr[Double] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var movable: js.UndefOr[Boolean] = js.native
  var preview: js.UndefOr[Element | js.Array[Element] | NodeList | String] = js.native
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var restore: js.UndefOr[Boolean] = js.native
  var rotatable: js.UndefOr[Boolean] = js.native
  var scalable: js.UndefOr[Boolean] = js.native
  var toggleDragModeOnDblclick: js.UndefOr[Boolean] = js.native
  var viewMode: js.UndefOr[ViewMode] = js.native
  var wheelZoomRatio: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var zoomOnTouch: js.UndefOr[Boolean] = js.native
  var zoomOnWheel: js.UndefOr[Boolean] = js.native
  var zoomable: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCropArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckCrossOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCrossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCrossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
    @scala.inline
    def withCropBoxMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropBoxMovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropBoxMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropBoxMovable")(js.undefined)
        ret
    }
    @scala.inline
    def withCropBoxResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropBoxResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropBoxResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropBoxResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withCropend(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCropend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropend")(js.undefined)
        ret
    }
    @scala.inline
    def withCropmove(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropmove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCropmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropmove")(js.undefined)
        ret
    }
    @scala.inline
    def withCropstart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCropstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropstart")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMode(value: DragMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGuides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guides")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCanvasHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCanvasHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCanvasHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCanvasHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCanvasWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCanvasWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCanvasWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCanvasWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minContainerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinContainerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minContainerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minContainerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minContainerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCropBoxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCropBoxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCropBoxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCropBoxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCropBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCropBoxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCropBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCropBoxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewNodeList(value: NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: Element | js.Array[Element] | NodeList | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withRotatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatable")(js.undefined)
        ret
    }
    @scala.inline
    def withScalable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleDragModeOnDblclick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDragModeOnDblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleDragModeOnDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDragModeOnDblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: ViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelZoomRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelZoomRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelZoomRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelZoomRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOnTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOnTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOnWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(js.undefined)
        ret
    }
  }
  
}

