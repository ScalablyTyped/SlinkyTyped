package typingsSlinky.reactSpring.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpring.renderpropsUniversalMod.KeyframesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactSpring.renderpropsUniversalMod.KeyframesProps[DS] with S because: IArray(Could't extract props from S because couldn't resolve ClassTree.) */
object Keyframes {
  
  @JSImport("react-spring/renderprops", "Keyframes")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[S /* <: js.Object */, DS /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSpring.renderpropsMod.Keyframes[S, DS]]
  
  def apply[S /* <: js.Object */, DS /* <: js.Object */](p: KeyframesProps[DS] with S): Builder[S, DS] = new Builder[S, DS](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[S /* <: js.Object */, DS /* <: js.Object */](companion: Keyframes.type): Builder[S, DS] = new Builder[S, DS](js.Array(this.component, js.Dictionary.empty))()
}
