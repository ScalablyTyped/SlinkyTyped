package typingsSlinky.reactDataGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for P with typingsSlinky.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object EditorBase {
  
  @JSImport("react-data-grid", "editors.EditorBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P, S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDataGrid.mod.editors.EditorBase[P, S]]
  
  def apply[P, S](p: P with EditorBaseProps): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P, S](companion: EditorBase.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
