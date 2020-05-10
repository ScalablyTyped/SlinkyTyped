package typingsSlinky.reactTransitionGroup.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.div
import typingsSlinky.reactTransitionGroup.transitionGroupMod.TransitionGroupProps
import typingsSlinky.reactTransitionGroup.transitionGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactTransitionGroup.transitionGroupMod.IntrinsicTransitionGroupProps[typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.div] with (/ * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[T] * / js.Any) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object TransitionGroup {
  @JSImport("react-transition-group/TransitionGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: TransitionGroupProps[div, js.Any]): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TransitionGroup.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

