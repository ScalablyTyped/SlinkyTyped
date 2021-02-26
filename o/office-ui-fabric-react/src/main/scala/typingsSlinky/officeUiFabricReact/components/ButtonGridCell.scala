package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ButtonGridCell {
  
  def apply[T, P /* <: IButtonGridCellProps[T] */](p: P): Builder[T, P] = new Builder[T, P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T, P /* <: IButtonGridCellProps[T] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ButtonGridCell[T, P]]
  
  implicit def make[T, P /* <: IButtonGridCellProps[T] */](companion: ButtonGridCell.type): Builder[T, P] = new Builder[T, P](js.Array(this.component, js.Dictionary.empty))()
}
