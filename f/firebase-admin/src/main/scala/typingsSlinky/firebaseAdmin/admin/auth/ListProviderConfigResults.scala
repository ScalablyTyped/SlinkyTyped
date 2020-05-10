package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response interface for listing provider configs. This is only available
  * when listing all identity providers' configurations via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listProviderConfigs `listProviderConfigs()`}.
  */
@js.native
trait ListProviderConfigResults extends js.Object {
  /**
    * The next page token, if available.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The list of providers for the specified type in the current page.
    */
  var providerConfigs: js.Array[AuthProviderConfig] = js.native
}

object ListProviderConfigResults {
  @scala.inline
  def apply(providerConfigs: js.Array[AuthProviderConfig]): ListProviderConfigResults = {
    val __obj = js.Dynamic.literal(providerConfigs = providerConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProviderConfigResults]
  }
  @scala.inline
  implicit class ListProviderConfigResultsOps[Self <: ListProviderConfigResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviderConfigs(value: js.Array[AuthProviderConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerConfigs")(value.asInstanceOf[js.Any])
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
  }
  
}

