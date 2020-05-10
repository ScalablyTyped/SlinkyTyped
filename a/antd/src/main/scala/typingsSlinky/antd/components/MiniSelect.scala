package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.antd.miniSelectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object MiniSelect {
  @JSImport("antd/lib/pagination/MiniSelect", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MiniSelect.type): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

