package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esLocaleDashProviderMod.Locale
import typingsSlinky.antd.esLocaleDashProviderMod.LocaleProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_typingsSlinkyantdesLocaleDashProviderModLocaleProviderProps_1159056697[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(locale: Locale, _ANT_MARK__ : String = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocaleProviderProps
}

