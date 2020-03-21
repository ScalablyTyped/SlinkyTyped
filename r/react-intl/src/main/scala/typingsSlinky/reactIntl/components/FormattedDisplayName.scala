package typingsSlinky.reactIntl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactIntl.DisplayNamesOptionsvalues
import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.code
import typingsSlinky.reactIntl.reactIntlStrings.currency
import typingsSlinky.reactIntl.reactIntlStrings.language
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.narrow
import typingsSlinky.reactIntl.reactIntlStrings.none
import typingsSlinky.reactIntl.reactIntlStrings.region
import typingsSlinky.reactIntl.reactIntlStrings.script
import typingsSlinky.reactIntl.reactIntlStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedDisplayName
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    value: String | Double | js.Object,
    fallback: code | none = null,
    localeMatcher: lookup | (`best fit`) = null,
    style: narrow | short | long = null,
    `type`: language | region | script | currency = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DisplayNamesOptionsvalues
}

