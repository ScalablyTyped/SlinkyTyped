package typingsSlinky.graphqlResolvers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphqlResolvers.anon.GraphQLResolveInfomergeIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-resolvers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def allResolvers[TSource, TContext, TArgs](resolvers: js.Array[IFieldResolver[TSource, TContext, TArgs, _]]): IFieldResolver[TSource, TContext, TArgs, _] = js.native
  
  def combineResolvers[TSource, TContext, TArgs](resolvers: (IFieldResolver[TSource, TContext, TArgs, _])*): IFieldResolver[TSource, TContext, TArgs, _] = js.native
  
  def isDependee[TSource, TContext, TArgs](resolver: IFieldResolver[TSource, TContext, TArgs, _]): IFieldResolver[TSource, TContext, TArgs, _] = js.native
  
  def pipeResolvers[TSource, TContext, TArgs](resolvers: (IFieldResolver[TSource, TContext, TArgs, _])*): IFieldResolver[TSource, TContext, TArgs, _] = js.native
  
  def resolveDependee(dependeeName: String): IFieldResolver[_, _, _, _] = js.native
  
  def resolveDependees(dependeeNames: js.Array[String]): IFieldResolver[_, _, _, _] = js.native
  
  val skip: js.UndefOr[scala.Nothing] = js.native
  
  type IFieldResolver[TSource, TContext, TArgs, TReturn] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfomergeIn, 
    TReturn
  ]
  
  type TArgsDefault = StringDictionary[js.Any]
}
