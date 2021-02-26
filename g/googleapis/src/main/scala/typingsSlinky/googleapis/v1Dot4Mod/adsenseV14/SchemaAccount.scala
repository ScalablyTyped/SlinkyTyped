package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccount extends StObject {
  
  var creation_time: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of this account.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is, in this case adsense#account.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether this account is premium.
    */
  var premium: js.UndefOr[Boolean] = js.native
  
  /**
    * Sub accounts of the this account.
    */
  var subAccounts: js.UndefOr[js.Array[SchemaAccount]] = js.native
  
  /**
    * AdSense timezone of this account.
    */
  var timezone: js.UndefOr[String] = js.native
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    @scala.inline
    def setSubAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "subAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAccountsUndefined: Self = StObject.set(x, "subAccounts", js.undefined)
    
    @scala.inline
    def setSubAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "subAccounts", js.Array(value :_*))
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
