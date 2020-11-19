package typingsSlinky.fluentReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentReact.mod.LocalizedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localized {
  
  @JSImport("@fluent/react", "Localized")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fluentReact.mod.Localized] {
    
    @scala.inline
    def attrs(value: js.Object): this.type = set("attrs", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocalizedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizedProps]))
  }
}
