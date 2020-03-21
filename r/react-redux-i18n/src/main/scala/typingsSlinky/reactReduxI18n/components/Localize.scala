package typingsSlinky.reactReduxI18n.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactReduxI18n.mod.LocalizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Localize
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactReduxI18n.mod.Localize] {
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    value: String | Double | js.Object,
    dangerousHTML: js.UndefOr[Boolean] = js.undefined,
    dateFormat: String = null,
    options: js.Object = null,
    tag: ReactComponentClass[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactReduxI18n.mod.Localize] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousHTML)) __obj.updateDynamic("dangerousHTML")(dangerousHTML.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocalizeProps
}

