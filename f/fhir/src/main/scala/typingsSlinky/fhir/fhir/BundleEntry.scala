package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entry in the bundle - will have a resource, or information
  */
@js.native
trait BundleEntry extends BackboneElement {
  /**
    * Contains extended information for property 'fullUrl'.
    */
  var _fullUrl: js.UndefOr[Element] = js.native
  /**
    * Absolute URL for resource (server address, or UUID/OID)
    */
  var fullUrl: js.UndefOr[uri] = js.native
  /**
    * Links related to this entry
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.native
  /**
    * Transaction Related Information
    */
  var request: js.UndefOr[BundleEntryRequest] = js.native
  /**
    * A resource in the bundle
    */
  var resource: js.UndefOr[Resource] = js.native
  /**
    * Transaction Related Information
    */
  var response: js.UndefOr[BundleEntryResponse] = js.native
  /**
    * Search related information
    */
  var search: js.UndefOr[BundleEntrySearch] = js.native
}

object BundleEntry {
  @scala.inline
  def apply(): BundleEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntry]
  }
  @scala.inline
  implicit class BundleEntryOps[Self <: BundleEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_fullUrl(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fullUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_fullUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fullUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFullUrl(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: js.Array[BundleLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: BundleEntryRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: BundleEntryResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: BundleEntrySearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}

