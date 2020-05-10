package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.antd.breadcrumbSeparatorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object BreadcrumbSeparator {
  @JSImport("antd/lib/breadcrumb/BreadcrumbSeparator", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BreadcrumbSeparator.type): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

