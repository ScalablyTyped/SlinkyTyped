package typingsSlinky.apolloServerCore.typesMod

import typingsSlinky.apolloServerCore.anon.Engine
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLService extends js.Object {
  def executor[TContext](requestContext: GraphQLRequestContextExecutionDidStart[TContext]): ValueOrPromise[GraphQLExecutionResult]
  def load(options: Engine): js.Promise[GraphQLServiceConfig]
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber
}

object GraphQLService {
  @scala.inline
  def apply(
    executor: GraphQLRequestContextExecutionDidStart[js.Any] => ValueOrPromise[GraphQLExecutionResult],
    load: Engine => js.Promise[GraphQLServiceConfig],
    onSchemaChange: SchemaChangeCallback => Unsubscriber
  ): GraphQLService = {
    val __obj = js.Dynamic.literal(executor = js.Any.fromFunction1(executor), load = js.Any.fromFunction1(load), onSchemaChange = js.Any.fromFunction1(onSchemaChange))
    __obj.asInstanceOf[GraphQLService]
  }
}

