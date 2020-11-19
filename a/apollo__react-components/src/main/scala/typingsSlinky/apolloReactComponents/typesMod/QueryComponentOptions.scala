package typingsSlinky.apolloReactComponents.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactCommon.typesMod.QueryFunctionOptions
import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryComponentOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  
  def children(result: QueryResult[TData, TVariables]): ReactElement | Null = js.native
  
  var query: DocumentNode = js.native
}
object QueryComponentOptions {
  
  @scala.inline
  def apply[TData, TVariables](children: QueryResult[TData, TVariables] => ReactElement | Null, query: DocumentNode): QueryComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComponentOptions[TData, TVariables]]
  }
  
  @scala.inline
  implicit class QueryComponentOptionsOps[Self <: QueryComponentOptions[_, _], TData, TVariables] (val x: Self with (QueryComponentOptions[TData, TVariables])) extends AnyVal {
    
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
    def setChildren(value: QueryResult[TData, TVariables] => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
