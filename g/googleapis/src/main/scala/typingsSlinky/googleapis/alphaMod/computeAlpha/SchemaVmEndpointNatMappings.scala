package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
  */
@js.native
trait SchemaVmEndpointNatMappings extends js.Object {
  /**
    * Name of the VM instance which the endpoint belongs to
    */
  var instanceName: js.UndefOr[String] = js.native
  var interfaceNatMappings: js.UndefOr[js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]] = js.native
}

object SchemaVmEndpointNatMappings {
  @scala.inline
  def apply(): SchemaVmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappings]
  }
  @scala.inline
  implicit class SchemaVmEndpointNatMappingsOps[Self <: SchemaVmEndpointNatMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceNatMappings(value: js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceNatMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceNatMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceNatMappings")(js.undefined)
        ret
    }
  }
  
}

