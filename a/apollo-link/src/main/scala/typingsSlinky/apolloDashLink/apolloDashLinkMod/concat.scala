package typingsSlinky.apolloDashLink.apolloDashLinkMod

import typingsSlinky.apolloDashLink.libTypesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "concat")
@js.native
object concat extends js.Object {
  def apply(
    first: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink,
    second: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink
  ): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(first: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink, second: RequestHandler): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: RequestHandler): typingsSlinky.apolloDashLink.libLinkMod.ApolloLink = js.native
}

