package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRetryPolicy extends js.Object {
  /**
    * Specify at least one of the valid values.
    */
  var grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents] = js.native
  /**
    * Specify at least one of the following values.
    
    
    
    server-error – HTTP status codes 500, 501,
    502, 503, 504, 505, 506, 507, 508, 510, and 511
    
    
    
    gateway-error – HTTP status codes 502,
    503, and 504
    
    
    
    client-error – HTTP status code 409
    
    
    
    stream-error – Retry on refused
    stream
    
    
    */
  var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.native
  /**
    * The maximum number of retry attempts.
    */
  var maxRetries: MaxRetries = js.native
  /**
    * An object that represents a duration of time.
    */
  var perRetryTimeout: Duration = js.native
  /**
    * Specify a valid value.
    */
  var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.native
}

object GrpcRetryPolicy {
  @scala.inline
  def apply(maxRetries: MaxRetries, perRetryTimeout: Duration): GrpcRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRetryPolicy]
  }
  @scala.inline
  implicit class GrpcRetryPolicyOps[Self <: GrpcRetryPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRetries(value: MaxRetries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerRetryTimeout(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrpcRetryEvents(value: GrpcRetryPolicyEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpcRetryEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcRetryEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpcRetryEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpRetryEvents(value: HttpRetryPolicyEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRetryEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRetryEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRetryEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpRetryEvents(value: TcpRetryPolicyEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpRetryEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpRetryEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpRetryEvents")(js.undefined)
        ret
    }
  }
  
}

