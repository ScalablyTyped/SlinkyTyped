package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnValueChange extends js.Object {
  var prefixCls: String = js.native
  def onValueChange(): Unit = js.native
}

object OnValueChange {
  @scala.inline
  def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  @scala.inline
  implicit class OnValueChangeOps[Self <: OnValueChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnValueChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction0(value))
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

