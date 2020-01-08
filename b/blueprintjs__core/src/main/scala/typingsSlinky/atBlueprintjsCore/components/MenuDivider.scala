package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsMenuMenuDividerMod.IMenuDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuDivider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MenuDivider] {
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuDivider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(title: TagMod[Any] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MenuDivider] = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MenuDivider] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MenuDivider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IMenuDividerProps
}

