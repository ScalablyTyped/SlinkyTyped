package typingsSlinky.grommet.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  var suggestion: js.Any
  var target: HTMLElement | Null
}

object Suggestion {
  @scala.inline
  def apply(suggestion: js.Any, target: HTMLElement = null): Suggestion = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
}

