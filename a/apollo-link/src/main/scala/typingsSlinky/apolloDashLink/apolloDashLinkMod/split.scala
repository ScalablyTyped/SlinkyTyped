package typingsSlinky.apolloDashLink.apolloDashLinkMod

import typingsSlinky.apolloDashLink.libTypesMod.Operation
import typingsSlinky.apolloDashLink.libTypesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "split")
@js.native
object split extends js.Object {
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink
  ): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink,
    right: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink
  ): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink,
    right: RequestHandler
  ): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: RequestHandler,
    right: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink
  ): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
}

