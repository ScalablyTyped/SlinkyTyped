package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsDatatableBodyCellMod.BodyCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BodyCell
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.componentsDatatableBodyCellMod.BodyCell] {
  @JSImport("primereact/components/datatable/BodyCell", "BodyCell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.primereact.componentsDatatableBodyCellMod.BodyCell] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BodyCellProps
}

