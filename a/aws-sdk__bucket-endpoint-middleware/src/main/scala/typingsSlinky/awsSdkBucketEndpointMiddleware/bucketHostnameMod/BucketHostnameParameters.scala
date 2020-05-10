package typingsSlinky.awsSdkBucketEndpointMiddleware.bucketHostnameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketHostnameParameters extends js.Object {
  var accelerateEndpoint: js.UndefOr[Boolean] = js.native
  var baseHostname: String = js.native
  var bucketName: String = js.native
  var dualstackEndpoint: js.UndefOr[Boolean] = js.native
  var pathStyleEndpoint: js.UndefOr[Boolean] = js.native
  var sslCompatible: js.UndefOr[Boolean] = js.native
}

object BucketHostnameParameters {
  @scala.inline
  def apply(baseHostname: String, bucketName: String): BucketHostnameParameters = {
    val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketHostnameParameters]
  }
  @scala.inline
  implicit class BucketHostnameParametersOps[Self <: BucketHostnameParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDualstackEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dualstackEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDualstackEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dualstackEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPathStyleEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathStyleEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathStyleEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathStyleEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCompatible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCompatible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompatible")(js.undefined)
        ret
    }
  }
  
}

