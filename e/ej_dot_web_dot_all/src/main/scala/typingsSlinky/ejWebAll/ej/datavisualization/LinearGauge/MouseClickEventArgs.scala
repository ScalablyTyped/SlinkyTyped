package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseClickEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the context element* @param {Object} args.markerpointer returns the context element
    */
  var context: js.UndefOr[js.Any] = js.native
  /** returns the pointer element.
    */
  var markerPointerElement: js.UndefOr[js.Any] = js.native
  /** returns the pointer Index
    */
  var markerPointerIndex: js.UndefOr[Double] = js.native
  /** returns the value of the pointer.
    */
  var markerPointerValue: js.UndefOr[Double] = js.native
  /** returns the gauge model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  /** returns the startX and startY of the pointer.
    */
  var position: js.UndefOr[js.Any] = js.native
  /** returns the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.native
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.native
  /** returns the pointer style
    */
  var style: js.UndefOr[String] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object MouseClickEventArgs {
  @scala.inline
  def apply(): MouseClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseClickEventArgs]
  }
  @scala.inline
  implicit class MouseClickEventArgsOps[Self <: MouseClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerPointerElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerPointerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointerElement")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerPointerIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointerIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerPointerIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointerIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerPointerValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerPointerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleElement")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

