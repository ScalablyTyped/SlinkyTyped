package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * DEPRECATED: This field is no longer supported. Instead of using aliases,
    * please specify multiple google.api.Endpoint for each of the intented
    * alias.
    *
    * Additional names that this endpoint will be hosted on.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowing
    * [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka
    * cross-domain traffic, would allow the backends served from this endpoint to
    * receive and respond to HTTP OPTIONS requests. The response will be used by
    * the browser to determine whether the subsequent cross-origin request is
    * allowed to proceed.
    */
  var allowCors: js.UndefOr[Boolean] = js.native
  /**
    * The list of APIs served by this endpoint.
    *
    * If no APIs are specified this translates to "all APIs" exported by the
    * service, as defined in the top-level service configuration.
    */
  var apis: js.UndefOr[js.Array[String]] = js.native
  /** The list of features enabled on this endpoint. */
  var features: js.UndefOr[js.Array[String]] = js.native
  /** The canonical name of this endpoint. */
  var name: js.UndefOr[String] = js.native
  /**
    * The specification of an Internet routable address of API frontend that will
    * handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary).
    * It should be either a valid IPv4 address or a fully-qualified domain name.
    * For example, "8.8.8.8" or "myservice.appspot.com".
    */
  var target: js.UndefOr[String] = js.native
}

object Endpoint {
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCors")(js.undefined)
        ret
    }
    @scala.inline
    def withApis(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apis")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

