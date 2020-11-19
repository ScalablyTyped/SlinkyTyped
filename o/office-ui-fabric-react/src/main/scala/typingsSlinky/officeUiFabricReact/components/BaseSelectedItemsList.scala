package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object BaseSelectedItemsList {
  
  @JSImport("office-ui-fabric-react", "BaseSelectedItemsList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, P /* <: IBaseSelectedItemsListProps[T] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.BaseSelectedItemsList[T, P]]
  
  def apply[T, P /* <: IBaseSelectedItemsListProps[T] */](p: P): Builder[T, P] = new Builder[T, P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[T, P /* <: IBaseSelectedItemsListProps[T] */](companion: BaseSelectedItemsList.type): Builder[T, P] = new Builder[T, P](js.Array(this.component, js.Dictionary.empty))()
}
