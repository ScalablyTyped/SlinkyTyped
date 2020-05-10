package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions extends js.Object {
  /**
    * Original uri to preserve through proxying etc (`xhr.original`).
    */
  var baseUri: js.UndefOr[Node | String] = js.native
  /**
    * Before we parse new data, clear old, but only on status 200 responses.
    */
  var clearPreviousData: js.UndefOr[Boolean] = js.native
  /**
    * Provided content type (for writes).
    */
  var contentType: js.UndefOr[String] = js.native
  var fetch: js.UndefOr[FnCall] = js.native
  /**
    * Load the data even if loaded before. Also sets the `Cache-Control:` header to `no-cache`.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Override the incoming header to force the data to be treated as this content-type (for reads).
    */
  var forceContentType: js.UndefOr[String] = js.native
  /**
    * Prevents the addition of various metadata triples (about the fetch request) to the store.
    */
  var noMeta: js.UndefOr[Boolean] = js.native
  var noRDFa: js.UndefOr[Boolean] = js.native
  /**
    * Whether this request is a retry via a proxy (generally done from an error handler).
    */
  var proxyUsed: js.UndefOr[Boolean] = js.native
  /**
    * The resource which referred to this (for tracking bad links).
    */
  var referringTerm: js.UndefOr[NamedNode_] = js.native
  /**
    * Flag for XHR/CORS etc
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUri(value: Node | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(js.undefined)
        ret
    }
    @scala.inline
    def withClearPreviousData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearPreviousData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearPreviousData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearPreviousData")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withForceContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRDFa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRDFa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRDFa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRDFa")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withReferringTerm(value: NamedNode_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referringTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferringTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referringTerm")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

