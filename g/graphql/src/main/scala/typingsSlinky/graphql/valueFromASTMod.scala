package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/valueFromAST", JSImport.Namespace)
@js.native
object valueFromASTMod extends js.Object {
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
}

