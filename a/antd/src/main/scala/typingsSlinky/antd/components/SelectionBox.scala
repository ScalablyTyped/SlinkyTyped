package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typingsSlinky.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.libTableCreateStoreMod.Store
import typingsSlinky.antd.libTableInterfaceMod.RowSelectionType
import typingsSlinky.antd.libTableInterfaceMod.SelectionBoxProps
import typingsSlinky.antd.libTableSelectionBoxMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectionBox
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/table/SelectionBox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name */
  def apply(
    defaultSelection: js.Array[String],
    onChange: CheckboxChangeEvent | RadioChangeEvent => Unit,
    rowIndex: String,
    store: Store,
    `type`: RowSelectionType = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(defaultSelection = defaultSelection.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), rowIndex = rowIndex.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectionBoxProps
}

