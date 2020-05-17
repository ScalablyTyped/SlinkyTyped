package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionScalarType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionObjectType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionInterfaceType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionUnionType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionEnumType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionInputObjectType
*/
trait IntrospectionType extends js.Object

object IntrospectionType {
  @scala.inline
  implicit def apply(value: IntrospectionEnumType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionInputObjectType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionInterfaceType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionObjectType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionScalarType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionUnionType): IntrospectionType = value.asInstanceOf[IntrospectionType]
}

