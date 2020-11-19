package typingsSlinky.rcTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTable.panelMod.TitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("rc-table/lib/Panel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TitleProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(className: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TitleProps]))
  }
}
