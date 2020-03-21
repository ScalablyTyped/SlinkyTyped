package typingsSlinky.graphqlTools

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.IFieldIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/forEachField", JSImport.Namespace)
@js.native
object forEachFieldMod extends js.Object {
  def default(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

