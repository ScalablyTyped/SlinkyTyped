package typingsSlinky.reactApp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactApp.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @JSImport("react-app", "Link")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactApp.mod.Link] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
  }
  
  def withProps(p: LinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(to: String): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
}
