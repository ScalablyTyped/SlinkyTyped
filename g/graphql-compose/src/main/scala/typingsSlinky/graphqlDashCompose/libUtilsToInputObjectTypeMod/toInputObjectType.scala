package typingsSlinky.graphqlDashCompose.libUtilsToInputObjectTypeMod

import typingsSlinky.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer
import typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: InterfaceTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: InterfaceTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: ObjectTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: ObjectTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
}

