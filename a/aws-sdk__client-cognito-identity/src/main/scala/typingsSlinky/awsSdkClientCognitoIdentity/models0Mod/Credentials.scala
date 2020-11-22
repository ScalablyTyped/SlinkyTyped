package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  /**
    * <p>The Access Key portion of the credentials.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  var Expiration: js.UndefOr[js.Date] = js.native
  
  /**
    * <p>The Secret Access Key portion of the credentials</p>
    */
  var SecretKey: js.UndefOr[String] = js.native
  
  /**
    * <p>The Session Token portion of the credentials</p>
    */
  var SessionToken: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "Credentials")
@js.native
object Credentials extends js.Object {
  
  def filterSensitiveLog(obj: Credentials): js.Any = js.native
}
