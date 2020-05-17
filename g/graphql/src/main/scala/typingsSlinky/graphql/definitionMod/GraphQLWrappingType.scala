package typingsSlinky.graphql.definitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  - typingsSlinky.graphql.definitionMod.GraphQLNonNull[js.Any]
*/
trait GraphQLWrappingType extends js.Object

object GraphQLWrappingType {
  @scala.inline
  implicit def apply(value: GraphQLList[js.Any]): GraphQLWrappingType = value.asInstanceOf[GraphQLWrappingType]
  @scala.inline
  implicit def apply(value: GraphQLNonNull[js.Any]): GraphQLWrappingType = value.asInstanceOf[GraphQLWrappingType]
}

