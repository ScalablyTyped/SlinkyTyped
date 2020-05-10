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

@js.native
trait ARIAPropertyDefinition extends js.Object {
  var allowundefined: js.UndefOr[Boolean] = js.native
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate = js.native
  var value: js.UndefOr[js.Array[String | Boolean]] = js.native
}

object ARIAPropertyDefinition {
  @scala.inline
  def apply(`type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
  @scala.inline
  implicit class ARIAPropertyDefinitionOps[Self <: ARIAPropertyDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowundefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowundefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowundefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowundefined")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

