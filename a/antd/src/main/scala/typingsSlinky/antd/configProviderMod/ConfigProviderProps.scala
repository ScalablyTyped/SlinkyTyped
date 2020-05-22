package typingsSlinky.antd.configProviderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
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
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var componentSize: js.UndefOr[SizeType] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var form: js.UndefOr[ValidateMessages] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var input: js.UndefOr[AutoComplete] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var pageHeader: js.UndefOr[Ghost] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
  var space: js.UndefOr[Size] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    componentSize: SizeType = null,
    csp: CSPConfig = null,
    direction: ltr | rtl = null,
    form: ValidateMessages = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    getTargetContainer: () => HTMLElement = null,
    input: AutoComplete = null,
    locale: Locale = null,
    pageHeader: Ghost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => TagMod[Any] = null,
    space: Size = null
  ): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentSize != null) __obj.updateDynamic("componentSize")(componentSize.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTargetContainer != null) __obj.updateDynamic("getTargetContainer")(js.Any.fromFunction0(getTargetContainer))
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1(renderEmpty))
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProviderProps]
  }
}

