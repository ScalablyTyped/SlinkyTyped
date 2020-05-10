package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings controlling the volume of connections to a backend service.
  */
@js.native
trait SchemaCircuitBreakers extends js.Object {
  /**
    * The timeout for new network connections to hosts.
    */
  var connectTimeout: js.UndefOr[SchemaDuration] = js.native
  /**
    * The maximum number of connections to the backend cluster. If not
    * specified, the default is 1024.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * The maximum number of pending requests allowed to the backend cluster. If
    * not specified, the default is 1024.
    */
  var maxPendingRequests: js.UndefOr[Double] = js.native
  /**
    * The maximum number of parallel requests that allowed to the backend
    * cluster. If not specified, the default is 1024.
    */
  var maxRequests: js.UndefOr[Double] = js.native
  /**
    * Maximum requests for a single backend connection. This parameter is
    * respected by both the HTTP/1.1 and HTTP/2 implementations. If not
    * specified, there is no limit. Setting this parameter to 1 will
    * effectively disable keep alive.
    */
  var maxRequestsPerConnection: js.UndefOr[Double] = js.native
  /**
    * The maximum number of parallel retries allowed to the backend cluster. If
    * not specified, the default is 3.
    */
  var maxRetries: js.UndefOr[Double] = js.native
}

object SchemaCircuitBreakers {
  @scala.inline
  def apply(): SchemaCircuitBreakers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCircuitBreakers]
  }
  @scala.inline
  implicit class SchemaCircuitBreakersOps[Self <: SchemaCircuitBreakers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectTimeout(value: SchemaDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPendingRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPendingRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRequestsPerConnection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestsPerConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequestsPerConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestsPerConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
  }
  
}

