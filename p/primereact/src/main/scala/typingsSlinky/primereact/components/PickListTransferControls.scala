package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_DirectionOriginalEvent
import typingsSlinky.primereact.componentsPicklistPickListTransferControlsMod.PickListTransferControlsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListTransferControls
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.primereact.componentsPicklistPickListTransferControlsMod.PickListTransferControls
    ] {
  @JSImport("primereact/components/picklist/PickListTransferControls", "PickListTransferControls")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onTransfer: /* e */ Anon_DirectionOriginalEvent => Unit = null,
    source: js.Array[_] = null,
    sourceSelection: js.Array[_] = null,
    target: js.Array[_] = null,
    targetSelection: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.primereact.componentsPicklistPickListTransferControlsMod.PickListTransferControls
  ] = {
    val __obj = js.Dynamic.literal()
    if (onTransfer != null) __obj.updateDynamic("onTransfer")(js.Any.fromFunction1(onTransfer))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceSelection != null) __obj.updateDynamic("sourceSelection")(sourceSelection.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PickListTransferControlsProps
}

