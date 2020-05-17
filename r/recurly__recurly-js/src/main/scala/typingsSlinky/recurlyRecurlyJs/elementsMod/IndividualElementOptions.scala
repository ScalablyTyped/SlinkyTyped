package typingsSlinky.recurlyRecurlyJs.elementsMod

import typingsSlinky.recurlyRecurlyJs.anon.CommonElementStyleinvalidFontColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndividualElementOptions extends js.Object {
  var format: js.UndefOr[Boolean] = js.native
  var inputType: js.UndefOr[String] = js.native
  var style: js.UndefOr[CommonElementStyleinvalidFontColor] = js.native
  var tabIndex: js.UndefOr[String] = js.native
}

object IndividualElementOptions {
  @scala.inline
  def apply(): IndividualElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualElementOptions]
  }
  @scala.inline
  implicit class IndividualElementOptionsOps[Self <: IndividualElementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CommonElementStyleinvalidFontColor): Self = {
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
    def withTabIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

