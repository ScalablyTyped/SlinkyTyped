package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityContext extends StObject {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported The UID to run the entrypoint of the container process. Defaults to user specified in image
    * metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUser: js.UndefOr[Double] = js.native
}
object SecurityContext {
  
  @scala.inline
  def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContext]
  }
  
  @scala.inline
  implicit class SecurityContextMutableBuilder[Self <: SecurityContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunAsUser(value: Double): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUserUndefined: Self = StObject.set(x, "runAsUser", js.undefined)
  }
}
