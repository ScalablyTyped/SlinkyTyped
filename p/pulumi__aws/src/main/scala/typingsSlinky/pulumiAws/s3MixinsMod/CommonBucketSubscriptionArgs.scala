package typingsSlinky.pulumiAws.s3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonBucketSubscriptionArgs extends js.Object {
  /**
    * An optional prefix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterPrefix: js.UndefOr[String] = js.native
  /**
    * An optional suffix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterSuffix: js.UndefOr[String] = js.native
}

object CommonBucketSubscriptionArgs {
  @scala.inline
  def apply(): CommonBucketSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonBucketSubscriptionArgs]
  }
  @scala.inline
  implicit class CommonBucketSubscriptionArgsOps[Self <: CommonBucketSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSuffix")(js.undefined)
        ret
    }
  }
  
}

