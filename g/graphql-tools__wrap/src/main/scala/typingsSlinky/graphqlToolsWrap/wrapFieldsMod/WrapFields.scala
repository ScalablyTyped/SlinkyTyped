package typingsSlinky.graphqlToolsWrap.wrapFieldsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapFields extends Transform[WrapFieldsTransformationContext] {
  
  val fieldNames: js.Any = js.native
  
  val numWraps: js.Any = js.native
  
  val outerTypeName: js.Any = js.native
  
  @JSName("transformRequest")
  def transformRequest_MWrapFields(originalRequest: Request): Request = js.native
  @JSName("transformRequest")
  def transformRequest_MWrapFields(
    originalRequest: Request,
    delegationContext: js.UndefOr[scala.Nothing],
    transformationContext: WrapFieldsTransformationContext
  ): Request = js.native
  @JSName("transformRequest")
  def transformRequest_MWrapFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
  @JSName("transformRequest")
  def transformRequest_MWrapFields(
    originalRequest: Request,
    delegationContext: Record[String, _],
    transformationContext: WrapFieldsTransformationContext
  ): Request = js.native
  
  @JSName("transformResult")
  def transformResult_MWrapFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
  @JSName("transformResult")
  def transformResult_MWrapFields(
    originalResult: ExecutionResult[Record[String, _]],
    delegationContext: js.UndefOr[scala.Nothing],
    transformationContext: WrapFieldsTransformationContext
  ): ExecutionResult[Record[String, _]] = js.native
  @JSName("transformResult")
  def transformResult_MWrapFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
  @JSName("transformResult")
  def transformResult_MWrapFields(
    originalResult: ExecutionResult[Record[String, _]],
    delegationContext: Record[String, _],
    transformationContext: WrapFieldsTransformationContext
  ): ExecutionResult[Record[String, _]] = js.native
  
  @JSName("transformSchema")
  def transformSchema_MWrapFields(schema: GraphQLSchema): GraphQLSchema = js.native
  
  val transformer: js.Any = js.native
  
  val wrappingFieldNames: js.Any = js.native
  
  val wrappingResolver: js.Any = js.native
  
  val wrappingTypeNames: js.Any = js.native
}
