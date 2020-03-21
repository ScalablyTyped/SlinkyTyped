package typingsSlinky.graphqlTools.filterTypesMod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterTypes", JSImport.Default)
@js.native
class default protected () extends FilterTypes {
  def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  /* CompleteClass */
  override var filter: js.Any = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MFilterTypes(schema: GraphQLSchema): GraphQLSchema = js.native
}

