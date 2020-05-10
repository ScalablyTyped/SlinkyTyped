package typingsSlinky.awsSdkBucketEndpointMiddleware.bucketHostnameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketHostname_ extends js.Object {
  var bucketEndpoint: Boolean = js.native
  var hostname: String = js.native
}

object BucketHostname_ {
  @scala.inline
  def apply(bucketEndpoint: Boolean, hostname: String): BucketHostname_ = {
    val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketHostname_]
  }
  @scala.inline
  implicit class BucketHostname_Ops[Self <: BucketHostname_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

