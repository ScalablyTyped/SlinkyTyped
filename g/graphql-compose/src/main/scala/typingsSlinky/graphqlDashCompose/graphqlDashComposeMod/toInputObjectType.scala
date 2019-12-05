package typingsSlinky.graphqlDashCompose.graphqlDashComposeMod

import typingsSlinky.graphqlDashCompose.libUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](
    tc: typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]
  ): typingsSlinky.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typingsSlinky.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): typingsSlinky.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typingsSlinky.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

