package typingsSlinky.antd.configProviderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.antd.AnonGhost
import typingsSlinky.antd.AnonValidateMessages
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.contextMod.CSPConfig
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var componentSize: js.UndefOr[SizeType] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var form: js.UndefOr[AnonValidateMessages] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var pageHeader: js.UndefOr[AnonGhost] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    componentSize: SizeType = null,
    csp: CSPConfig = null,
    direction: ltr | rtl = null,
    form: AnonValidateMessages = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    locale: Locale = null,
    pageHeader: AnonGhost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => TagMod[Any] = null
  ): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentSize != null) __obj.updateDynamic("componentSize")(componentSize.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1(renderEmpty))
    __obj.asInstanceOf[ConfigProviderProps]
  }
}

