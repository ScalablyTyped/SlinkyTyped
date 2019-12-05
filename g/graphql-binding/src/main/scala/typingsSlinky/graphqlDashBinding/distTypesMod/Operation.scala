package typingsSlinky.graphqlDashBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlDashBinding.graphqlDashBindingStrings.query
  - typings.graphqlDashBinding.graphqlDashBindingStrings.mutation
  - typings.graphqlDashBinding.graphqlDashBindingStrings.subscription
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typingsSlinky.graphqlDashBinding.graphqlDashBindingStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typingsSlinky.graphqlDashBinding.graphqlDashBindingStrings.query = this.cast("query")
  @scala.inline
  def subscription: typingsSlinky.graphqlDashBinding.graphqlDashBindingStrings.subscription = this.cast("subscription")
}

