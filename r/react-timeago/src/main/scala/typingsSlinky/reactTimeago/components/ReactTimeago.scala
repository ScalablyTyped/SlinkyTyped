package typingsSlinky.reactTimeago.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactTimeago.mod.ReactTimeagoProps
import typingsSlinky.reactTimeago.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactTimeago.mod.ReactTimeagoProps[T] with typingsSlinky.react.mod.ComponentProps[T] because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object ReactTimeago {
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: ReactComponentClass[js.Object] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^[T]]
  
  def apply[T /* <: ReactComponentClass[js.Object] */](p: ReactTimeagoProps[T] with ComponentProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[T /* <: ReactComponentClass[js.Object] */](companion: ReactTimeago.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
