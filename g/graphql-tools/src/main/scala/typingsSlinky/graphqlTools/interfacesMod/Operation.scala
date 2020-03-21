package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphqlTools.graphqlToolsStrings.mutation_
import typingsSlinky.graphqlTools.graphqlToolsStrings.query_
import typingsSlinky.graphqlTools.graphqlToolsStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlTools.graphqlToolsStrings.query_
  - typingsSlinky.graphqlTools.graphqlToolsStrings.mutation_
  - typingsSlinky.graphqlTools.graphqlToolsStrings.subscription_
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: mutation_ = this.cast("mutation")
  @scala.inline
  def query: query_ = this.cast("query")
  @scala.inline
  def subscription: subscription_ = this.cast("subscription")
}

