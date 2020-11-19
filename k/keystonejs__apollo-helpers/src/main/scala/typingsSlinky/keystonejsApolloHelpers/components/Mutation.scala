package typingsSlinky.keystonejsApolloHelpers.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.keystonejsApolloHelpers.mod.KeystoneMutationTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mutation {
  
  @JSImport("@keystonejs/apollo-helpers", "Mutation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def invalidatesTypes(value: Boolean): this.type = set("invalidatesTypes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KeystoneMutationTypeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(mutation: String): Builder = {
    val __props = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KeystoneMutationTypeProps]))
  }
}
