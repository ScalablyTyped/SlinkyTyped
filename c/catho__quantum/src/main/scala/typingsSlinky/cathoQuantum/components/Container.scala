package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BreakpointsComponents
import typingsSlinky.cathoQuantum.gridMod.BreakpointsType
import typingsSlinky.cathoQuantum.gridMod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Container {
  @JSImport("@catho/quantum/Grid", "Container")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Container] {
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def hideVarargs(value: String*): this.type = set("hide", js.Array(value :_*))
    @scala.inline
    def hide(value: BreakpointsType | js.Array[String]): this.type = set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def `no-gutters`(value: Boolean): this.type = set("no-gutters", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: BreakpointsComponents): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def withBreakpoints(value: Boolean): this.type = set("withBreakpoints", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Container.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

