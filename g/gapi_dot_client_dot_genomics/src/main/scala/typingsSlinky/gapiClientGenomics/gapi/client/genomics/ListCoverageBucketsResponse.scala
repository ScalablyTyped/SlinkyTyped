package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCoverageBucketsResponse extends js.Object {
  /**
    * The length of each coverage bucket in base pairs. Note that buckets at the
    * end of a reference sequence may be shorter. This value is omitted if the
    * bucket width is infinity (the default behaviour, with no range or
    * `targetBucketWidth`).
    */
  var bucketWidth: js.UndefOr[String] = js.native
  /**
    * The coverage buckets. The list of buckets is sparse; a bucket with 0
    * overlapping reads is not returned. A bucket never crosses more than one
    * reference sequence. Each bucket has width `bucketWidth`, unless
    * its end is the end of the reference sequence.
    */
  var coverageBuckets: js.UndefOr[js.Array[CoverageBucket]] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCoverageBucketsResponse {
  @scala.inline
  def apply(): ListCoverageBucketsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoverageBucketsResponse]
  }
  @scala.inline
  implicit class ListCoverageBucketsResponseOps[Self <: ListCoverageBucketsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageBuckets(value: js.Array[CoverageBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

