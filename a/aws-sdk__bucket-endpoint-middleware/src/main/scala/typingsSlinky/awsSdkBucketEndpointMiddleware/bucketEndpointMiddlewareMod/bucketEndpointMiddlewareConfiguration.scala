package typingsSlinky.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bucketEndpointMiddlewareConfiguration extends js.Object {
  var forcePathStyle: js.UndefOr[Boolean] = js.native
  var preformedBucketEndpoint: js.UndefOr[Boolean] = js.native
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.native
}

object bucketEndpointMiddlewareConfiguration {
  @scala.inline
  def apply(): bucketEndpointMiddlewareConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[bucketEndpointMiddlewareConfiguration]
  }
  @scala.inline
  implicit class bucketEndpointMiddlewareConfigurationOps[Self <: bucketEndpointMiddlewareConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForcePathStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPreformedBucketEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preformedBucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreformedBucketEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preformedBucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAccelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDualstackEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDualstackEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDualstackEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDualstackEndpoint")(js.undefined)
        ret
    }
  }
  
}

