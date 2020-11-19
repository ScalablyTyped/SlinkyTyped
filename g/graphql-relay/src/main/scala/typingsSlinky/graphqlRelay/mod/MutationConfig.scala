package typingsSlinky.graphqlRelay.mod

import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutationConfig extends js.Object {
  
  var deprecationReason: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var inputFields: Thunk[GraphQLInputFieldConfigMap] = js.native
  
  def mutateAndGetPayload(`object`: js.Any, ctx: js.Any, info: GraphQLResolveInfo): js.Promise[_] | js.Any = js.native
  @JSName("mutateAndGetPayload")
  var mutateAndGetPayload_Original: mutationFn = js.native
  
  var name: String = js.native
  
  var outputFields: Thunk[GraphQLFieldConfigMap[_, _]] = js.native
}
