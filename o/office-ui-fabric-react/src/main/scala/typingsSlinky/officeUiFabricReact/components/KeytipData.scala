package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.IKeytip
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irendercomponentMod.IRenderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipData
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.KeytipData] {
  @JSImport("office-ui-fabric-react", "KeytipData")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    ariaDescribedBy: String = null,
    componentRef: IRefObject[IKeytip] = null,
    keytipProps: IKeytipProps = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.KeytipData] = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.KeytipData] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.officeUiFabricReact.mod.KeytipData](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IKeytipDataProps with IRenderComponent[js.Object]
}

