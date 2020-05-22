package typingsSlinky.ecmarkup.anon

import org.scalajs.dom.raw.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grammar extends js.Object {
  var grammar: org.scalajs.dom.raw.Element
  var lists: js.Array[HTMLUListElement]
}

object Grammar {
  @scala.inline
  def apply(grammar: org.scalajs.dom.raw.Element, lists: js.Array[HTMLUListElement]): Grammar = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
}

