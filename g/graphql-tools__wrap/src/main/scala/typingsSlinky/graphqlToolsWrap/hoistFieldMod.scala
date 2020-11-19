package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/HoistField", JSImport.Namespace)
@js.native
object hoistFieldMod extends js.Object {
  
  def unwrapValue(originalValue: js.Any, alias: String): js.Any = js.native
  
  def wrapFieldNode(fieldNode: FieldNode, path: js.Array[String], alias: String): FieldNode = js.native
  
  @js.native
  trait HoistField
    extends Transform[Record[String, js.Any]] {
    
    val newFieldName: js.Any = js.native
    
    val oldFieldName: js.Any = js.native
    
    val pathToField: js.Any = js.native
    
    @JSName("transformRequest")
    def transformRequest_MHoistField(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    
    @JSName("transformResult")
    def transformResult_MHoistField(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    
    @JSName("transformSchema")
    def transformSchema_MHoistField(schema: GraphQLSchema): GraphQLSchema = js.native
    
    val transformer: js.Any = js.native
    
    val typeName: js.Any = js.native
  }
  
  @js.native
  class default protected () extends HoistField {
    def this(typeName: String, path: js.Array[String], newFieldName: String) = this()
    def this(typeName: String, path: js.Array[String], newFieldName: String, alias: String) = this()
  }
}
