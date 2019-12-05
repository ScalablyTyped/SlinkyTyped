package typingsSlinky.esquery.esqueryMod

import typingsSlinky.esquery.esqueryStrings.regexp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpSelector extends Atom {
  @JSName("type")
  var type_RegExpSelector: regexp
  var value: js.RegExp
}

object RegExpSelector {
  @scala.inline
  def apply(`type`: regexp, value: js.RegExp): RegExpSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpSelector]
  }
}

