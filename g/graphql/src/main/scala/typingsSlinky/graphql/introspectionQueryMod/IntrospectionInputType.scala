package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionScalarType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionEnumType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionInputObjectType
*/
trait IntrospectionInputType extends js.Object

object IntrospectionInputType {
  @scala.inline
  implicit def apply(value: IntrospectionEnumType): IntrospectionInputType = value.asInstanceOf[IntrospectionInputType]
  @scala.inline
  implicit def apply(value: IntrospectionInputObjectType): IntrospectionInputType = value.asInstanceOf[IntrospectionInputType]
  @scala.inline
  implicit def apply(value: IntrospectionScalarType): IntrospectionInputType = value.asInstanceOf[IntrospectionInputType]
}

