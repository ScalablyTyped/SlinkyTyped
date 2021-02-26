package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigationStack.touchableItemIosMod.Props
import typingsSlinky.reactNavigationStack.touchableItemIosMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNavigationStack.touchableItemIosMod.Props because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object TouchableItemDotios {
  
  def apply(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TouchableItemDotios.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
