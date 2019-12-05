package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Direction
import typingsSlinky.primereact.componentsPicklistPickListControlsMod.PickListControlsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListControls
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.primereact.componentsPicklistPickListControlsMod.PickListControls
    ] {
  @JSImport("primereact/components/picklist/PickListControls", "PickListControls")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    list: js.Array[_] = null,
    onReorder: /* e */ Anon_Direction => Unit = null,
    selection: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.primereact.componentsPicklistPickListControlsMod.PickListControls
  ] = {
    val __obj = js.Dynamic.literal()
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (onReorder != null) __obj.updateDynamic("onReorder")(js.Any.fromFunction1(onReorder))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PickListControlsProps
}

