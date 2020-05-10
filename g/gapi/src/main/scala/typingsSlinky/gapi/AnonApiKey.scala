package typingsSlinky.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiKey extends js.Object {
  /**
    * The API Key to use.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * The app's client ID, found and created in the Google Developers Console.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * An array of discovery doc URLs or discovery doc JSON objects.
    */
  var discoveryDocs: js.UndefOr[js.Array[String]] = js.native
  var hosted_domain: js.UndefOr[String] = js.native
  /**
    * The scopes to request, as a space-delimited string.
    */
  var scope: js.UndefOr[String] = js.native
}

object AnonApiKey {
  @scala.inline
  def apply(): AnonApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApiKey]
  }
  @scala.inline
  implicit class AnonApiKeyOps[Self <: AnonApiKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscoveryDocs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveryDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withHosted_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosted_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

