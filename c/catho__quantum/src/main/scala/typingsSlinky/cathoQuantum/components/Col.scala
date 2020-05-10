package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.gridMod.BreakpointsType
import typingsSlinky.cathoQuantum.gridMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Col {
  @JSImport("@catho/quantum/Grid", "Col")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Col] {
    @scala.inline
    def hide(value: BreakpointsType | js.Array[BreakpointsType]): this.type = set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def large(value: Double): this.type = set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def `large-offset`(value: Double): this.type = set("large-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def medium(value: Double): this.type = set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def `medium-offset`(value: Double): this.type = set("medium-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `no-gutters`(value: Boolean): this.type = set("no-gutters", value.asInstanceOf[js.Any])
    @scala.inline
    def small(value: Double): this.type = set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def `small-offset`(value: Double): this.type = set("small-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def xlarge(value: Double): this.type = set("xlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def `xlarge-offset`(value: Double): this.type = set("xlarge-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def xsmall(value: Double): this.type = set("xsmall", value.asInstanceOf[js.Any])
    @scala.inline
    def `xsmall-offset`(value: Double): this.type = set("xsmall-offset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Col.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

