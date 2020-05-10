package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReferencesRequest extends js.Object {
  /**
    * If present, return references for which a prefix of any of
    * sourceAccessions match
    * any of these strings. Accession numbers typically have a main number and a
    * version, for example `GCF_000001405.26`.
    */
  var accessions: js.UndefOr[js.Array[String]] = js.native
  /**
    * If present, return references for which the
    * md5checksum matches exactly.
    */
  var md5checksums: js.UndefOr[js.Array[String]] = js.native
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024. The maximum value is 4096.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** If present, return only references which belong to this reference set. */
  var referenceSetId: js.UndefOr[String] = js.native
}

object SearchReferencesRequest {
  @scala.inline
  def apply(): SearchReferencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchReferencesRequest]
  }
  @scala.inline
  implicit class SearchReferencesRequestOps[Self <: SearchReferencesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessions")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5checksums(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5checksums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5checksums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5checksums")(js.undefined)
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
    def withReferenceSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSetId")(js.undefined)
        ret
    }
  }
  
}

