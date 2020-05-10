package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawBarPointersEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.native
  /** returns the value of the bar pointer.
    */
  var PointerValue: js.UndefOr[Double] = js.native
  /** returns the current Bar pointer element.
    */
  var barElement: js.UndefOr[js.Any] = js.native
  /** returns the index of the bar pointer.
    */
  var barPointerIndex: js.UndefOr[Double] = js.native
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.native
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  /** returns the startX and startY of the pointer
    */
  var position: js.UndefOr[js.Any] = js.native
  /** returns the options of the scale element.
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

object DrawBarPointersEventArgs {
  @scala.inline
  def apply(): DrawBarPointersEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawBarPointersEventArgs]
  }
  @scala.inline
  implicit class DrawBarPointersEventArgsOps[Self <: DrawBarPointersEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBarElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barElement")(js.undefined)
        ret
    }
    @scala.inline
    def withBarPointerIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPointerIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarPointerIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPointerIndex")(js.undefined)
        ret
    }
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

