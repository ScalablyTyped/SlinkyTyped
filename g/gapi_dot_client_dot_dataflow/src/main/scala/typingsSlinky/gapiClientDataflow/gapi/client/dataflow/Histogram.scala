package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Histogram extends js.Object {
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing
    * buckets with count = 0 are elided. Buckets can store the full range of
    * values of an unsigned long, with ULLONG_MAX falling into the 59th bucket
    * with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Starting index of first stored bucket. The non-inclusive upper-bound of
    * the ith bucket is given by:
    * pow(10,(i-first_bucket_offset)/3) &#42; (1,2,5)[(i-first_bucket_offset)%3]
    */
  var firstBucketOffset: js.UndefOr[Double] = js.native
}

object Histogram {
  @scala.inline
  def apply(): Histogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Histogram]
  }
  @scala.inline
  implicit class HistogramOps[Self <: Histogram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketCounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstBucketOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBucketOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBucketOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBucketOffset")(js.undefined)
        ret
    }
  }
  
}

