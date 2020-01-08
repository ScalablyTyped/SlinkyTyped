package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libLocaleDashProviderMod.Locale
import typingsSlinky.antd.libLocaleDashProviderMod.LocaleProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LocaleProviderProps_881405819[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(locale: Locale, _ANT_MARK__ : String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocaleProviderProps
}

