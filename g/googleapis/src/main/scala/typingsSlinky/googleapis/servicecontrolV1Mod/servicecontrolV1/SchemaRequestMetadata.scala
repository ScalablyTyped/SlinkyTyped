package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about the request.
  */
@js.native
trait SchemaRequestMetadata extends js.Object {
  /**
    * The IP address of the caller. For caller from internet, this will be
    * public IPv4 or IPv6 address. For caller from a Compute Engine VM with
    * external IP address, this will be the VM&#39;s external IP address. For
    * caller from a Compute Engine VM without external IP address, if the VM is
    * in the same organization (or project) as the accessed resource,
    * `caller_ip` will be the VM&#39;s internal IPv4 address, otherwise the
    * `caller_ip` will be redacted to &quot;gce-internal-ip&quot;. See
    * https://cloud.google.com/compute/docs/vpc/ for more information.
    */
  var callerIp: js.UndefOr[String] = js.native
  /**
    * The network of the caller. Set only if the network host project is part
    * of the same GCP organization (or project) as the accessed resource. See
    * https://cloud.google.com/compute/docs/vpc/ for more information. This is
    * a scheme-less URI full resource name. For example:
    * &quot;//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID&quot;
    */
  var callerNetwork: js.UndefOr[String] = js.native
  /**
    * The user agent of the caller. This information is not authenticated and
    * should be treated accordingly. For example:  +
    * `google-api-python-client/1.4.0`:     The request was made by the Google
    * API client for Python. +   `Cloud SDK Command Line Tool
    * apitools-client/1.0 gcloud/0.9.62`:     The request was made by the
    * Google Cloud SDK CLI (gcloud). +   `AppEngine-Google;
    * (+http://code.google.com/appengine; appid: s~my-project`:     The request
    * was made from the `my-project` App Engine app. NOLINT
    */
  var callerSuppliedUserAgent: js.UndefOr[String] = js.native
  /**
    * The destination of a network activity, such as accepting a TCP
    * connection. In a multi hop network activity, the destination represents
    * the receiver of the last hop. Only two fields are used in this message,
    * Peer.port and Peer.ip. These fields are optionally populated by those
    * services utilizing the IAM condition feature.
    */
  var destinationAttributes: js.UndefOr[SchemaPeer] = js.native
  /**
    * Request attributes used in IAM condition evaluation. This field contains
    * request attributes like request time and access levels associated with
    * the request.   To get the whole view of the attributes used in IAM
    * condition evaluation, the user must also look into
    * `AuditLog.authentication_info.resource_attributes`.
    */
  var requestAttributes: js.UndefOr[SchemaRequest] = js.native
}

object SchemaRequestMetadata {
  @scala.inline
  def apply(): SchemaRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMetadata]
  }
  @scala.inline
  implicit class SchemaRequestMetadataOps[Self <: SchemaRequestMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerIp")(js.undefined)
        ret
    }
    @scala.inline
    def withCallerNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withCallerSuppliedUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerSuppliedUserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerSuppliedUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerSuppliedUserAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationAttributes(value: SchemaPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestAttributes(value: SchemaRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAttributes")(js.undefined)
        ret
    }
  }
  
}

