package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionNamedTypeRef[typingsSlinky.graphql.introspectionQueryMod.IntrospectionOutputType]
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionListTypeRef[js.Any]
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionNonNullTypeRef[
typingsSlinky.graphql.introspectionQueryMod.IntrospectionNamedTypeRef[typingsSlinky.graphql.introspectionQueryMod.IntrospectionOutputType] | typingsSlinky.graphql.introspectionQueryMod.IntrospectionListTypeRef[js.Any]]
*/
trait IntrospectionOutputTypeRef extends js.Object

object IntrospectionOutputTypeRef {
  @scala.inline
  implicit def apply(value: IntrospectionListTypeRef[js.Any]): IntrospectionOutputTypeRef = value.asInstanceOf[IntrospectionOutputTypeRef]
  @scala.inline
  implicit def apply(value: IntrospectionNamedTypeRef[IntrospectionOutputType]): IntrospectionOutputTypeRef = value.asInstanceOf[IntrospectionOutputTypeRef]
  @scala.inline
  implicit def apply(
    value: IntrospectionNonNullTypeRef[
      IntrospectionNamedTypeRef[IntrospectionOutputType] | IntrospectionListTypeRef[js.Any]
    ]
  ): IntrospectionOutputTypeRef = value.asInstanceOf[IntrospectionOutputTypeRef]
}

