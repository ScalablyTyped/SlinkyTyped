package typingsSlinky.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierSpec extends StObject {
  
  /** The configuration of this particular notifier. */
  var notification: js.UndefOr[Notification] = js.native
  
  /** Configurations for secret resources used by this particular notifier. */
  var secrets: js.UndefOr[js.Array[NotifierSecret]] = js.native
}
object NotifierSpec {
  
  @scala.inline
  def apply(): NotifierSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSpec]
  }
  
  @scala.inline
  implicit class NotifierSpecMutableBuilder[Self <: NotifierSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setSecrets(value: js.Array[NotifierSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: NotifierSecret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
  }
}
