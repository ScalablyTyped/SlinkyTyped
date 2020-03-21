package typingsSlinky.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlBinding.graphqlBindingStrings.query
  - typingsSlinky.graphqlBinding.graphqlBindingStrings.mutation
*/
trait QueryOrMutation extends js.Object

object QueryOrMutation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typingsSlinky.graphqlBinding.graphqlBindingStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typingsSlinky.graphqlBinding.graphqlBindingStrings.query = this.cast("query")
}

