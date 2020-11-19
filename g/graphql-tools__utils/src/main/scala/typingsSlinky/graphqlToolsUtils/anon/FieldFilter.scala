package typingsSlinky.graphqlToolsUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.Query
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.Subscription
import typingsSlinky.graphqlToolsUtils.interfacesMod.RootFieldFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldFilter extends js.Object {
  
  var fieldFilter: js.UndefOr[js.Function2[/* typeName */ String, /* fieldName */ String, Boolean]] = js.native
  
  var rootFieldFilter: js.UndefOr[RootFieldFilter] = js.native
  
  var schema: GraphQLSchema = js.native
  
  var typeFilter: js.UndefOr[js.Function2[/* typeName */ String, /* type */ GraphQLType, Boolean]] = js.native
}
object FieldFilter {
  
  @scala.inline
  def apply(schema: GraphQLSchema): FieldFilter = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFilter]
  }
  
  @scala.inline
  implicit class FieldFilterOps[Self <: FieldFilter] (val x: Self) extends AnyVal {
    
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
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFilter(value: (/* typeName */ String, /* fieldName */ String) => Boolean): Self = this.set("fieldFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFieldFilter: Self = this.set("fieldFilter", js.undefined)
    
    @scala.inline
    def setRootFieldFilter(
      value: (/* operation */ js.UndefOr[
          Query | typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.Mutation | Subscription
        ], /* rootFieldName */ js.UndefOr[String], /* fieldConfig */ js.UndefOr[GraphQLFieldConfig[js.Any, js.Any, StringDictionary[js.Any]]]) => Boolean
    ): Self = this.set("rootFieldFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRootFieldFilter: Self = this.set("rootFieldFilter", js.undefined)
    
    @scala.inline
    def setTypeFilter(value: (/* typeName */ String, /* type */ GraphQLType) => Boolean): Self = this.set("typeFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTypeFilter: Self = this.set("typeFilter", js.undefined)
  }
}
