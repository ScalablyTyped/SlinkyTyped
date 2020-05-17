package typingsSlinky.graphqlCompose.objectTypeComposerMod

import typingsSlinky.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext]
  - typingsSlinky.graphqlCompose.definitionsMod.Thunk[
(typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext])]
*/
trait ComposeFieldConfig[TSource, TContext, TArgs] extends js.Object

object ComposeFieldConfig {
  @scala.inline
  implicit def apply[TSource, TContext, TArgs](value: ComposeFieldConfigAsObject[TSource, TContext, TArgs]): ComposeFieldConfig[TSource, TContext, TArgs] = value.asInstanceOf[ComposeFieldConfig[TSource, TContext, TArgs]]
  @scala.inline
  implicit def apply[TSource, TContext, TArgs](value: ComposeOutputType[js.Any, TContext]): ComposeFieldConfig[TSource, TContext, TArgs] = value.asInstanceOf[ComposeFieldConfig[TSource, TContext, TArgs]]
  @scala.inline
  implicit def apply[TSource, TContext, TArgs](
    value: Thunk[
      (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (ComposeOutputType[js.Any, TContext])
    ]
  ): ComposeFieldConfig[TSource, TContext, TArgs] = value.asInstanceOf[ComposeFieldConfig[TSource, TContext, TArgs]]
}

