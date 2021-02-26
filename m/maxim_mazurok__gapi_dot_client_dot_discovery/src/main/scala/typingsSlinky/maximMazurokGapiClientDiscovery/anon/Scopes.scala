package typingsSlinky.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scopes extends StObject {
  
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: {  description :string | undefined}}
    */ typingsSlinky.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.Scopes with TopLevel[js.Any]
  ] = js.native
}
object Scopes {
  
  @scala.inline
  def apply(): Scopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scopes]
  }
  
  @scala.inline
  implicit class ScopesMutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: {  description :string | undefined}}
      */ typingsSlinky.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.Scopes with TopLevel[js.Any]
    ): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
  }
}
