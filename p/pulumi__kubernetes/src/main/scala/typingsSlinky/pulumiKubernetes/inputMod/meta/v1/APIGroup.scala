package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIGroup contains the name, the supported versions, and the preferred version of a group.
  */
@js.native
trait APIGroup extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * name is the name of the group.
    */
  var name: Input[String] = js.native
  /**
    * preferredVersion is the version preferred by the API server, which probably is the storage
    * version.
    */
  var preferredVersion: js.UndefOr[Input[GroupVersionForDiscovery]] = js.native
  /**
    * a map of client CIDR to server address that is serving this group. This is to help clients
    * reach servers in the most network-efficient way possible. Clients can use the appropriate
    * server address as per the CIDR that they match. In case of multiple matches, clients should
    * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
    * client can match. For example: the master will return an internal IP CIDR only, if the
    * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
    * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
    */
  var serverAddressByClientCIDRs: js.UndefOr[Input[js.Array[Input[ServerAddressByClientCIDR]]]] = js.native
  /**
    * versions are the versions supported in this group.
    */
  var versions: Input[js.Array[Input[GroupVersionForDiscovery]]] = js.native
}

object APIGroup {
  @scala.inline
  def apply(name: Input[String], versions: Input[js.Array[Input[GroupVersionForDiscovery]]]): APIGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGroup]
  }
  @scala.inline
  implicit class APIGroupOps[Self <: APIGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Input[js.Array[Input[GroupVersionForDiscovery]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredVersion(value: Input[GroupVersionForDiscovery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withServerAddressByClientCIDRs(value: Input[js.Array[Input[ServerAddressByClientCIDR]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddressByClientCIDRs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerAddressByClientCIDRs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddressByClientCIDRs")(js.undefined)
        ret
    }
  }
  
}

