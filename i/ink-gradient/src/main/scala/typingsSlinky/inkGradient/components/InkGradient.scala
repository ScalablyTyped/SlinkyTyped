package typingsSlinky.inkGradient.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.inkGradient.mod.GradientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.inkGradient.mod.GradientProps because: IArray(Couldn't find props for typingsSlinky.inkGradient.inkGradientStrings.Without with js.Any with typingsSlinky.inkGradient.mod.PropsColor because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.inkGradient.inkGradientStrings.Without with js.Any with typingsSlinky.inkGradient.mod.PropsName because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object InkGradient {
  
  def apply(p: GradientProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("ink-gradient", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InkGradient.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
