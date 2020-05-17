package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.anon.GraphQLSchematransformsAr
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

