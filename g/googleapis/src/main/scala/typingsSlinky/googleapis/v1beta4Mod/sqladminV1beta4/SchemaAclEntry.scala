package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry for an Access Control list.
  */
@js.native
trait SchemaAclEntry extends StObject {
  
  /**
    * The time when this access control entry expires in RFC 3339 format, for
    * example 2012-11-15T16:19:00.094Z.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#aclEntry.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An optional label to identify this entry.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The whitelisted value for the access control list.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaAclEntry {
  
  @scala.inline
  def apply(): SchemaAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclEntry]
  }
  
  @scala.inline
  implicit class SchemaAclEntryMutableBuilder[Self <: SchemaAclEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
