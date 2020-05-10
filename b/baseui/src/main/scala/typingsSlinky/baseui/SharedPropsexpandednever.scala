package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/accordion.SharedProps & {  $expanded ? :never} */
@js.native
trait SharedPropsexpandednever extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[String] = js.native
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean] = js.native
  @JSName("$size")
  var $size: js.UndefOr[String | Double] = js.native
}

object SharedPropsexpandednever {
  @scala.inline
  def apply(): SharedPropsexpandednever = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPropsexpandednever]
  }
  @scala.inline
  implicit class SharedPropsexpandedneverOps[Self <: SharedPropsexpandednever] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$color")(js.undefined)
        ret
    }
    @scala.inline
    def with$disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$disabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(js.undefined)
        ret
    }
    @scala.inline
    def with$expanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$expanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expanded")(js.undefined)
        ret
    }
    @scala.inline
    def with$size(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.undefined)
        ret
    }
  }
  
}

