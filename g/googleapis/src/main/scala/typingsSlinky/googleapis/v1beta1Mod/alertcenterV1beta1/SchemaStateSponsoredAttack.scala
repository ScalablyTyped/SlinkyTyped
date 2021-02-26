package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A state-sponsored attack alert. Derived from audit logs.
  */
@js.native
trait SchemaStateSponsoredAttack extends StObject {
  
  /**
    * The email of the user this incident was created for.
    */
  var email: js.UndefOr[String] = js.native
}
object SchemaStateSponsoredAttack {
  
  @scala.inline
  def apply(): SchemaStateSponsoredAttack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateSponsoredAttack]
  }
  
  @scala.inline
  implicit class SchemaStateSponsoredAttackMutableBuilder[Self <: SchemaStateSponsoredAttack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
