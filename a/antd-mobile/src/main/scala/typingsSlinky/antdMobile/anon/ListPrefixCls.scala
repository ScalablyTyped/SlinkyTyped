package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrefixCls extends js.Object {
  var listPrefixCls: String = js.native
  var prefixCls: String = js.native
}

object ListPrefixCls {
  @scala.inline
  def apply(listPrefixCls: String, prefixCls: String): ListPrefixCls = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrefixCls]
  }
  @scala.inline
  implicit class ListPrefixClsOps[Self <: ListPrefixCls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrefixCls")(value.asInstanceOf[js.Any])
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

