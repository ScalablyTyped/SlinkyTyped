package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewPrefixCls extends js.Object {
  var listPrefixCls: String = js.native
  var listViewPrefixCls: String = js.native
  var prefixCls: String = js.native
}

object ListViewPrefixCls {
  @scala.inline
  def apply(listPrefixCls: String, listViewPrefixCls: String, prefixCls: String): ListViewPrefixCls = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], listViewPrefixCls = listViewPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPrefixCls]
  }
  @scala.inline
  implicit class ListViewPrefixClsOps[Self <: ListViewPrefixCls] (val x: Self) extends AnyVal {
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
    def withListViewPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listViewPrefixCls")(value.asInstanceOf[js.Any])
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

