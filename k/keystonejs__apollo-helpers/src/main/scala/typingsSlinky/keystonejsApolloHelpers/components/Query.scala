package typingsSlinky.keystonejsApolloHelpers.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.keystonejsApolloHelpers.mod.KeystoneQueryTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Query {
  @JSImport("@keystonejs/apollo-helpers", "Query")
  @js.native
  object component extends js.Object
  
  def withProps(p: KeystoneQueryTypeProps): Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.Query] = new Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.Query](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(query: String): Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.Query] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.Query](js.Array(this.component, __props.asInstanceOf[KeystoneQueryTypeProps]))
  }
}

