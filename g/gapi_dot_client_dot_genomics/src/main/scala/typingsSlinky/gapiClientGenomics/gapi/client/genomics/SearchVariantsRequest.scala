package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchVariantsRequest extends js.Object {
  /**
    * Only return variant calls which belong to call sets with these ids.
    * Leaving this blank returns all variant calls. If a variant has no
    * calls belonging to any of these call sets, it won't be returned at all.
    */
  var callSetIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The end of the window, 0-based exclusive. If unspecified or 0, defaults to
    * the length of the reference.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The maximum number of calls to return in a single page. Note that this
    * limit may be exceeded in the event that a matching variant contains more
    * calls than the requested maximum. If unspecified, defaults to 5000. The
    * maximum value is 10000.
    */
  var maxCalls: js.UndefOr[Double] = js.native
  /**
    * The maximum number of variants to return in a single page. If unspecified,
    * defaults to 5000. The maximum value is 10000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Required. Only return variants in this reference sequence. */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * The beginning of the window (0-based, inclusive) for which
    * overlapping variants should be returned. If unspecified, defaults to 0.
    */
  var start: js.UndefOr[String] = js.native
  /** Only return variants which have exactly this name. */
  var variantName: js.UndefOr[String] = js.native
  /**
    * At most one variant set ID must be provided. Only variants from this
    * variant set will be returned. If omitted, a call set id must be included in
    * the request.
    */
  var variantSetIds: js.UndefOr[js.Array[String]] = js.native
}

object SearchVariantsRequest {
  @scala.inline
  def apply(): SearchVariantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchVariantsRequest]
  }
  @scala.inline
  implicit class SearchVariantsRequestOps[Self <: SearchVariantsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallSetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallSetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCalls")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantName")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantSetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantSetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantSetIds")(js.undefined)
        ret
    }
  }
  
}

