package typingsSlinky.fluentReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fluentBundle.mod.FluentBundle
import typingsSlinky.fluentReact.mod.LocalizationProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocalizationProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fluentReact.mod.LocalizationProvider] {
  @JSImport("@fluent/react", "LocalizationProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    bundles: js.Iterable[FluentBundle],
    parseMarkup: /* str */ String => js.Array[Node] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.fluentReact.mod.LocalizationProvider] = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1(parseMarkup))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocalizationProviderProps
}

