package typingsSlinky.antd.layoutLayoutMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicProps extends HTMLAttributes[HTMLDivElement] {
  var hasSider: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object BasicProps {
  @scala.inline
  def apply(): BasicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicProps]
  }
  @scala.inline
  implicit class BasicPropsOps[Self <: BasicProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasSider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSider")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
  }
  
}

