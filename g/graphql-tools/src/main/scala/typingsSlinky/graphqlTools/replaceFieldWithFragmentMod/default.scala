package typingsSlinky.graphqlTools.replaceFieldWithFragmentMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.AnonField
import typingsSlinky.graphqlTools.interfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/ReplaceFieldWithFragment", JSImport.Default)
@js.native
class default protected () extends ReplaceFieldWithFragment {
  def this(targetSchema: GraphQLSchema, fragments: js.Array[AnonField]) = this()
  /* CompleteClass */
  override var mapping: js.Any = js.native
  /* CompleteClass */
  override var targetSchema: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MReplaceFieldWithFragment(originalRequest: Request): Request = js.native
}

