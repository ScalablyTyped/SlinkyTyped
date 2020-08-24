package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.InputFieldFilter
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/FilterInputObjectFields", JSImport.Namespace)
@js.native
object filterInputObjectFieldsMod extends js.Object {
  @js.native
  trait FilterInputObjectFields
    extends Transform[Record[String, js.Any]] {
    val transformer: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MFilterInputObjectFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MFilterInputObjectFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformSchema")
    def transformSchema_MFilterInputObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends FilterInputObjectFields {
    def this(filter: InputFieldFilter) = this()
    def this(filter: InputFieldFilter, inputObjectNodeTransformer: InputObjectNodeTransformer) = this()
  }
  
}

