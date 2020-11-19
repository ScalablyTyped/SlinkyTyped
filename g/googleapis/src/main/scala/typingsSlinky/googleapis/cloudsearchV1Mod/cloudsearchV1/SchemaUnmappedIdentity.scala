package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUnmappedIdentity extends js.Object {
  
  /**
    * The resource name for an external user.
    */
  var externalIdentity: js.UndefOr[SchemaPrincipal] = js.native
  
  /**
    * The resolution status for the external identity.
    */
  var resolutionStatusCode: js.UndefOr[String] = js.native
}
object SchemaUnmappedIdentity {
  
  @scala.inline
  def apply(): SchemaUnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmappedIdentity]
  }
  
  @scala.inline
  implicit class SchemaUnmappedIdentityOps[Self <: SchemaUnmappedIdentity] (val x: Self) extends AnyVal {
    
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
    def setExternalIdentity(value: SchemaPrincipal): Self = this.set("externalIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalIdentity: Self = this.set("externalIdentity", js.undefined)
    
    @scala.inline
    def setResolutionStatusCode(value: String): Self = this.set("resolutionStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionStatusCode: Self = this.set("resolutionStatusCode", js.undefined)
  }
}
