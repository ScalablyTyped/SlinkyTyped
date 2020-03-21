package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.beforeAfterWrapperMod.BeforeAfterWrapperProps
import typingsSlinky.materialUi.beforeAfterWrapperMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BeforeAfterWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/BeforeAfterWrapper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    afterElementType: String = null,
    afterStyle: CSSProperties = null,
    beforeElementType: String = null,
    beforeStyle: CSSProperties = null,
    elementType: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterElementType != null) __obj.updateDynamic("afterElementType")(afterElementType.asInstanceOf[js.Any])
    if (afterStyle != null) __obj.updateDynamic("afterStyle")(afterStyle.asInstanceOf[js.Any])
    if (beforeElementType != null) __obj.updateDynamic("beforeElementType")(beforeElementType.asInstanceOf[js.Any])
    if (beforeStyle != null) __obj.updateDynamic("beforeStyle")(beforeStyle.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.materialUi.beforeAfterWrapperMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BeforeAfterWrapperProps
}

