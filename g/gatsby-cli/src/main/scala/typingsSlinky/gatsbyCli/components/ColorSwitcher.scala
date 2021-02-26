package typingsSlinky.gatsbyCli.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorProps * / js.Any because couldn't resolve ClassTree. */
object ColorSwitcher {
  
  def apply(
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorProps */ js.Any
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/utils", "ColorSwitcher")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ColorSwitcher.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
