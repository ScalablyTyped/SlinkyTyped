package typingsSlinky.reactTransitionGroup.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CSSTransition {
  @JSImport("react-transition-group", "CSSTransition")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: js.UndefOr[typingsSlinky.std.HTMLElement] */ Ref] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTransitionGroup.mod.CSSTransition[Ref]]
  
  def apply[/* <: js.UndefOr[typingsSlinky.std.HTMLElement] */ Ref](p: CSSTransitionProps[Ref]): Builder[Ref] = new Builder[Ref](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: js.UndefOr[typingsSlinky.std.HTMLElement] */ Ref](companion: CSSTransition.type): Builder[Ref] = new Builder[Ref](js.Array(this.component, js.Dictionary.empty))()
}

