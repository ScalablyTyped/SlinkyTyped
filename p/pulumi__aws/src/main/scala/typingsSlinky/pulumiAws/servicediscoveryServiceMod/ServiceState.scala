package typingsSlinky.pulumiAws.servicediscoveryServiceMod

import typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig
import typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig
import typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceState extends js.Object {
  /**
    * The ARN of the service.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the service.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: js.UndefOr[Input[ServiceDnsConfig]] = js.native
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: js.UndefOr[Input[ServiceHealthCheckConfig]] = js.native
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: js.UndefOr[Input[ServiceHealthCheckCustomConfig]] = js.native
  /**
    * The name of the service.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  val namespaceId: js.UndefOr[Input[String]] = js.native
}

object ServiceState {
  @scala.inline
  def apply(): ServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceState]
  }
  @scala.inline
  implicit class ServiceStateOps[Self <: ServiceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsConfig(value: Input[ServiceDnsConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckConfig(value: Input[ServiceHealthCheckConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckCustomConfig(value: Input[ServiceHealthCheckCustomConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckCustomConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckCustomConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckCustomConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceId")(js.undefined)
        ret
    }
  }
  
}

