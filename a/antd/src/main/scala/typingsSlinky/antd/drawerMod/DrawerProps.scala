package typingsSlinky.antd.drawerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[Boolean] = js.undefined
  /** wrapper dom node style of header and body */
  var drawerStyle: js.UndefOr[CSSProperties] = js.undefined
  var footer: js.UndefOr[ReactElement] = js.undefined
  var footerStyle: js.UndefOr[CSSProperties] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false`] = js.undefined
  var handler: js.UndefOr[ReactElement] = js.undefined
  var headerStyle: js.UndefOr[CSSProperties] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ EventType, Unit]] = js.undefined
  var placement: js.UndefOr[placementType] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactElement] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(): DrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProps]
  }
  @scala.inline
  implicit class DrawerPropsOps[Self <: DrawerProps] (val x: Self) extends AnyVal {
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
    def setAfterVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("afterVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterVisibleChange: Self = this.set("afterVisibleChange", js.undefined)
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setDestroyOnClose(value: Boolean): Self = this.set("destroyOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyOnClose: Self = this.set("destroyOnClose", js.undefined)
    @scala.inline
    def setDrawerStyle(value: CSSProperties): Self = this.set("drawerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerStyle: Self = this.set("drawerStyle", js.undefined)
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFooterStyle(value: CSSProperties): Self = this.set("footerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterStyle: Self = this.set("footerStyle", js.undefined)
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    @scala.inline
    def setGetContainerHTMLElement(value: HTMLElement): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContainerFunction0(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    @scala.inline
    def setHandlerReactElement(value: ReactElement): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: ReactElement): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    @scala.inline
    def setMaskStyle(value: CSSProperties): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    @scala.inline
    def setOnClose(value: /* e */ EventType => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setPlacement(value: placementType): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

