package typingsSlinky.graphqlCompose.schemaComposerMod

import typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
  - typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
  - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
  - typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
  - typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
  - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
*/
trait AnyComposeType[TContext] extends js.Object

object AnyComposeType {
  @scala.inline
  implicit def apply[TContext](value: EnumTypeComposer[TContext]): AnyComposeType[TContext] = value.asInstanceOf[AnyComposeType[TContext]]
  @scala.inline
  implicit def apply[TContext](value: InputTypeComposer[TContext]): AnyComposeType[TContext] = value.asInstanceOf[AnyComposeType[TContext]]
  @scala.inline
  implicit def apply[TContext](value: InterfaceTypeComposer[js.Any, TContext]): AnyComposeType[TContext] = value.asInstanceOf[AnyComposeType[TContext]]
  @scala.inline
  implicit def apply[TContext](value: ObjectTypeComposer[js.Any, TContext]): AnyComposeType[TContext] = value.asInstanceOf[AnyComposeType[TContext]]
  @scala.inline
  implicit def apply[TContext](value: ScalarTypeComposer[TContext]): AnyComposeType[TContext] = value.asInstanceOf[AnyComposeType[TContext]]
  @scala.inline
  implicit def apply[TContext](value: UnionTypeComposer[js.Any, TContext]): AnyComposeType[TContext] = value.asInstanceOf[AnyComposeType[TContext]]
}

