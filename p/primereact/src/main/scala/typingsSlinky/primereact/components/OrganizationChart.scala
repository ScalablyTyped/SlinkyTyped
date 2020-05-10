package typingsSlinky.primereact.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonNode
import typingsSlinky.primereact.organizationChartMod.OrganizationChartNodeData
import typingsSlinky.primereact.organizationChartMod.OrganizationChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OrganizationChart {
  @JSImport("primereact/organizationchart", "OrganizationChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.primereact.primereactOrganizationchartMod.OrganizationChart
        ] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeTemplate(value: /* node */ OrganizationChartNodeData => TagMod[Any]): this.type = set("nodeTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def onNodeSelect(value: /* e */ AnonNode => Unit): this.type = set("onNodeSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onNodeUnselect(value: /* e */ AnonNode => Unit): this.type = set("onNodeUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def selection(value: js.Any): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionChange(value: /* data */ js.Any => Unit): this.type = set("selectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Array[OrganizationChartNodeData]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OrganizationChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: OrganizationChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

