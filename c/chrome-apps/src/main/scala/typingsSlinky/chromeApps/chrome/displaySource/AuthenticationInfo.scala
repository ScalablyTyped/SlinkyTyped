package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.AnonPBC
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.PBC
import typingsSlinky.chromeApps.chromeAppsStrings.PIN
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationInfo extends js.Object {
  /**
    * Authentication data (e.g. PIN value).
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Authentication method.
    * @see AuthenticationMethod
    */
  var method: js.UndefOr[
    ToStringLiteral[
      AnonPBC, 
      /* keyof chrome-apps.AnonPBC */ PBC | PIN, 
      Exclude[/* keyof chrome-apps.AnonPBC */ PBC | PIN, PBC | PIN]
    ]
  ] = js.native
}

object AuthenticationInfo {
  @scala.inline
  def apply(): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationInfo]
  }
  @scala.inline
  implicit class AuthenticationInfoOps[Self <: AuthenticationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(
      value: ToStringLiteral[
          AnonPBC, 
          /* keyof chrome-apps.AnonPBC */ PBC | PIN, 
          Exclude[/* keyof chrome-apps.AnonPBC */ PBC | PIN, PBC | PIN]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
  }
  
}

