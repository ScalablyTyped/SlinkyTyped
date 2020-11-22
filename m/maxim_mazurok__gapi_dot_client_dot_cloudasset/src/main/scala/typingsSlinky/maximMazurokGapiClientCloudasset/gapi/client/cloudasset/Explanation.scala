package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explanation extends js.Object {
  
  /**
    * The map from roles to their included permissions that match the permission query (i.e., a query containing `policy.role.permissions:`). Example: if query
    * `policy.role.permissions:compute.disk.get` matches a policy binding that contains owner role, the matched_permissions will be `{"roles/owner": ["compute.disk.get"]}`. The roles can
    * also be found in the returned `policy` bindings. Note that the map is populated only for requests with permission queries.
    */
  var matchedPermissions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.cloudasset.gapi.client.cloudasset.Permissions}
    */ typingsSlinky.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Explanation with TopLevel[js.Any]
  ] = js.native
}
object Explanation {
  
  @scala.inline
  def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit class ExplanationOps[Self <: Explanation] (val x: Self) extends AnyVal {
    
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
    def setMatchedPermissions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudasset.gapi.client.cloudasset.Permissions}
      */ typingsSlinky.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Explanation with TopLevel[js.Any]
    ): Self = this.set("matchedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedPermissions: Self = this.set("matchedPermissions", js.undefined)
  }
}
