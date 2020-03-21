package typingsSlinky.reactBootstrapTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.input.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.PickCSSPropertiesboxSizin
import typingsSlinky.reactBootstrapTypeahead.mod.AutosizeInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutosizeInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.AutosizeInput] {
  @JSImport("react-bootstrap-typeahead", "AutosizeInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    style: CSSProperties,
    inputClassName: String = null,
    inputRef: LegacyRef[HTMLInputElement] = null,
    inputStyle: PickCSSPropertiesboxSizin = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.AutosizeInput] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutosizeInputProps
}

