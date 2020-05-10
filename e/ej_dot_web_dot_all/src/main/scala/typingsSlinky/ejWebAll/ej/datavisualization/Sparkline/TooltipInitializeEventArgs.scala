package typingsSlinky.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipInitializeEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip
    */
  var currentText: js.UndefOr[String] = js.native
  /** X Location of the trackball tooltip in pixels
    */
  var locationX: js.UndefOr[js.Any] = js.native
  /** Y Location of the trackball tooltip in pixels
    */
  var locationY: js.UndefOr[js.Any] = js.native
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Index of the point for which trackball tooltip is displayed
    */
  var pointIndex: js.UndefOr[Double] = js.native
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object TooltipInitializeEventArgs {
  @scala.inline
  def apply(): TooltipInitializeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipInitializeEventArgs]
  }
  @scala.inline
  implicit class TooltipInitializeEventArgsOps[Self <: TooltipInitializeEventArgs] (val x: Self) extends AnyVal {
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
    def withCurrentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationX")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationY")(js.undefined)
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
    def withPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

