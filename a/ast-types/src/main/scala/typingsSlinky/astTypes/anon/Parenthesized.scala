package typingsSlinky.astTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parenthesized extends js.Object {
  var parenthesized: Boolean
}

object Parenthesized {
  @scala.inline
  def apply(parenthesized: Boolean): Parenthesized = {
    val __obj = js.Dynamic.literal(parenthesized = parenthesized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parenthesized]
  }
}

