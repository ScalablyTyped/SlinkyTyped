package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWrapLabel extends js.Object {
  var prefixCls: String = js.native
  var wrapLabel: Boolean = js.native
}

object AnonWrapLabel {
  @scala.inline
  def apply(prefixCls: String, wrapLabel: Boolean): AnonWrapLabel = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], wrapLabel = wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrapLabel]
  }
  @scala.inline
  implicit class AnonWrapLabelOps[Self <: AnonWrapLabel] (val x: Self) extends AnyVal {
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

