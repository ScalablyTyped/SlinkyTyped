package typingsSlinky.catalog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("catalog", "Page")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.catalog.mod.Page] = new Default[tag.type, typingsSlinky.catalog.mod.Page](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Page.type): Default[tag.type, typingsSlinky.catalog.mod.Page] = new Default[tag.type, typingsSlinky.catalog.mod.Page](js.Array(this.component, js.Dictionary.empty))()
}
