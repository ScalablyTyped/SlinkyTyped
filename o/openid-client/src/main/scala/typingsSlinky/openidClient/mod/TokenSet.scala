package typingsSlinky.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "TokenSet")
@js.native
class TokenSet () extends TokenSetParameters {
  def this(input: TokenSetParameters) = this()
  
  /**
    * Given that the instance has an id_token this function returns its parsed payload object.
    * Does not perform any validations as these were done prior to openid-client returning the
    * tokenset in the first place.
    */
  def claims(): IdTokenClaims = js.native
  
  /**
    * Given that the instance has expires_at / expires_in this function returns true / false when the
    * access token (which expires properties are for) is beyond its lifetime.
    */
  def expired(): Boolean = js.native
  
  var expires_in: js.UndefOr[Double] = js.native
}
