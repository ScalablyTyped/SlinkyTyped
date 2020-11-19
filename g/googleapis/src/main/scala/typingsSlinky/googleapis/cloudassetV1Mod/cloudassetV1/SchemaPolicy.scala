package typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an Identity and Access Management (IAM) policy. It is used to
  * specify access control policies for Cloud Platform resources.   A `Policy`
  * consists of a list of `bindings`. A `binding` binds a list of `members` to
  * a `role`, where the members can be user accounts, Google groups, Google
  * domains, and service accounts. A `role` is a named list of permissions
  * defined by IAM.  **JSON Example**      {       &quot;bindings&quot;: [ {
  * &quot;role&quot;: &quot;roles/owner&quot;,           &quot;members&quot;: [
  * &quot;user:mike@example.com&quot;, &quot;group:admins@example.com&quot;,
  * &quot;domain:google.com&quot;,
  * &quot;serviceAccount:my-other-app@appspot.gserviceaccount.com&quot; ] }, {
  * &quot;role&quot;: &quot;roles/viewer&quot;,           &quot;members&quot;:
  * [&quot;user:sean@example.com&quot;]         }       ]     }  **YAML
  * Example**      bindings:     - members:       - user:mike@example.com -
  * group:admins@example.com       - domain:google.com       -
  * serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
  * roles/owner     - members:       - user:sean@example.com       role:
  * roles/viewer   For a description of IAM and its features, see the [IAM
  * developer&#39;s guide](https://cloud.google.com/iam/docs).
  */
@js.native
trait SchemaPolicy extends js.Object {
  
  /**
    * Specifies cloud audit logging configuration for this policy.
    */
  var auditConfigs: js.UndefOr[js.Array[SchemaAuditConfig]] = js.native
  
  /**
    * Associates a list of `members` to a `role`. `bindings` with no members
    * will result in an error.
    */
  var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.native
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a policy from overwriting each other. It
    * is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform policy updates in order to avoid race
    * conditions: An `etag` is returned in the response to `getIamPolicy`, and
    * systems are expected to put that etag in the request to `setIamPolicy` to
    * ensure that their change will be applied to the same version of the
    * policy.  If no `etag` is provided in the call to `setIamPolicy`, then the
    * existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var version: js.UndefOr[Double] = js.native
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
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
    def setAuditConfigsVarargs(value: SchemaAuditConfig*): Self = this.set("auditConfigs", js.Array(value :_*))
    
    @scala.inline
    def setAuditConfigs(value: js.Array[SchemaAuditConfig]): Self = this.set("auditConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditConfigs: Self = this.set("auditConfigs", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: SchemaBinding*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[SchemaBinding]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
