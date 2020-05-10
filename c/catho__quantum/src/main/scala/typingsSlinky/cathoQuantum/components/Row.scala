package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.Anon7
import typingsSlinky.cathoQuantum.gridMod.BreakpointsType
import typingsSlinky.cathoQuantum.gridMod.RowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Row {
  @JSImport("@catho/quantum/Grid", "Row")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Row] {
    @scala.inline
    def hide(value: BreakpointsType | js.Array[BreakpointsType]): this.type = set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def `no-gutters`(value: Boolean): this.type = set("no-gutters", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Anon7): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Row.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

