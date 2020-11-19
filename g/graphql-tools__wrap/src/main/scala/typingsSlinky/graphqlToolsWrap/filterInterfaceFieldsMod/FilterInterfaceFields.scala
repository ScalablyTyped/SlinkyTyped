package typingsSlinky.graphqlToolsWrap.filterInterfaceFieldsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterInterfaceFields
  extends Transform[Record[String, js.Any]] {
  
  @JSName("transformSchema")
  def transformSchema_MFilterInterfaceFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  
  val transformer: js.Any = js.native
}
object FilterInterfaceFields {
  
  @scala.inline
  def apply(transformSchema: GraphQLSchema => GraphQLSchema, transformer: js.Any): FilterInterfaceFields = {
    val __obj = js.Dynamic.literal(transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterInterfaceFields]
  }
  
  @scala.inline
  implicit class FilterInterfaceFieldsOps[Self <: FilterInterfaceFields] (val x: Self) extends AnyVal {
    
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
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformer(value: js.Any): Self = this.set("transformer", value.asInstanceOf[js.Any])
  }
}
