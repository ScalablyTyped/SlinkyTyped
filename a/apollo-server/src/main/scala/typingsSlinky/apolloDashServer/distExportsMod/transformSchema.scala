package typingsSlinky.apolloDashServer.distExportsMod

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.Anon_Transforms
import typingsSlinky.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
}

