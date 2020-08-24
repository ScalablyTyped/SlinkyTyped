package typingsSlinky.antDesignProLayout.footerToolbarMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.anon.FooterToolbarPropsRouteCo
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FooterToolbarProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var extra: js.UndefOr[ReactElement] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var renderContent: js.UndefOr[js.Function2[/* props */ FooterToolbarPropsRouteCo, ReactElement, ReactElement]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object FooterToolbarProps {
  @scala.inline
  def apply(): FooterToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterToolbarProps]
  }
  @scala.inline
  implicit class FooterToolbarPropsOps[Self <: FooterToolbarProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderContent(value: (/* props */ FooterToolbarPropsRouteCo, ReactElement) => ReactElement): Self = this.set("renderContent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderContent: Self = this.set("renderContent", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

