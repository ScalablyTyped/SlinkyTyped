package typingsSlinky.ariaDashQuery.ariaDashQueryMod

import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.boolean
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.id
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.idlist
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.integer
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.number
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.string
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.token
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.tokenlist
import typingsSlinky.ariaDashQuery.ariaDashQueryStrings.tristate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIAPropertyDefinition extends js.Object {
  var allowundefined: js.UndefOr[Boolean] = js.undefined
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate
  var value: js.UndefOr[js.Array[String | Boolean]] = js.undefined
}

object ARIAPropertyDefinition {
  @scala.inline
  def apply(
    `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate,
    allowundefined: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[String | Boolean] = null
  ): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowundefined)) __obj.updateDynamic("allowundefined")(allowundefined.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
}

