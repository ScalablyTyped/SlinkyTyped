package typingsSlinky.graphqlToolsWrap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.Executor
import typingsSlinky.graphqlToolsDelegate.typesMod.Subscriber
import typingsSlinky.graphqlToolsWrap.typesMod.IMakeRemoteExecutableSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/makeRemoteExecutableSchema", JSImport.Namespace)
@js.native
object makeRemoteExecutableSchemaMod extends js.Object {
  def defaultCreateRemoteResolver(executor: Executor, subscriber: Subscriber): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def makeRemoteExecutableSchema(hasSchemaExecutorSubscriberCreateResolverBuildSchemaOptions: IMakeRemoteExecutableSchemaOptions): GraphQLSchema = js.native
}

