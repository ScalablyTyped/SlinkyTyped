package typingsSlinky.rcTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rcTable.expandedRowMod.ExpandedRowProps
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExpandedRow
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[RecordType](
    cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    className: String,
    colSpan: Double,
    component: CustomizeComponent[HTMLAttributes[HTMLElement]],
    componentWidth: Double,
    expanded: Boolean,
    fixColumn: Boolean,
    fixHeader: Boolean,
    prefixCls: String,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = ExpandedRowProps[js.Any]
}

