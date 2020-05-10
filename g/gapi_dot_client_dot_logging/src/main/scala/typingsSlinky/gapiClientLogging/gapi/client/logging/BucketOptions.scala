package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketOptions extends js.Object {
  /** The explicit buckets. */
  var explicitBuckets: js.UndefOr[Explicit] = js.native
  /** The exponential buckets. */
  var exponentialBuckets: js.UndefOr[Exponential] = js.native
  /** The linear bucket. */
  var linearBuckets: js.UndefOr[Linear] = js.native
}

object BucketOptions {
  @scala.inline
  def apply(): BucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOptions]
  }
  @scala.inline
  implicit class BucketOptionsOps[Self <: BucketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitBuckets(value: Explicit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withExponentialBuckets(value: Exponential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentialBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponentialBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentialBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withLinearBuckets(value: Linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearBuckets")(js.undefined)
        ret
    }
  }
  
}

