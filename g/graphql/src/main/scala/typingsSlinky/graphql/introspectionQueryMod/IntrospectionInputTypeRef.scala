package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionNamedTypeRef[typingsSlinky.graphql.introspectionQueryMod.IntrospectionInputType]
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionListTypeRef[js.Any]
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionNonNullTypeRef[
typingsSlinky.graphql.introspectionQueryMod.IntrospectionNamedTypeRef[typingsSlinky.graphql.introspectionQueryMod.IntrospectionInputType] | typingsSlinky.graphql.introspectionQueryMod.IntrospectionListTypeRef[js.Any]]
*/
trait IntrospectionInputTypeRef extends js.Object

object IntrospectionInputTypeRef {
  @scala.inline
  implicit def apply(value: IntrospectionListTypeRef[js.Any]): IntrospectionInputTypeRef = value.asInstanceOf[IntrospectionInputTypeRef]
  @scala.inline
  implicit def apply(value: IntrospectionNamedTypeRef[IntrospectionInputType]): IntrospectionInputTypeRef = value.asInstanceOf[IntrospectionInputTypeRef]
  @scala.inline
  implicit def apply(
    value: IntrospectionNonNullTypeRef[
      IntrospectionNamedTypeRef[IntrospectionInputType] | IntrospectionListTypeRef[js.Any]
    ]
  ): IntrospectionInputTypeRef = value.asInstanceOf[IntrospectionInputTypeRef]
}

