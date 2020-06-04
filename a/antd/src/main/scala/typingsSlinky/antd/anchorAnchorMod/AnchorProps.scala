package typingsSlinky.antd.anchorAnchorMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.Href
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorProps extends js.Object {
  var affix: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.undefined
  /** Return customize highlight anchor */
  var getCurrentAnchor: js.UndefOr[js.Function0[String]] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  /** Listening event when scrolling change active link */
  var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showInkInFixed: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
  var targetOffset: js.UndefOr[Double] = js.undefined
}

object AnchorProps {
  @scala.inline
  def apply(): AnchorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorProps]
  }
  @scala.inline
  implicit class AnchorPropsOps[Self <: AnchorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAffix(value: Boolean): Self = this.set("affix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffix: Self = this.set("affix", js.undefined)
    @scala.inline
    def setBounds(value: Double): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: TagMod[Any]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGetContainer(value: () => AnchorContainer): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    @scala.inline
    def setGetCurrentAnchor(value: () => String): Self = this.set("getCurrentAnchor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrentAnchor: Self = this.set("getCurrentAnchor", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOnChange(value: /* currentActiveLink */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowInkInFixed(value: Boolean): Self = this.set("showInkInFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInkInFixed: Self = this.set("showInkInFixed", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTargetOffset(value: Double): Self = this.set("targetOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetOffset: Self = this.set("targetOffset", js.undefined)
  }
  
}

