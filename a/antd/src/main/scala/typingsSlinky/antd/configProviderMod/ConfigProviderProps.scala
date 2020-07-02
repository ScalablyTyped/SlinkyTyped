package typingsSlinky.antd.configProviderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.AutoComplete
import typingsSlinky.antd.anon.Ghost
import typingsSlinky.antd.anon.Size
import typingsSlinky.antd.anon.ValidateMessages
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.configProviderContextMod.CSPConfig
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var componentSize: js.UndefOr[SizeType] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[ValidateMessages] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var input: js.UndefOr[AutoComplete] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var pageHeader: js.UndefOr[Ghost] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
  var space: js.UndefOr[Size] = js.undefined
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigProviderProps]
  }
  @scala.inline
  implicit class ConfigProviderPropsOps[Self <: ConfigProviderProps] (val x: Self) extends AnyVal {
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
    def setAutoInsertSpaceInButton(value: Boolean): Self = this.set("autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInsertSpaceInButton: Self = this.set("autoInsertSpaceInButton", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponentSize(value: SizeType): Self = this.set("componentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentSize: Self = this.set("componentSize", js.undefined)
    @scala.inline
    def setCsp(value: CSPConfig): Self = this.set("csp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsp: Self = this.set("csp", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    @scala.inline
    def setForm(value: ValidateMessages): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setGetTargetContainer(value: () => HTMLElement): Self = this.set("getTargetContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTargetContainer: Self = this.set("getTargetContainer", js.undefined)
    @scala.inline
    def setInput(value: AutoComplete): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPageHeader(value: Ghost): Self = this.set("pageHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHeader: Self = this.set("pageHeader", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderEmpty(value: /* componentName */ js.UndefOr[String] => ReactElement): Self = this.set("renderEmpty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderEmpty: Self = this.set("renderEmpty", js.undefined)
    @scala.inline
    def setSpace(value: Size): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

