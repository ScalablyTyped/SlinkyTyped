package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.anon.Style
import typingsSlinky.bizcharts.mod.PositionType
import typingsSlinky.bizcharts.mod.TooltipProps
import typingsSlinky.bizcharts.mod.triggerOnType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Tooltip] {
    @scala.inline
    def containerTpl(value: String): this.type = set("containerTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def crosshairs(value: Style | Boolean): this.type = set("crosshairs", value.asInstanceOf[js.Any])
    @scala.inline
    def enterable(value: Boolean): this.type = set("enterable", value.asInstanceOf[js.Any])
    @scala.inline
    def follow(value: Boolean): this.type = set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def `g2-tooltip`(value: CSSProperties): this.type = set("g2-tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def `g2-tooltip-list`(value: CSSProperties): this.type = set("g2-tooltip-list", value.asInstanceOf[js.Any])
    @scala.inline
    def `g2-tooltip-list-item`(value: CSSProperties): this.type = set("g2-tooltip-list-item", value.asInstanceOf[js.Any])
    @scala.inline
    def `g2-tooltip-marker`(value: CSSProperties): this.type = set("g2-tooltip-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `g2-tooltip-title`(value: CSSProperties): this.type = set("g2-tooltip-title", value.asInstanceOf[js.Any])
    @scala.inline
    def hideMarkers(value: Boolean): this.type = set("hideMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def htmlContent(value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]]) => String): this.type = set("htmlContent", js.Any.fromFunction2(value))
    @scala.inline
    def inPlot(value: Boolean): this.type = set("inPlot", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTpl(value: String): this.type = set("itemTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def shared(value: Boolean): this.type = set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerOn(value: triggerOnType): this.type = set("triggerOn", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def useHtml(value: Boolean): this.type = set("useHtml", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

