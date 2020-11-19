package typingsSlinky.apolloLink.mod

import typingsSlinky.apolloLink.typesMod.Operation
import typingsSlinky.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-link", "split")
@js.native
object split extends js.Object {
  
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: typingsSlinky.apolloLink.linkMod.ApolloLink): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsSlinky.apolloLink.linkMod.ApolloLink,
    right: typingsSlinky.apolloLink.linkMod.ApolloLink
  ): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsSlinky.apolloLink.linkMod.ApolloLink,
    right: RequestHandler
  ): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: RequestHandler,
    right: typingsSlinky.apolloLink.linkMod.ApolloLink
  ): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
}
