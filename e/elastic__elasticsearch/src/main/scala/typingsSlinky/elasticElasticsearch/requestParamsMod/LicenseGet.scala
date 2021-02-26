package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseGet extends Generic {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
}
object LicenseGet {
  
  @scala.inline
  def apply(): LicenseGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseGet]
  }
  
  @scala.inline
  implicit class LicenseGetMutableBuilder[Self <: LicenseGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_enterprise(value: Boolean): Self = StObject.set(x, "accept_enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_enterpriseUndefined: Self = StObject.set(x, "accept_enterprise", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}
