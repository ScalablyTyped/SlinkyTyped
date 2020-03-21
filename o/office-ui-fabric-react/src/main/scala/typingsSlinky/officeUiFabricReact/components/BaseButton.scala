package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.button.tag
import typingsSlinky.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.BaseButton] {
  @JSImport("office-ui-fabric-react", "BaseButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    IButtonProps: IButtonProps = null,
    baseClassName: String = null,
    variantClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.BaseButton] = {
    val __obj = js.Dynamic.literal()
    if (IButtonProps != null) js.Dynamic.global.Object.assign(__obj, IButtonProps)
    if (baseClassName != null) __obj.updateDynamic("baseClassName")(baseClassName.asInstanceOf[js.Any])
    if (variantClassName != null) __obj.updateDynamic("variantClassName")(variantClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.BaseButton] = new slinky.core.BuildingComponent[slinky.web.html.button.tag.type, typingsSlinky.officeUiFabricReact.mod.BaseButton](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IBaseButtonProps
}

