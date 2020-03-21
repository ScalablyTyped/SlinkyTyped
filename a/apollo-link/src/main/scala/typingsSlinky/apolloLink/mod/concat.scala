package typingsSlinky.apolloLink.mod

import typingsSlinky.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "concat")
@js.native
object concat extends js.Object {
  def apply(
    first: typingsSlinky.apolloLink.linkMod.ApolloLink,
    second: typingsSlinky.apolloLink.linkMod.ApolloLink
  ): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: typingsSlinky.apolloLink.linkMod.ApolloLink, second: RequestHandler): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: typingsSlinky.apolloLink.linkMod.ApolloLink): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: RequestHandler): typingsSlinky.apolloLink.linkMod.ApolloLink = js.native
}

