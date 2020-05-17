package typingsSlinky.graphqlCompose.objectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.RelationOptsWithFieldConfig[TSource, TContext, TArgs]
*/
trait RelationOpts[TRelationSource, TSource, TContext, TArgs] extends js.Object

object RelationOpts {
  @scala.inline
  implicit def apply[TRelationSource, TSource, TContext, TArgs](value: RelationOptsWithFieldConfig[TSource, TContext, TArgs]): RelationOpts[TRelationSource, TSource, TContext, TArgs] = value.asInstanceOf[RelationOpts[TRelationSource, TSource, TContext, TArgs]]
  @scala.inline
  implicit def apply[TRelationSource, TSource, TContext, TArgs](value: RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]): RelationOpts[TRelationSource, TSource, TContext, TArgs] = value.asInstanceOf[RelationOpts[TRelationSource, TSource, TContext, TArgs]]
}

