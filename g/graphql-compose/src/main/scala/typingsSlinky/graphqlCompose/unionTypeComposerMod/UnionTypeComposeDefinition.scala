package typingsSlinky.graphqlCompose.unionTypeComposerMod

import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig[TSource, TContext]
*/
trait UnionTypeComposeDefinition[TSource, TContext] extends js.Object

object UnionTypeComposeDefinition {
  @scala.inline
  implicit def apply[TSource, TContext](value: ComposeUnionTypeConfig[TSource, TContext]): UnionTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[UnionTypeComposeDefinition[TSource, TContext]]
  @scala.inline
  implicit def apply[TSource, TContext](value: TypeAsString): UnionTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[UnionTypeComposeDefinition[TSource, TContext]]
}

