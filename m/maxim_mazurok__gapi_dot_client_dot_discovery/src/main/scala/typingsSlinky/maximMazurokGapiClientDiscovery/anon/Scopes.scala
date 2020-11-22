package typingsSlinky.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scopes extends js.Object {
  
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
  implicit class ScopesOps[Self <: Scopes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScopes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: {  description :string | undefined}}
      */ typingsSlinky.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.Scopes with TopLevel[js.Any]
    ): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}
