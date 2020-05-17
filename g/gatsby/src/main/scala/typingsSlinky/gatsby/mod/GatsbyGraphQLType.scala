package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gatsby.mod.GatsbyGraphQLObjectType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLInputObjectType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLUnionType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLInterfaceType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLEnumType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLScalarType
*/
trait GatsbyGraphQLType extends js.Object

object GatsbyGraphQLType {
  @scala.inline
  implicit def apply(value: GatsbyGraphQLEnumType): GatsbyGraphQLType = value.asInstanceOf[GatsbyGraphQLType]
  @scala.inline
  implicit def apply(value: GatsbyGraphQLInputObjectType): GatsbyGraphQLType = value.asInstanceOf[GatsbyGraphQLType]
  @scala.inline
  implicit def apply(value: GatsbyGraphQLInterfaceType): GatsbyGraphQLType = value.asInstanceOf[GatsbyGraphQLType]
  @scala.inline
  implicit def apply(value: GatsbyGraphQLObjectType): GatsbyGraphQLType = value.asInstanceOf[GatsbyGraphQLType]
  @scala.inline
  implicit def apply(value: GatsbyGraphQLScalarType): GatsbyGraphQLType = value.asInstanceOf[GatsbyGraphQLType]
  @scala.inline
  implicit def apply(value: GatsbyGraphQLUnionType): GatsbyGraphQLType = value.asInstanceOf[GatsbyGraphQLType]
}

