package typingsSlinky.keystonejsApolloHelpers.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.keystonejsApolloHelpers.mod.KeystoneQueryTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Query {
  
  @JSImport("@keystonejs/apollo-helpers", "Query")
  @js.native
  object component extends js.Object
  
  def withProps(p: KeystoneQueryTypeProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(query: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[KeystoneQueryTypeProps]))
  }
}
