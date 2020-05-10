package typingsSlinky.prettyjson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererOptions extends js.Object {
  var dashColor: js.UndefOr[String] = js.native
  var defaultIndentation: js.UndefOr[Double] = js.native
  /**
    * Define behavior for Array objects
    */
  var emptyArrayMsg: js.UndefOr[String] = js.native
    // default: (empty)
  var inlineArrays: js.UndefOr[Boolean] = js.native
  var keysColor: js.UndefOr[String] = js.native
  var noAlign: js.UndefOr[Boolean] = js.native
  /**
    * Color definition
    */
  var noColor: js.UndefOr[Boolean] = js.native
  var numberColor: js.UndefOr[String] = js.native
  var stringColor: js.UndefOr[String] = js.native
}

object RendererOptions {
  @scala.inline
  def apply(): RendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererOptions]
  }
  @scala.inline
  implicit class RendererOptionsOps[Self <: RendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndentation")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyArrayMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyArrayMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyArrayMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyArrayMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeysColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withNoColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStringColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringColor")(js.undefined)
        ret
    }
  }
  
}

