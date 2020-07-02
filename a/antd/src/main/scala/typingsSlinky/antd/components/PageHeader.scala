package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.avatarMod.AvatarProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.pageHeaderMod.PageHeaderProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageHeader {
  @JSImport("antd/lib/page-header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def avatar(value: AvatarProps): this.type = set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def backIconReactElement(value: ReactElement): this.type = set("backIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def backIcon(value: ReactElement): this.type = set("backIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def breadcrumb(value: BreadcrumbProps): this.type = set("breadcrumb", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
    @scala.inline
    def onBack(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onBack", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def tagsReactElement(value: ReactElement): this.type = set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def tags(value: ReactElement | js.Array[ReactElement]): this.type = set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PageHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

