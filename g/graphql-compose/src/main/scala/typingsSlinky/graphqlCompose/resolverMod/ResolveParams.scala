package typingsSlinky.graphqlCompose.resolverMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveParams[TSource, TContext, TArgs]
  extends /* opt */ StringDictionary[js.Any] {
  
  var args: TArgs = js.native
  
  var context: TContext = js.native
  
  var info: GraphQLResolveInfo = js.native
  
  var source: TSource = js.native
}
object ResolveParams {
  
  @scala.inline
  def apply[TSource, TContext, TArgs](args: TArgs, context: TContext, info: GraphQLResolveInfo, source: TSource): ResolveParams[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveParams[TSource, TContext, TArgs]]
  }
  
  @scala.inline
  implicit class ResolveParamsOps[Self <: ResolveParams[_, _, _], TSource, TContext, TArgs] (val x: Self with (ResolveParams[TSource, TContext, TArgs])) extends AnyVal {
    
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
    def setArgs(value: TArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: GraphQLResolveInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: TSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
