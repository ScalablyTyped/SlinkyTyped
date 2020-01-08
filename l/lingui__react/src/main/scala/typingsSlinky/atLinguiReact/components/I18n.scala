package typingsSlinky.atLinguiReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atLinguiReact.i18nMod.I18nComponentProps
import typingsSlinky.atLinguiReact.i18nMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18n
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@lingui/react/I18n", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    update: js.UndefOr[Boolean] = js.undefined,
    withHash: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.atLinguiReact.i18nMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = I18nComponentProps
}

