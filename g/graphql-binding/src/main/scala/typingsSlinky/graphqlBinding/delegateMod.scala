package typingsSlinky.graphqlBinding

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlBinding.distTypesMod.BindingOptions
import typingsSlinky.graphqlBinding.distTypesMod.Options
import typingsSlinky.graphqlBinding.distTypesMod.QueryOrMutation
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-binding/dist/Delegate", JSImport.Namespace)
@js.native
object delegateMod extends js.Object {
  
  @js.native
  class Delegate protected () extends js.Object {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
    
    def before(): Unit = js.native
    
    def delegate(operation: QueryOrMutation, fieldName: String, args: StringDictionary[js.Any]): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: js.UndefOr[scala.Nothing],
      options: Options
    ): js.Promise[_] = js.native
    def delegate(operation: QueryOrMutation, fieldName: String, args: StringDictionary[js.Any], infoOrQuery: String): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: String,
      options: Options
    ): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: GraphQLResolveInfo
    ): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: GraphQLResolveInfo,
      options: Options
    ): js.Promise[_] = js.native
    
    def delegateSubscription(fieldName: String): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(
      fieldName: String,
      args: js.UndefOr[scala.Nothing],
      infoOrQuery: js.UndefOr[scala.Nothing],
      options: Options
    ): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: js.UndefOr[scala.Nothing], infoOrQuery: String): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: js.UndefOr[scala.Nothing], infoOrQuery: String, options: Options): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: js.UndefOr[scala.Nothing], infoOrQuery: GraphQLResolveInfo): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(
      fieldName: String,
      args: js.UndefOr[scala.Nothing],
      infoOrQuery: GraphQLResolveInfo,
      options: Options
    ): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any]): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: js.UndefOr[scala.Nothing],
      options: Options
    ): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any], infoOrQuery: String): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any], infoOrQuery: String, options: Options): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any], infoOrQuery: GraphQLResolveInfo): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: GraphQLResolveInfo,
      options: Options
    ): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    
    var delegateToSchema: js.Any = js.native
    
    var disableCache: Boolean = js.native
    
    var fragmentReplacements: js.Any = js.native
    
    def getAbstractResolvers(): js.Any = js.native
    def getAbstractResolvers(filterSchema: String): js.Any = js.native
    def getAbstractResolvers(filterSchema: GraphQLSchema): js.Any = js.native
    
    def request[T](query: String): js.Promise[T] = js.native
    def request[T](query: String, variables: StringDictionary[js.Any]): js.Promise[T] = js.native
    
    var schema: GraphQLSchema = js.native
  }
}
