package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.listGhostingExampleMod.IListGhostingExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListGhostingExample
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample
    ] {
  @JSImport("office-ui-fabric-react/lib/components/List/examples/List.Ghosting.Example", "ListGhostingExample")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample
  ] = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IListGhostingExampleProps
}

