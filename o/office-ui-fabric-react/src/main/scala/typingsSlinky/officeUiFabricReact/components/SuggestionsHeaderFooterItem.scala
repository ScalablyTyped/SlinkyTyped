package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsHeaderFooterItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsHeaderFooterItem] {
  @JSImport("office-ui-fabric-react", "SuggestionsHeaderFooterItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    id: String,
    isSelected: Boolean,
    renderItem: () => ReactElement,
    componentRef: IRefObject[js.Object] = null,
    onExecute: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsHeaderFooterItem] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = js.Any.fromFunction0(renderItem))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction0(onExecute))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ISuggestionsHeaderFooterItemProps
}

