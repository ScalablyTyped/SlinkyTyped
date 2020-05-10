package typingsSlinky.pulumiAws.routingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The HTTP error code that must match for the redirect to apply. If an error occurs, and if the error code meets
    * this value, then the specified redirect applies.
    *
    * `HttpErrorCodeReturnedEquals` is required if `KeyPrefixEquals` is not specified. If both `KeyPrefixEquals` and
    * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.native
  /**
    * The prefix of the object key name from which requests are redirected.
    *
    * `KeyPrefixEquals` is required if `HttpErrorCodeReturnedEquals` is not specified. If both `KeyPrefixEquals` and
    * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
    */
  var KeyPrefixEquals: js.UndefOr[String] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpErrorCodeReturnedEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpErrorCodeReturnedEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpErrorCodeReturnedEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpErrorCodeReturnedEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPrefixEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPrefixEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefixEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPrefixEquals")(js.undefined)
        ret
    }
  }
  
}

