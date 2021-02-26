package typingsSlinky.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Groups advertisers together so that reports can be generated for the entire
  * group at once.
  */
@js.native
trait SchemaAdvertiserGroup extends StObject {
  
  /**
    * Account ID of this advertiser group. This is a read-only field that can
    * be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * ID of this advertiser group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this advertiser group. This is a required field and must be less
    * than 256 characters long and unique among advertiser groups of the same
    * account.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAdvertiserGroup {
  
  @scala.inline
  def apply(): SchemaAdvertiserGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserGroup]
  }
  
  @scala.inline
  implicit class SchemaAdvertiserGroupMutableBuilder[Self <: SchemaAdvertiserGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
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
  }
}
