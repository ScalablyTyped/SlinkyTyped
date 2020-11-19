package typingsSlinky.graphqlCompose.mod

import typingsSlinky.graphqlCompose.toInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  
  def apply[TContext](tc: typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[_, TContext]): typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
}
