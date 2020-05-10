package typingsSlinky.fineUploader.coreMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormOptions extends js.Object {
  /**
    * If Fine Uploader is able to attach to a form, this value takes the place of the base `autoUpload` option
    *
    * @default `false`
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /**
    * This can be the ID of the <form> or a reference to the <form> element
    *
    * @default `'qq-form'`
    */
  var element: js.UndefOr[String | HTMLElement] = js.native
  /**
    * Set this to `false` if you do not want Fine Uploader to intercept attempts to submit your form.
    *
    * By default, Fine Uploader will intercept submit attempts and instead upload all submitted files, including data from your form in each upload request
    *
    * @default `true`
    */
  var interceptSubmit: js.UndefOr[Boolean] = js.native
}

object FormOptions {
  @scala.inline
  def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  @scala.inline
  implicit class FormOptionsOps[Self <: FormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptSubmit")(js.undefined)
        ret
    }
  }
  
}

