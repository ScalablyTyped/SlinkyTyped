package typingsSlinky.graphqlCompose.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.graphqlComposeStrings.query
  - typingsSlinky.graphqlCompose.graphqlComposeStrings.mutation
  - typingsSlinky.graphqlCompose.graphqlComposeStrings.subscription
*/
trait ResolverKinds extends js.Object

object ResolverKinds {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typingsSlinky.graphqlCompose.graphqlComposeStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typingsSlinky.graphqlCompose.graphqlComposeStrings.query = this.cast("query")
  @scala.inline
  def subscription: typingsSlinky.graphqlCompose.graphqlComposeStrings.subscription = this.cast("subscription")
}

