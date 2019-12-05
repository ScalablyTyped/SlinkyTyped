package typingsSlinky.htmlDashParser.htmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpOptions extends js.Object {
  var attribute: js.UndefOr[js.RegExp] = js.undefined
  var name: js.UndefOr[js.RegExp] = js.undefined
}

object RegExpOptions {
  @scala.inline
  def apply(attribute: js.RegExp = null, name: js.RegExp = null): RegExpOptions = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpOptions]
  }
}

