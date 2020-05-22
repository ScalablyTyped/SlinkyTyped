package typingsSlinky.ariaQuery.mod

import typingsSlinky.ariaQuery.ariaQueryStrings.boolean
import typingsSlinky.ariaQuery.ariaQueryStrings.id
import typingsSlinky.ariaQuery.ariaQueryStrings.idlist
import typingsSlinky.ariaQuery.ariaQueryStrings.integer
import typingsSlinky.ariaQuery.ariaQueryStrings.number
import typingsSlinky.ariaQuery.ariaQueryStrings.string
import typingsSlinky.ariaQuery.ariaQueryStrings.token
import typingsSlinky.ariaQuery.ariaQueryStrings.tokenlist
import typingsSlinky.ariaQuery.ariaQueryStrings.tristate
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
    if (!js.isUndefined(allowundefined)) __obj.updateDynamic("allowundefined")(allowundefined.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
}

