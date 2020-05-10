package typingsSlinky.jupyterlabUiComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps * / js.Any) with typingsSlinky.react.mod.DOMAttributes[js.Any] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps * / js.Any because couldn't resolve ClassTree.) */
object Collapse {
  @JSImport("@jupyterlab/ui-components", "Collapse")
  @js.native
  object component extends js.Object
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with DOMAttributes[js.Any]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Collapse.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

