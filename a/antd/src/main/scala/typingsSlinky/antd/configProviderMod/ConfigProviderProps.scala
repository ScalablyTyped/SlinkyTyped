package typingsSlinky.antd.configProviderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Ghost
import typingsSlinky.antd.anon.ValidateMessages
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.contextMod.CSPConfig
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var componentSize: js.UndefOr[SizeType] = js.native
  var csp: js.UndefOr[CSPConfig] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var form: js.UndefOr[ValidateMessages] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var pageHeader: js.UndefOr[Ghost] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.native
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
    def withAutoInsertSpaceInButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInsertSpaceInButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInsertSpaceInButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInsertSpaceInButton")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentSize(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCsp(value: CSPConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: ValidateMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeader(value: Ghost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeader")(js.undefined)
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
    @scala.inline
    def withRenderEmpty(value: /* componentName */ js.UndefOr[String] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEmpty")(js.undefined)
        ret
    }
  }
  
}

