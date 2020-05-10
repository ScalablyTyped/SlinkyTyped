package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePropertiesChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current color of the signature.
    */
  var currentColor: js.UndefOr[String] = js.native
  /** Returns the current opacity of the signature.
    */
  var currentOpacity: js.UndefOr[Double] = js.native
  /** Specifies that the color of the signature is changed.
    */
  var isColorChange: js.UndefOr[Boolean] = js.native
  /** Specifies that the opacity of the signature is changed.
    */
  var isOpacityChange: js.UndefOr[Boolean] = js.native
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the page number in which the signature properties is changed.
    */
  var pageID: js.UndefOr[Double] = js.native
  /** Returns the previous color of the signature.
    */
  var previousColor: js.UndefOr[String] = js.native
  /** Returns the previous opacity of the signature.
    */
  var previousOpacity: js.UndefOr[Double] = js.native
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object SignaturePropertiesChangeEventArgs {
  @scala.inline
  def apply(): SignaturePropertiesChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaturePropertiesChangeEventArgs]
  }
  @scala.inline
  implicit class SignaturePropertiesChangeEventArgsOps[Self <: SignaturePropertiesChangeEventArgs] (val x: Self) extends AnyVal {
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
    def withCurrentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsColorChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColorChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsColorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColorChange")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpacityChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpacityChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpacityChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpacityChange")(js.undefined)
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
    def withPageID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageID")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousOpacity")(js.undefined)
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

