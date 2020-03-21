package typingsSlinky.linguiReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.linguiCore.i18nMod.Catalogs
import typingsSlinky.linguiCore.mod.I18n_
import typingsSlinky.linguiReact.i18nProviderMod.I18nProviderProps
import typingsSlinky.linguiReact.i18nProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18nProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@lingui/react/I18nProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    language: String,
    catalogs: Catalogs = null,
    defaultRender: TagMod[Any] = null,
    i18n: I18n_ = null,
    locales: String | js.Array[String] = null,
    missing: String | (js.Function2[/* language */ String, /* id */ String, String]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = I18nProviderProps
}

