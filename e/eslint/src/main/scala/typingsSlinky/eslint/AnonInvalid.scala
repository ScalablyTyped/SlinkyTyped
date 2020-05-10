package typingsSlinky.eslint

import typingsSlinky.eslint.mod.RuleTester.InvalidTestCase
import typingsSlinky.eslint.mod.RuleTester.ValidTestCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvalid extends js.Object {
  var invalid: js.UndefOr[js.Array[InvalidTestCase]] = js.native
  var valid: js.UndefOr[js.Array[String | ValidTestCase]] = js.native
}

object AnonInvalid {
  @scala.inline
  def apply(): AnonInvalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInvalid]
  }
  @scala.inline
  implicit class AnonInvalidOps[Self <: AnonInvalid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalid(value: js.Array[InvalidTestCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: js.Array[String | ValidTestCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
  }
  
}

