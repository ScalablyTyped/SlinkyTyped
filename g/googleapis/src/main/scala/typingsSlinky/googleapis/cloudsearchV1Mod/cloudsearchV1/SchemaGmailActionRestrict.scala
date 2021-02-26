package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail Action restricts (i.e. read/replied/snoozed).
  */
@js.native
trait SchemaGmailActionRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGmailActionRestrict {
  
  @scala.inline
  def apply(): SchemaGmailActionRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailActionRestrict]
  }
  
  @scala.inline
  implicit class SchemaGmailActionRestrictMutableBuilder[Self <: SchemaGmailActionRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
