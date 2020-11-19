package typingsSlinky.apolloClient.mutationsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/data/mutations", "MutationStore")
@js.native
class MutationStore () extends js.Object {
  
  def get(mutationId: String): MutationStoreValue = js.native
  
  def getStore(): StringDictionary[MutationStoreValue] = js.native
  
  def initMutation(mutationId: String, mutation: DocumentNode): Unit = js.native
  def initMutation(mutationId: String, mutation: DocumentNode, variables: js.Object): Unit = js.native
  
  def markMutationError(mutationId: String, error: js.Error): Unit = js.native
  
  def markMutationResult(mutationId: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  var store: js.Any = js.native
}
