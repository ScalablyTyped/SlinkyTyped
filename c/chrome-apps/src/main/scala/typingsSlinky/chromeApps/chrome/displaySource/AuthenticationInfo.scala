package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.anon.PBC
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.PIN
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
      PBC, 
      /* keyof chrome-apps.anon.PBC */ typingsSlinky.chromeApps.chromeAppsStrings.PBC | PIN, 
      Exclude[
        /* keyof chrome-apps.anon.PBC */ typingsSlinky.chromeApps.chromeAppsStrings.PBC | PIN, 
        typingsSlinky.chromeApps.chromeAppsStrings.PBC | PIN
      ]
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMethod(
      value: ToStringLiteral[
          PBC, 
          /* keyof chrome-apps.anon.PBC */ typingsSlinky.chromeApps.chromeAppsStrings.PBC | PIN, 
          Exclude[
            /* keyof chrome-apps.anon.PBC */ typingsSlinky.chromeApps.chromeAppsStrings.PBC | PIN, 
            typingsSlinky.chromeApps.chromeAppsStrings.PBC | PIN
          ]
        ]
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
