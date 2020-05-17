package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapLabel extends js.Object {
  var prefixCls: String = js.native
  var wrapLabel: Boolean = js.native
}

object WrapLabel {
  @scala.inline
  def apply(prefixCls: String, wrapLabel: Boolean): WrapLabel = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], wrapLabel = wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapLabel]
  }
  @scala.inline
  implicit class WrapLabelOps[Self <: WrapLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

