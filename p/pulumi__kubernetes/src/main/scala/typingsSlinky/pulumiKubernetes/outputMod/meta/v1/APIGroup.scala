package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

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
  val apiVersion: String = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String = js.native
  /**
    * name is the name of the group.
    */
  val name: String = js.native
  /**
    * preferredVersion is the version preferred by the API server, which probably is the storage
    * version.
    */
  val preferredVersion: GroupVersionForDiscovery = js.native
  /**
    * a map of client CIDR to server address that is serving this group. This is to help clients
    * reach servers in the most network-efficient way possible. Clients can use the appropriate
    * server address as per the CIDR that they match. In case of multiple matches, clients should
    * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
    * client can match. For example: the master will return an internal IP CIDR only, if the
    * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
    * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
    */
  val serverAddressByClientCIDRs: js.Array[ServerAddressByClientCIDR] = js.native
  /**
    * versions are the versions supported in this group.
    */
  val versions: js.Array[GroupVersionForDiscovery] = js.native
}

object APIGroup {
  @scala.inline
  def apply(
    apiVersion: String,
    kind: String,
    name: String,
    preferredVersion: GroupVersionForDiscovery,
    serverAddressByClientCIDRs: js.Array[ServerAddressByClientCIDR],
    versions: js.Array[GroupVersionForDiscovery]
  ): APIGroup = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preferredVersion = preferredVersion.asInstanceOf[js.Any], serverAddressByClientCIDRs = serverAddressByClientCIDRs.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGroup]
  }
  @scala.inline
  implicit class APIGroupOps[Self <: APIGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredVersion(value: GroupVersionForDiscovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerAddressByClientCIDRs(value: js.Array[ServerAddressByClientCIDR]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddressByClientCIDRs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[GroupVersionForDiscovery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

