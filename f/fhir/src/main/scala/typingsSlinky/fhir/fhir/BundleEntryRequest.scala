package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transaction Related Information
  */
@js.native
trait BundleEntryRequest extends BackboneElement {
  /**
    * Contains extended information for property 'ifMatch'.
    */
  var _ifMatch: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'ifModifiedSince'.
    */
  var _ifModifiedSince: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'ifNoneExist'.
    */
  var _ifNoneExist: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'ifNoneMatch'.
    */
  var _ifNoneMatch: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'method'.
    */
  var _method: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * For managing update contention
    */
  var ifMatch: js.UndefOr[String] = js.native
  /**
    * For managing update contention
    */
  var ifModifiedSince: js.UndefOr[instant] = js.native
  /**
    * For conditional creates
    */
  var ifNoneExist: js.UndefOr[String] = js.native
  /**
    * For managing cache currency
    */
  var ifNoneMatch: js.UndefOr[String] = js.native
  /**
    * GET | POST | PUT | DELETE
    */
  var method: code = js.native
  /**
    * URL for HTTP equivalent of this entry
    */
  var url: uri = js.native
}

object BundleEntryRequest {
  @scala.inline
  def apply(method: code, url: uri): BundleEntryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryRequest]
  }
  @scala.inline
  implicit class BundleEntryRequestOps[Self <: BundleEntryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ifMatch(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ifMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifMatch")(js.undefined)
        ret
    }
    @scala.inline
    def with_ifModifiedSince(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifModifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ifModifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifModifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def with_ifNoneExist(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifNoneExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ifNoneExist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifNoneExist")(js.undefined)
        ret
    }
    @scala.inline
    def with_ifNoneMatch(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifNoneMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ifNoneMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifNoneMatch")(js.undefined)
        ret
    }
    @scala.inline
    def with_method(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_method")(js.undefined)
        ret
    }
    @scala.inline
    def with_url(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfModifiedSince(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifModifiedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfModifiedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifModifiedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNoneExist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNoneExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNoneExist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNoneExist")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNoneMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNoneMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNoneMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNoneMatch")(js.undefined)
        ret
    }
  }
  
}

