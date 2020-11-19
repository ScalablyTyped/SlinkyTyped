package typingsSlinky.graphqlToolsWrap.renameRootFieldsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameRootFields
  extends Transform[Record[String, js.Any]] {
  
  @JSName("transformRequest")
  def transformRequest_MRenameRootFields(originalRequest: Request): Request = js.native
  
  @JSName("transformSchema")
  def transformSchema_MRenameRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  
  val transformer: js.Any = js.native
}
object RenameRootFields {
  
  @scala.inline
  def apply(
    transformRequest: Request => Request,
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformer: js.Any
  ): RenameRootFields = {
    val __obj = js.Dynamic.literal(transformRequest = js.Any.fromFunction1(transformRequest), transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameRootFields]
  }
  
  @scala.inline
  implicit class RenameRootFieldsOps[Self <: RenameRootFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformer(value: js.Any): Self = this.set("transformer", value.asInstanceOf[js.Any])
  }
}
