package typingsSlinky.graphqlTools.replaceFieldWithFragmentMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.anon.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/ReplaceFieldWithFragment", JSImport.Default)
@js.native
class default protected () extends ReplaceFieldWithFragment {
  def this(targetSchema: GraphQLSchema, fragments: js.Array[Field]) = this()
}

