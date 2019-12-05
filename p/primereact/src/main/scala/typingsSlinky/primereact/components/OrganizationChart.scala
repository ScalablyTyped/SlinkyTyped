package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Node
import typingsSlinky.primereact.componentsOrganizationchartOrganizationChartMod.OrganizationChartNodeData
import typingsSlinky.primereact.componentsOrganizationchartOrganizationChartMod.OrganizationChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OrganizationChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.organizationchartMod.OrganizationChart] {
  @JSImport("primereact/organizationchart", "OrganizationChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    nodeTemplate: /* node */ OrganizationChartNodeData => TagMod[Any] = null,
    onNodeSelect: /* e */ Anon_Node => Unit = null,
    onNodeUnselect: /* e */ Anon_Node => Unit = null,
    selection: js.Any = null,
    selectionChange: /* data */ js.Any => Unit = null,
    selectionMode: String = null,
    style: js.Object = null,
    value: js.Array[OrganizationChartNodeData] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.organizationchartMod.OrganizationChart] = {
    val __obj = js.Dynamic.literal()
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1(nodeTemplate))
    if (onNodeSelect != null) __obj.updateDynamic("onNodeSelect")(js.Any.fromFunction1(onNodeSelect))
    if (onNodeUnselect != null) __obj.updateDynamic("onNodeUnselect")(js.Any.fromFunction1(onNodeUnselect))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1(selectionChange))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OrganizationChartProps
}

