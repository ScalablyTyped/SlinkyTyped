package typingsSlinky.braintreeWeb.anon

import typingsSlinky.braintreeWeb.braintreeWebNumbers.`1`
import typingsSlinky.braintreeWeb.braintreeWebNumbers.`2`
import typingsSlinky.braintreeWeb.braintreeWebStrings.`2-bootstrap3-modal`
import typingsSlinky.braintreeWeb.braintreeWebStrings.`2-inline-iframe`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends StObject {
  
  var authorization: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[typingsSlinky.braintreeWeb.clientMod.Client] = js.native
  
  var version: js.UndefOr[
    `1` | typingsSlinky.braintreeWeb.braintreeWebStrings.`1` | `2` | typingsSlinky.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
  ] = js.native
}
object Version {
  
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typingsSlinky.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setVersion(
      value: `1` | typingsSlinky.braintreeWeb.braintreeWebStrings.`1` | `2` | typingsSlinky.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
