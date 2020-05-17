package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionNamedTypeRef[typingsSlinky.graphql.introspectionQueryMod.IntrospectionType]
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionListTypeRef[js.Any]
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionNonNullTypeRef[
typingsSlinky.graphql.introspectionQueryMod.IntrospectionNamedTypeRef[typingsSlinky.graphql.introspectionQueryMod.IntrospectionType] | typingsSlinky.graphql.introspectionQueryMod.IntrospectionListTypeRef[js.Any]]
*/
trait IntrospectionTypeRef extends js.Object

object IntrospectionTypeRef {
  @scala.inline
  implicit def apply(value: IntrospectionListTypeRef[js.Any]): IntrospectionTypeRef = value.asInstanceOf[IntrospectionTypeRef]
  @scala.inline
  implicit def apply(value: IntrospectionNamedTypeRef[IntrospectionType]): IntrospectionTypeRef = value.asInstanceOf[IntrospectionTypeRef]
  @scala.inline
  implicit def apply(
    value: IntrospectionNonNullTypeRef[IntrospectionNamedTypeRef[IntrospectionType] | IntrospectionListTypeRef[js.Any]]
  ): IntrospectionTypeRef = value.asInstanceOf[IntrospectionTypeRef]
}

