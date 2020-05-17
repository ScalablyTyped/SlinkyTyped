package typingsSlinky.graphql.definitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
  - typingsSlinky.graphql.definitionMod.GraphQLUnionType
*/
trait GraphQLAbstractType extends js.Object

object GraphQLAbstractType {
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLAbstractType = value.asInstanceOf[GraphQLAbstractType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLAbstractType = value.asInstanceOf[GraphQLAbstractType]
}

