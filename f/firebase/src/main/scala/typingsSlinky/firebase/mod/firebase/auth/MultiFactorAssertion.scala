package typingsSlinky.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for asserting ownership of a second factor. This is used to
  * facilitate enrollment of a second factor on an existing user
  * or sign-in of a user who already verified the first factor.
  *
  */
@js.native
trait MultiFactorAssertion extends StObject {
  
  /**
    * The identifier of the second factor.
    */
  var factorId: String = js.native
}
object MultiFactorAssertion {
  
  @scala.inline
  def apply(factorId: String): MultiFactorAssertion = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorAssertion]
  }
  
  @scala.inline
  implicit class MultiFactorAssertionMutableBuilder[Self <: MultiFactorAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
  }
}
