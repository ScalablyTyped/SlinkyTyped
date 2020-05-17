package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLNamedType
  - typingsSlinky.graphqlTools.interfacesMod.TypeWithResolvers
  - scala.Null
*/
trait VisitTypeResult extends js.Object

object VisitTypeResult {
  @scala.inline
  implicit def apply(value: GraphQLNamedType): VisitTypeResult = value.asInstanceOf[VisitTypeResult]
  @scala.inline
  implicit def apply(value: Null): VisitTypeResult = value.asInstanceOf[VisitTypeResult]
  @scala.inline
  implicit def apply(value: TypeWithResolvers): VisitTypeResult = value.asInstanceOf[VisitTypeResult]
}

