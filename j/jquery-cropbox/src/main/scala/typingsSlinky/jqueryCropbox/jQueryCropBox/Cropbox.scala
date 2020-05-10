package typingsSlinky.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cropbox extends js.Object {
  /**
    * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
    */
  def drag(options: CropboxDragOptions): Unit = js.native
  /**
    * Generate a Blob with the cropped image (requires HTML5 compliant browser).
    */
  def getBlob(): js.Any = js.native
  /**
    * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
    */
  def getDataURL(): String = js.native
  /**
    * Attach an event handler function for one event on the Crop Box
    */
  def on(event: String, callback: EventCallback): Unit = js.native
  /**
    * Remove the cropbox functionality from the image.
    */
  def remove(): Unit = js.native
  /**
    * Set crop window.
    */
  def setCrop(options: CropboxSetCropOptions): Unit = js.native
  /**
    * Update the cropped result (must call after zoom and drag).
    */
  def update(): Unit = js.native
  /**
    * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
    */
  def zoom(percent: Double): Unit = js.native
  /**
    * Increase image zoom level by one step
    */
  def zoomIn(): Unit = js.native
  /**
    * Decrease image zoom level by one step
    */
  def zoomOut(): Unit = js.native
}

object Cropbox {
  @scala.inline
  def apply(
    drag: CropboxDragOptions => Unit,
    getBlob: () => js.Any,
    getDataURL: () => String,
    on: (String, EventCallback) => Unit,
    remove: () => Unit,
    setCrop: CropboxSetCropOptions => Unit,
    update: () => Unit,
    zoom: Double => Unit,
    zoomIn: () => Unit,
    zoomOut: () => Unit
  ): Cropbox = {
    val __obj = js.Dynamic.literal(drag = js.Any.fromFunction1(drag), getBlob = js.Any.fromFunction0(getBlob), getDataURL = js.Any.fromFunction0(getDataURL), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCrop = js.Any.fromFunction1(setCrop), update = js.Any.fromFunction0(update), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
    __obj.asInstanceOf[Cropbox]
  }
  @scala.inline
  implicit class CropboxOps[Self <: Cropbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrag(value: CropboxDragOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBlob(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, EventCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCrop(value: CropboxSetCropOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZoom(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZoomIn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZoomOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

