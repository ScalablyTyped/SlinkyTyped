package typingsSlinky.jupyterlabUiComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jupyterlabUiComponents.blueprintMod.CommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps * / js.Any) with typingsSlinky.jupyterlabUiComponents.blueprintMod.CommonProps[js.Any] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps * / js.Any because couldn't resolve ClassTree.) */
object Select {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with CommonProps[js.Any]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@jupyterlab/ui-components", "Select")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Select.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
