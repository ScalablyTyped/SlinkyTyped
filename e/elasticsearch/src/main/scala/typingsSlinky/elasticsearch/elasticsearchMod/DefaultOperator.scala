package typingsSlinky.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticsearch.elasticsearchStrings.AND
  - typings.elasticsearch.elasticsearchStrings.OR
*/
trait DefaultOperator extends js.Object

object DefaultOperator {
  @scala.inline
  def AND: typingsSlinky.elasticsearch.elasticsearchStrings.AND = this.cast("AND")
  @scala.inline
  def OR: typingsSlinky.elasticsearch.elasticsearchStrings.OR = this.cast("OR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

