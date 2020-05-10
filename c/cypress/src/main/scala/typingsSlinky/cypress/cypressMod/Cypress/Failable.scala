package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failable extends js.Object {
  /**
    * Whether to fail on response codes other than 2xx and 3xx
    *
    * @default {true}
    */
  var failOnStatusCode: Boolean = js.native
  /**
    * Whether Cypress should automatically retry transient network errors under the hood
    *
    * @default {true}
    */
  var retryOnNetworkFailure: Boolean = js.native
  /**
    * Whether Cypress should automatically retry status code errors under the hood
    *
    * @default {false}
    */
  var retryOnStatusCodeFailure: Boolean = js.native
}

object Failable {
  @scala.inline
  def apply(failOnStatusCode: Boolean, retryOnNetworkFailure: Boolean, retryOnStatusCodeFailure: Boolean): Failable = {
    val __obj = js.Dynamic.literal(failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failable]
  }
  @scala.inline
  implicit class FailableOps[Self <: Failable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailOnStatusCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryOnNetworkFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnNetworkFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryOnStatusCodeFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnStatusCodeFailure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

