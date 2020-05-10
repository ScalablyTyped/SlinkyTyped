package typingsSlinky.ejWebAll.ej.Signature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** This property is used to set the background color for the signature.
    * @Default {#ffffff}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** This property is used to set the background image for the signature.
    */
  var backgroundImage: js.UndefOr[String] = js.native
  /** Triggers when the stroke is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Enables or disables the Signature textbox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Sets the height of the Signature control.
    * @Default {100%}
    */
  var height: js.UndefOr[String] = js.native
  /** Enables/disables responsive support for the signature control (i.e) maintain the signature drawing during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggered when the pointer is clicked or touched in the signature canvas.
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.native
  /** Triggered when the pointer is moved in the signature canvas.
    */
  var mouseMove: js.UndefOr[js.Function1[/* e */ MouseMoveEventArgs, Unit]] = js.native
  /** Triggered when the pointer is released after click or touch in the signature canvas.
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.native
  /** Allows the type of the image format to be saved when the signature image is saved.
    */
  var saveImageFormat: js.UndefOr[SaveImageFormat | String] = js.native
  /** Allows the signature image to be saved along with its background.
    * @Default {false}
    */
  var saveWithBackground: js.UndefOr[Boolean] = js.native
  /** Enables or disables rounded corner.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Sets the stroke color for the stroke of the signature.
    * @Default {#000000}
    */
  var strokeColor: js.UndefOr[String] = js.native
  /** Sets the stroke width for the stroke of the signature.
    * @Default {2}
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /** Sets the width of the Signature control.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseMove(value: /* e */ MouseMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveImageFormat(value: SaveImageFormat | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveImageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveImageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveImageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveWithBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveWithBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveWithBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveWithBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

