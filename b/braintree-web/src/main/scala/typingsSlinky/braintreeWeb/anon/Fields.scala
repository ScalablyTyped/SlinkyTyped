package typingsSlinky.braintreeWeb.anon

import typingsSlinky.braintreeWeb.hostedFieldsMod.HostedFieldFieldOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  var authorization: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[typingsSlinky.braintreeWeb.clientMod.Client] = js.native
  
  var fields: HostedFieldFieldOptions = js.native
  
  var styles: js.UndefOr[js.Any] = js.native
}
object Fields {
  
  @scala.inline
  def apply(fields: HostedFieldFieldOptions): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typingsSlinky.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setFields(value: HostedFieldFieldOptions): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
