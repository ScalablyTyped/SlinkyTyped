package typingsSlinky.reactTransitionGroup.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CSSTransition {
  
  @JSImport("react-transition-group", "CSSTransition")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Ref /* <: js.UndefOr[HTMLElement] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTransitionGroup.mod.CSSTransition[Ref]]
  
  def apply[Ref /* <: js.UndefOr[HTMLElement] */](p: CSSTransitionProps[Ref]): Builder[Ref] = new Builder[Ref](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[Ref /* <: js.UndefOr[HTMLElement] */](companion: CSSTransition.type): Builder[Ref] = new Builder[Ref](js.Array(this.component, js.Dictionary.empty))()
}
