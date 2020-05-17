package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BreakpointsObject
import typingsSlinky.cathoQuantum.gridMod.HideProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hide {
  @JSImport("@catho/quantum/Grid", "Hide")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Hide] {
    @scala.inline
    def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def medium(value: Boolean): this.type = set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: BreakpointsObject): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def xlarge(value: Boolean): this.type = set("xlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def xsmall(value: Boolean): this.type = set("xsmall", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Hide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

