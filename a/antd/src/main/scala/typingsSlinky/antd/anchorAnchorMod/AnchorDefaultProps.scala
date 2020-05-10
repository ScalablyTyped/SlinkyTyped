package typingsSlinky.antd.anchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorDefaultProps extends AnchorProps {
  @JSName("affix")
  var affix_AnchorDefaultProps: Boolean = js.native
  @JSName("prefixCls")
  var prefixCls_AnchorDefaultProps: String = js.native
  @JSName("showInkInFixed")
  var showInkInFixed_AnchorDefaultProps: Boolean = js.native
  @JSName("getContainer")
  def getContainer_MAnchorDefaultProps(): AnchorContainer = js.native
}

object AnchorDefaultProps {
  @scala.inline
  def apply(affix: Boolean, getContainer: () => AnchorContainer, prefixCls: String, showInkInFixed: Boolean): AnchorDefaultProps = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorDefaultProps]
  }
  @scala.inline
  implicit class AnchorDefaultPropsOps[Self <: AnchorDefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContainer(value: () => AnchorContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowInkInFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInkInFixed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

