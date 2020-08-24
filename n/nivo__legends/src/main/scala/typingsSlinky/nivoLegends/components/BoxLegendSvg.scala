package typingsSlinky.nivoLegends.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoLegends.anon.Color
import typingsSlinky.nivoLegends.mod.Box
import typingsSlinky.nivoLegends.mod.ContainerDimensions
import typingsSlinky.nivoLegends.mod.LegendAnchor
import typingsSlinky.nivoLegends.mod.LegendDirection
import typingsSlinky.nivoLegends.mod.LegendEffect
import typingsSlinky.nivoLegends.mod.LegendItemDirection
import typingsSlinky.nivoLegends.mod.LegendMouseHandlerData
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoLegends.mod.LegendSymbolShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BoxLegendSvg {
  @JSImport("@nivo/legends", "BoxLegendSvg")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def dataVarargs(value: Color*): this.type = set("data", js.Array(value :_*))
    @scala.inline
    def data(value: js.Array[Color]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def effectsVarargs(value: LegendEffect*): this.type = set("effects", js.Array(value :_*))
    @scala.inline
    def effects(value: js.Array[LegendEffect]): this.type = set("effects", value.asInstanceOf[js.Any])
    @scala.inline
    def itemBackground(value: String): this.type = set("itemBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def itemDirection(value: LegendItemDirection): this.type = set("itemDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def itemOpacity(value: Double): this.type = set("itemOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTextColor(value: String): this.type = set("itemTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def itemsSpacing(value: Double): this.type = set("itemsSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def justify(value: Boolean): this.type = set("justify", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseEnter(value: (/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseLeave(value: (/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def padding(value: Double | Box): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def symbolBorderColor(value: String): this.type = set("symbolBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def symbolShape(value: LegendSymbolShape | js.Any): this.type = set("symbolShape", value.asInstanceOf[js.Any])
    @scala.inline
    def symbolSize(value: Double): this.type = set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def symbolSpacing(value: Double): this.type = set("symbolSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LegendProps with ContainerDimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double
  ): Builder = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LegendProps with ContainerDimensions]))
  }
}

