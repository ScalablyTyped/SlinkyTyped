package typingsSlinky.jqueryForm

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.jquery.JQuery.AjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFormOptions
  extends AjaxSettings[js.Any] {
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ JQueryFormOptions, Boolean]] = js.native
  var beforeSubmit: js.UndefOr[
    js.Function3[
      /* formData */ js.Array[_], 
      /* $form */ JQuery, 
      /* options */ JQueryFormOptions, 
      Boolean
    ]
  ] = js.native
  var clearForm: js.UndefOr[Boolean] = js.native
  var forceSync: js.UndefOr[Boolean] = js.native
  var iframe: js.UndefOr[Boolean] = js.native
  var iframeSrc: js.UndefOr[String] = js.native
  var iframeTarget: js.UndefOr[js.Any] = js.native
  var replaceTarget: js.UndefOr[Boolean] = js.native
  var resetForm: js.UndefOr[Boolean] = js.native
  var semantic: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Any] = js.native
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ ProgressEvent, 
      /* position */ Double, 
      /* total */ Double, 
      /* percentComplete */ Double, 
      Unit
    ]
  ] = js.native
}

object JQueryFormOptions {
  @scala.inline
  def apply(): JQueryFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFormOptions]
  }
  @scala.inline
  implicit class JQueryFormOptionsOps[Self <: JQueryFormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeSerialize(value: (/* $form */ JQuery, /* options */ JQueryFormOptions) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSerialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSerialize")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSubmit(
      value: (/* formData */ js.Array[_], /* $form */ JQuery, /* options */ JQueryFormOptions) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSubmit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withClearForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearForm")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSync")(js.undefined)
        ret
    }
    @scala.inline
    def withIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withResetForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForm")(js.undefined)
        ret
    }
    @scala.inline
    def withSemantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semantic")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadProgress(
      value: (/* event */ ProgressEvent, /* position */ Double, /* total */ Double, /* percentComplete */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadProgress")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUploadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadProgress")(js.undefined)
        ret
    }
  }
  
}

