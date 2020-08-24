package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.anon.CommentDescriptions
import typingsSlinky.graphql.anon.Description
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.getDescription")
@js.native
object getDescription extends js.Object {
  def apply(node: Description): js.UndefOr[String] = js.native
  def apply(node: Description, options: Maybe[CommentDescriptions]): js.UndefOr[String] = js.native
}

