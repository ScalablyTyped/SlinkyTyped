package typingsSlinky.maximMazurokGapiClientAnalytics.anon

import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProfileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRef extends StObject {
  
  /** Account for this link. */
  var accountRef: js.UndefOr[typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.AccountRef] = js.native
  
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.native
  
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[
    typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef
  ] = js.native
}
object AccountRef {
  
  @scala.inline
  def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  @scala.inline
  implicit class AccountRefMutableBuilder[Self <: AccountRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountRef(value: typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.AccountRef): Self = StObject.set(x, "accountRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountRefUndefined: Self = StObject.set(x, "accountRef", js.undefined)
    
    @scala.inline
    def setProfileRef(value: ProfileRef): Self = StObject.set(x, "profileRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileRefUndefined: Self = StObject.set(x, "profileRef", js.undefined)
    
    @scala.inline
    def setWebPropertyRef(value: typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
