package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.AnonGhost
import typingsSlinky.antd.AnonValidateMessages
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.configProviderMod.ConfigProviderProps
import typingsSlinky.antd.configProviderMod.default
import typingsSlinky.antd.contextMod.CSPConfig
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/config-provider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    componentSize: SizeType = null,
    csp: CSPConfig = null,
    direction: ltr | rtl = null,
    form: AnonValidateMessages = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    locale: Locale = null,
    pageHeader: AnonGhost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.asInstanceOf[js.Any])
    if (componentSize != null) __obj.updateDynamic("componentSize")(componentSize.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1(renderEmpty))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.configProviderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ConfigProviderProps
}

