package typingsSlinky.pulumiAws.inputMod.servicediscovery

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDnsConfig extends js.Object {
  /**
    * An array that contains one DnsRecord object for each resource record set.
    */
  var dnsRecords: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]] = js.native
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  var namespaceId: Input[String] = js.native
  /**
    * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
    */
  var routingPolicy: js.UndefOr[Input[String]] = js.native
}

object ServiceDnsConfig {
  @scala.inline
  def apply(dnsRecords: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]], namespaceId: Input[String]): ServiceDnsConfig = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDnsConfig]
  }
  @scala.inline
  implicit class ServiceDnsConfigOps[Self <: ServiceDnsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsRecords(value: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingPolicy")(js.undefined)
        ret
    }
  }
  
}

