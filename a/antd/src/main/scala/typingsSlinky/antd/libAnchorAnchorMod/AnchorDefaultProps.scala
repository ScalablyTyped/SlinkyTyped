package typingsSlinky.antd.libAnchorAnchorMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.Anon_Href
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorDefaultProps extends AnchorProps {
  @JSName("affix")
  var affix_AnchorDefaultProps: Boolean
  @JSName("prefixCls")
  var prefixCls_AnchorDefaultProps: String
  @JSName("showInkInFixed")
  var showInkInFixed_AnchorDefaultProps: Boolean
  @JSName("getContainer")
  def getContainer_MAnchorDefaultProps(): AnchorContainer
}

object AnchorDefaultProps {
  @scala.inline
  def apply(
    affix: Boolean,
    getContainer: () => AnchorContainer,
    prefixCls: String,
    showInkInFixed: Boolean,
    bounds: Int | Double = null,
    children: TagMod[Any] = null,
    className: String = null,
    getCurrentAnchor: () => String = null,
    offsetTop: Int | Double = null,
    onChange: /* currentActiveLink */ String => Unit = null,
    onClick: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Anon_Href) => Unit = null,
    style: CSSProperties = null,
    targetOffset: Int | Double = null
  ): AnchorDefaultProps = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getCurrentAnchor != null) __obj.updateDynamic("getCurrentAnchor")(js.Any.fromFunction0(getCurrentAnchor))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorDefaultProps]
  }
}

