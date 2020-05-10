package typingsSlinky.msRestAzure.subscriptionClientMod

import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRestAzure.operationsMod.Subscriptions
import typingsSlinky.msRestAzure.operationsMod.Tenants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionClient extends js.Object {
  var acceptLanguage: String = js.native
  var apiVersion: String = js.native
  var credentials: ServiceClientCredentials = js.native
  var generateClientRequestId: Boolean = js.native
  var longRunningOperationRetryTimeout: Double = js.native
  // Operation groups
  var subscriptions: Subscriptions = js.native
  var tenants: Tenants = js.native
}

object SubscriptionClient {
  @scala.inline
  def apply(
    acceptLanguage: String,
    apiVersion: String,
    credentials: ServiceClientCredentials,
    generateClientRequestId: Boolean,
    longRunningOperationRetryTimeout: Double,
    subscriptions: Subscriptions,
    tenants: Tenants
  ): SubscriptionClient = {
    val __obj = js.Dynamic.literal(acceptLanguage = acceptLanguage.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], generateClientRequestId = generateClientRequestId.asInstanceOf[js.Any], longRunningOperationRetryTimeout = longRunningOperationRetryTimeout.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionClient]
  }
  @scala.inline
  implicit class SubscriptionClientOps[Self <: SubscriptionClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: ServiceClientCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateClientRequestId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClientRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongRunningOperationRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longRunningOperationRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: Subscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenants(value: Tenants): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

