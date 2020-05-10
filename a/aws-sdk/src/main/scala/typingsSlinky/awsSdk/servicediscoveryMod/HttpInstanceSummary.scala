package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpInstanceSummary extends js.Object {
  /**
    * If you included any attributes when you registered the instance, the values of those attributes.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Attributes] = js.native
  /**
    * If you configured health checking in the service, the current health status of the service instance.
    */
  var HealthStatus: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HealthStatus] = js.native
  /**
    * The ID of an instance that matches the values that you specified in the request.
    */
  var InstanceId: js.UndefOr[ResourceId] = js.native
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.NamespaceName] = js.native
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.ServiceName] = js.native
}

object HttpInstanceSummary {
  @scala.inline
  def apply(): HttpInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpInstanceSummary]
  }
  @scala.inline
  implicit class HttpInstanceSummaryOps[Self <: HttpInstanceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthStatus(value: HealthStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
  }
  
}

