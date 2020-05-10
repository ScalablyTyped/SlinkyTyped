package typingsSlinky.materialUiCore.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoint
import typingsSlinky.materialUiCore.hiddenHiddenMod.HiddenProps
import typingsSlinky.materialUiCore.hiddenMod.default
import typingsSlinky.materialUiCore.materialUiCoreStrings.css
import typingsSlinky.materialUiCore.materialUiCoreStrings.js_
import typingsSlinky.materialUiCore.withStylesMod.ClassNameMap
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hidden {
  @JSImport("@material-ui/core/Hidden", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: Partial[ClassNameMap[scala.Nothing]]): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def implementation(value: js_ | css): this.type = set("implementation", value.asInstanceOf[js.Any])
    @scala.inline
    def initialWidth(value: Breakpoint): this.type = set("initialWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[_] | ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def lgDown(value: Boolean): this.type = set("lgDown", value.asInstanceOf[js.Any])
    @scala.inline
    def lgUp(value: Boolean): this.type = set("lgUp", value.asInstanceOf[js.Any])
    @scala.inline
    def mdDown(value: Boolean): this.type = set("mdDown", value.asInstanceOf[js.Any])
    @scala.inline
    def mdUp(value: Boolean): this.type = set("mdUp", value.asInstanceOf[js.Any])
    @scala.inline
    def only(value: Breakpoint | js.Array[Breakpoint]): this.type = set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def smDown(value: Boolean): this.type = set("smDown", value.asInstanceOf[js.Any])
    @scala.inline
    def smUp(value: Boolean): this.type = set("smUp", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def xlDown(value: Boolean): this.type = set("xlDown", value.asInstanceOf[js.Any])
    @scala.inline
    def xlUp(value: Boolean): this.type = set("xlUp", value.asInstanceOf[js.Any])
    @scala.inline
    def xsDown(value: Boolean): this.type = set("xsDown", value.asInstanceOf[js.Any])
    @scala.inline
    def xsUp(value: Boolean): this.type = set("xsUp", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HiddenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Hidden.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

