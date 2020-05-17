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
*/
trait IntrospectionOutputType extends js.Object

object IntrospectionOutputType {
  @scala.inline
  implicit def apply(value: IntrospectionEnumType): IntrospectionOutputType = value.asInstanceOf[IntrospectionOutputType]
  @scala.inline
  implicit def apply(value: IntrospectionInterfaceType): IntrospectionOutputType = value.asInstanceOf[IntrospectionOutputType]
  @scala.inline
  implicit def apply(value: IntrospectionObjectType): IntrospectionOutputType = value.asInstanceOf[IntrospectionOutputType]
  @scala.inline
  implicit def apply(value: IntrospectionScalarType): IntrospectionOutputType = value.asInstanceOf[IntrospectionOutputType]
  @scala.inline
  implicit def apply(value: IntrospectionUnionType): IntrospectionOutputType = value.asInstanceOf[IntrospectionOutputType]
}

