package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_Ghost
import typingsSlinky.antd.esConfigDashProviderContextMod.CSPConfig
import typingsSlinky.antd.esConfigDashProviderMod.ConfigProviderProps
import typingsSlinky.antd.esLocaleDashProviderMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ConfigProviderProps_1838576949[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    csp: CSPConfig = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    locale: Locale = null,
    pageHeader: Anon_Ghost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => TagMod[Any] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1(renderEmpty))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConfigProviderProps
}

