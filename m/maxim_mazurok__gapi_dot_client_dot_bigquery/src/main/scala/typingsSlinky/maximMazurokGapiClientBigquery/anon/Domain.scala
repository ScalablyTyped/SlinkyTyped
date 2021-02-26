package typingsSlinky.maximMazurokGapiClientBigquery.anon

import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.RoutineReference
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.TableReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends StObject {
  
  /**
    * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". Maps to IAM policy member
    * "domain:DOMAIN".
    */
  var domain: js.UndefOr[String] = js.native
  
  /** [Pick one] An email address of a Google Group to grant access to. Maps to IAM policy member "group:GROUP". */
  var groupByEmail: js.UndefOr[String] = js.native
  
  /** [Pick one] Some other type of member that appears in the IAM Policy but isn't a user, group, domain, or special group. */
  var iamMember: js.UndefOr[String] = js.native
  
  /**
    * [Required] An IAM role ID that should be granted to the user, group, or domain specified in this access entry. The following legacy mappings will be applied: OWNER
    * roles/bigquery.dataOwner WRITER  roles/bigquery.dataEditor READER  roles/bigquery.dataViewer This field will accept any of the above formats, but will return only the legacy
    * format. For example, if you set this field to "roles/bigquery.dataOwner", it will be returned back as "OWNER".
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * [Pick one] A routine from a different dataset to grant access to. Queries executed against that routine will have read access to views/tables/routines in this dataset. Only UDF
    * is supported for now. The role field is not required when this field is set. If that routine is updated by any user, access to the routine needs to be granted again via an
    * update operation.
    */
  var routine: js.UndefOr[RoutineReference] = js.native
  
  /**
    * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project.
    * projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users. Maps to similarly-named IAM members.
    */
  var specialGroup: js.UndefOr[String] = js.native
  
  /** [Pick one] An email address of a user to grant access to. For example: fred@example.com. Maps to IAM policy member "user:EMAIL" or "serviceAccount:EMAIL". */
  var userByEmail: js.UndefOr[String] = js.native
  
  /**
    * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The role field is not required
    * when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update operation.
    */
  var view: js.UndefOr[TableReference] = js.native
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setGroupByEmail(value: String): Self = StObject.set(x, "groupByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByEmailUndefined: Self = StObject.set(x, "groupByEmail", js.undefined)
    
    @scala.inline
    def setIamMember(value: String): Self = StObject.set(x, "iamMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamMemberUndefined: Self = StObject.set(x, "iamMember", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRoutine(value: RoutineReference): Self = StObject.set(x, "routine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutineUndefined: Self = StObject.set(x, "routine", js.undefined)
    
    @scala.inline
    def setSpecialGroup(value: String): Self = StObject.set(x, "specialGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialGroupUndefined: Self = StObject.set(x, "specialGroup", js.undefined)
    
    @scala.inline
    def setUserByEmail(value: String): Self = StObject.set(x, "userByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserByEmailUndefined: Self = StObject.set(x, "userByEmail", js.undefined)
    
    @scala.inline
    def setView(value: TableReference): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
