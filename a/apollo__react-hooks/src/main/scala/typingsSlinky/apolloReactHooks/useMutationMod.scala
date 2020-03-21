package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactHooks.typesMod.MutationHookOptions
import typingsSlinky.apolloReactHooks.typesMod.MutationTuple
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useMutation", JSImport.Namespace)
@js.native
object useMutationMod extends js.Object {
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
}

