package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/accordion.html#optional-javascript-configuration
@js.native
trait AccordionOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.native
  var callback: js.UndefOr[js.Function0[_]] = js.native
  var content_class: js.UndefOr[String] = js.native
  var multi_expand: js.UndefOr[Boolean] = js.native
  var toggleable: js.UndefOr[Boolean] = js.native
}

object AccordionOptions {
  @scala.inline
  def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  @scala.inline
  implicit class AccordionOptionsOps[Self <: AccordionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_class")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_class")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti_expand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti_expand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_expand")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleable")(js.undefined)
        ret
    }
  }
  
}

