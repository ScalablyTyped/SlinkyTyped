package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIVersions lists the versions that are available, to allow clients to discover the API at
  * /api, which is the root path of the legacy v1 API.
  */
@js.native
trait APIVersions extends js.Object {
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
    * versions are the api versions that are available.
    */
  val versions: js.Array[String] = js.native
}

object APIVersions {
  @scala.inline
  def apply(
    apiVersion: String,
    kind: String,
    serverAddressByClientCIDRs: js.Array[ServerAddressByClientCIDR],
    versions: js.Array[String]
  ): APIVersions = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], serverAddressByClientCIDRs = serverAddressByClientCIDRs.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIVersions]
  }
  @scala.inline
  implicit class APIVersionsOps[Self <: APIVersions] (val x: Self) extends AnyVal {
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
    def withServerAddressByClientCIDRs(value: js.Array[ServerAddressByClientCIDR]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddressByClientCIDRs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

