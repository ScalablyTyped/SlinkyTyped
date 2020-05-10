package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearBuckets extends js.Object {
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2.
    * See comments on `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i'th linear bucket covers the interval
    * [offset + (i-1) &#42; width, offset + i &#42; width)
    * where i ranges from 1 to num_finite_buckets, inclusive.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The i'th linear bucket covers the interval
    * [offset + (i-1) &#42; width, offset + i &#42; width)
    * where i ranges from 1 to num_finite_buckets, inclusive.
    * Must be strictly positive.
    */
  var width: js.UndefOr[Double] = js.native
}

object LinearBuckets {
  @scala.inline
  def apply(): LinearBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearBuckets]
  }
  @scala.inline
  implicit class LinearBucketsOps[Self <: LinearBuckets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumFiniteBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFiniteBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFiniteBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFiniteBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

