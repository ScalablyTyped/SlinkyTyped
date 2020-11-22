package typingsSlinky.reactMdTransition.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps * / js.Any because couldn't resolve ClassTree. */
object CSSTransition {
  
  @JSImport("@react-md/transition/types/CSSTransition", "CSSTransition")
  @js.native
  object component extends js.Object
  
  def apply(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ js.Any
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CSSTransition.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
