package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.ink.colorMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.ink.colorMod.Props because: IArray(Couldn't find props for typingsSlinky.ink.colorMod.ChalkFunctionProps because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object Color {
  
  def apply(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("ink/build/components/Color", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Color.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
