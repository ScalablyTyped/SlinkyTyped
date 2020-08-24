package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.typesMod.InputFieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.InputFieldTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/TransformInputObjectFields", JSImport.Namespace)
@js.native
object transformInputObjectFieldsMod extends js.Object {
  @js.native
  trait TransformInputObjectFields
    extends Transform[Record[String, js.Any]] {
    val inputFieldNodeTransformer: js.Any = js.native
    val inputFieldTransformer: js.Any = js.native
    val inputObjectNodeTransformer: js.Any = js.native
    var mapping: js.Any = js.native
    var transformDocument: js.Any = js.native
    var transformedSchema: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInputObjectFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInputObjectFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformSchema")
    def transformSchema_MTransformInputObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends TransformInputObjectFields {
    def this(inputFieldTransformer: InputFieldTransformer) = this()
    def this(inputFieldTransformer: InputFieldTransformer, inputFieldNodeTransformer: InputFieldNodeTransformer) = this()
    def this(
      inputFieldTransformer: InputFieldTransformer,
      inputFieldNodeTransformer: js.UndefOr[scala.Nothing],
      inputObjectNodeTransformer: InputObjectNodeTransformer
    ) = this()
    def this(
      inputFieldTransformer: InputFieldTransformer,
      inputFieldNodeTransformer: InputFieldNodeTransformer,
      inputObjectNodeTransformer: InputObjectNodeTransformer
    ) = this()
  }
  
}

