package typingsSlinky.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apppackagename extends js.Object {
  /**
    * If you have an Android app, you can drive automatic Android downloads from your web sign-in flow.
    */
  var apppackagename: js.UndefOr[String] = js.native
  /**
    * A function in the global namespace, which is called when the sign-in button is rendered and also called after a sign-in flow completes.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Your OAuth 2.0 client ID that you obtained from the Google Developers Console.
    */
  var clientid: js.UndefOr[String] = js.native
  /**
    * Directs the sign-in button to store user and session information in a session cookie and HTML5 session storage on the user's client for the purpose of minimizing HTTP traffic and distinguishing between multiple Google accounts a user might be signed into.
    */
  var cookiepolicy: js.UndefOr[String] = js.native
  /**
    * If true, all previously granted scopes remain granted in each incremental request, for incremental authorization. The default value true is correct for most use cases; use false only if employing delegated auth, where you pass the bearer token to a less-trusted component with lower programmatic authority.
    */
  var includegrantedscopes: js.UndefOr[Boolean] = js.native
  /**
    * If your app will write moments, list the full URI of the types of moments that you intend to write.
    */
  var requestvisibleactions: js.UndefOr[js.Any] = js.native
  /**
    * The OAuth 2.0 scopes for the APIs that you would like to use as a space-delimited list.
    */
  var scope: js.UndefOr[js.Any] = js.native
}

object Apppackagename {
  @scala.inline
  def apply(): Apppackagename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apppackagename]
  }
  @scala.inline
  implicit class ApppackagenameOps[Self <: Apppackagename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApppackagename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apppackagename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApppackagename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apppackagename")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withClientid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientid")(js.undefined)
        ret
    }
    @scala.inline
    def withCookiepolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiepolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookiepolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiepolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludegrantedscopes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includegrantedscopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludegrantedscopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includegrantedscopes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestvisibleactions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestvisibleactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestvisibleactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestvisibleactions")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
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

