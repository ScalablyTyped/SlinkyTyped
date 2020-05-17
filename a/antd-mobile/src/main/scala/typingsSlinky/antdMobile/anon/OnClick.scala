package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClick extends js.Object {
  var disabled: Boolean = js.native
  var prefixCls: String = js.native
  def onClick(): Unit = js.native
}

object OnClick {
  @scala.inline
  def apply(disabled: Boolean, onClick: () => Unit, prefixCls: String): OnClick = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  @scala.inline
  implicit class OnClickOps[Self <: OnClick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

