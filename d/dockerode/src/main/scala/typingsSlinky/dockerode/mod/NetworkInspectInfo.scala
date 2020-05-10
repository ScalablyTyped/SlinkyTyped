package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Information returned from inspecting a network
@js.native
trait NetworkInspectInfo extends js.Object {
  var Attachable: Boolean = js.native
  var Containers: js.UndefOr[StringDictionary[NetworkContainer]] = js.native
  var Created: String = js.native
  var Driver: String = js.native
  var EnableIPv6: Boolean = js.native
  var IPAM: js.UndefOr[typingsSlinky.dockerode.mod.IPAM] = js.native
  var Id: String = js.native
  var Ingress: Boolean = js.native
  var Internal: Boolean = js.native
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  var Name: String = js.native
  var Options: js.UndefOr[StringDictionary[String]] = js.native
  var Scope: String = js.native
}

object NetworkInspectInfo {
  @scala.inline
  def apply(
    Attachable: Boolean,
    Created: String,
    Driver: String,
    EnableIPv6: Boolean,
    Id: String,
    Ingress: Boolean,
    Internal: Boolean,
    Name: String,
    Scope: String
  ): NetworkInspectInfo = {
    val __obj = js.Dynamic.literal(Attachable = Attachable.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], EnableIPv6 = EnableIPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Ingress = Ingress.asInstanceOf[js.Any], Internal = Internal.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInspectInfo]
  }
  @scala.inline
  implicit class NetworkInspectInfoOps[Self <: NetworkInspectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableIPv6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableIPv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIngress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ingress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainers(value: StringDictionary[NetworkContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(js.undefined)
        ret
    }
    @scala.inline
    def withIPAM(value: IPAM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAM")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
  }
  
}

