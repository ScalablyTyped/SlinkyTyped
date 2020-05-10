package typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Endpoint represents a single logical "backend" implementing a service.
  */
@js.native
trait Endpoint extends js.Object {
  /**
    * addresses of this endpoint. The contents of this field are interpreted according to the
    * corresponding EndpointSlice addressType field. Consumers must handle different types of
    * addresses in the context of their own capabilities. This must contain at least one address
    * but no more than 100.
    */
  var addresses: Input[js.Array[Input[String]]] = js.native
  /**
    * conditions contains information about the current status of the endpoint.
    */
  var conditions: js.UndefOr[Input[EndpointConditions]] = js.native
  /**
    * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish
    * endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same
    * hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label
    * (RFC 1123) validation.
    */
  var hostname: js.UndefOr[Input[String]] = js.native
  /**
    * targetRef is a reference to a Kubernetes object that represents this endpoint.
    */
  var targetRef: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * topology contains arbitrary topology information associated with the endpoint. These
    * key/value pairs must conform with the label format.
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may
    * include a maximum of 16 key/value pairs. This includes, but is not limited to the following
    * well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
    *   where the endpoint is located. This should match the corresponding
    *   node label.
    * * topology.kubernetes.io/zone: the value indicates the zone where the
    *   endpoint is located. This should match the corresponding node label.
    * * topology.kubernetes.io/region: the value indicates the region where the
    *   endpoint is located. This should match the corresponding node label.
    */
  var topology: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object Endpoint {
  @scala.inline
  def apply(addresses: Input[js.Array[Input[String]]]): Endpoint = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: Input[EndpointConditions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRef(value: Input[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(js.undefined)
        ret
    }
    @scala.inline
    def withTopology(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopology: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(js.undefined)
        ret
    }
  }
  
}

