package typingsSlinky.pathDashParser.typingsRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  var name: String
  var pattern: js.RegExp
  var regex: js.UndefOr[js.RegExp | RegExpFactory] = js.undefined
}

object IRule {
  @scala.inline
  def apply(name: String, pattern: js.RegExp, regex: js.RegExp | RegExpFactory = null): IRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRule]
  }
}

