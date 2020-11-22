package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithChildren[
js.Any with typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps[js.Any]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object StyledArrow {
  
  @JSImport("baseui/helper", "StyledArrow")
  @js.native
  object component extends js.Object
  
  def apply(p: PropsWithChildren[js.Any with StyletronComponentInjectedProps[js.Any]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StyledArrow.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
