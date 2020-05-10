package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * a map of client CIDR to server address that is serving this group. This is to help clients
    * reach servers in the most network-efficient way possible. Clients can use the appropriate
    * server address as per the CIDR that they match. In case of multiple matches, clients should
    * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
    * client can match. For example: the master will return an internal IP CIDR only, if the
    * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
    * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
    */
  var serverAddressByClientCIDRs: Input[js.Array[Input[ServerAddressByClientCIDR]]] = js.native
  /**
    * versions are the api versions that are available.
    */
  var versions: Input[js.Array[Input[String]]] = js.native
}

object APIVersions {
  @scala.inline
  def apply(
    serverAddressByClientCIDRs: Input[js.Array[Input[ServerAddressByClientCIDR]]],
    versions: Input[js.Array[Input[String]]]
  ): APIVersions = {
    val __obj = js.Dynamic.literal(serverAddressByClientCIDRs = serverAddressByClientCIDRs.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIVersions]
  }
  @scala.inline
  implicit class APIVersionsOps[Self <: APIVersions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerAddressByClientCIDRs(value: Input[js.Array[Input[ServerAddressByClientCIDR]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddressByClientCIDRs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Input[js.Array[Input[String]]]): Self = {
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
  }
  
}

