package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typingsSlinky.atBlueprintjsTable.libEsmHeadersEditableNameMod.IEditableNameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableName
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.EditableName] {
  @JSImport("@blueprintjs/table", "EditableName")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, name */
  def apply(
    index: Int | Double = null,
    intent: Intent = null,
    onCancel: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onChange: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onConfirm: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.EditableName] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2(onConfirm))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IEditableNameProps
}

