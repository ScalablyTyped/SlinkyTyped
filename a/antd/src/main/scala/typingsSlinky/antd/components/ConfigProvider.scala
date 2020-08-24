package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.Ghost
import typingsSlinky.antd.anon.Size
import typingsSlinky.antd.anon.ValidateMessages
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.configProviderContextMod.CSPConfig
import typingsSlinky.antd.configProviderMod.ConfigProviderProps
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigProvider {
  @JSImport("antd", "ConfigProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def autoInsertSpaceInButton(value: Boolean): this.type = set("autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    @scala.inline
    def componentSize(value: SizeType): this.type = set("componentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def csp(value: CSPConfig): this.type = set("csp", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownMatchSelectWidth(value: Boolean): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def form(value: ValidateMessages): this.type = set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def getTargetContainer(value: () => HTMLElement): this.type = set("getTargetContainer", js.Any.fromFunction0(value))
    @scala.inline
    def input(value: typingsSlinky.antd.anon.AutoComplete): this.type = set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def pageHeader(value: Ghost): this.type = set("pageHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def renderEmpty(value: /* componentName */ js.UndefOr[String] => ReactElement): this.type = set("renderEmpty", js.Any.fromFunction1(value))
    @scala.inline
    def space(value: Size): this.type = set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConfigProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ConfigProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

