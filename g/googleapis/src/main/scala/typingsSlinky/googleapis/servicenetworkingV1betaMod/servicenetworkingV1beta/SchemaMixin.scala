package typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares an API Interface to be included in this interface. The including
  * interface must redeclare all the methods from the included interface, but
  * documentation and options are inherited as follows:  - If after comment and
  * whitespace stripping, the documentation   string of the redeclared method
  * is empty, it will be inherited   from the original method.  - Each
  * annotation belonging to the service config (http,   visibility) which is
  * not set in the redeclared method will be   inherited.  - If an http
  * annotation is inherited, the path pattern will be   modified as follows.
  * Any version prefix will be replaced by the   version of the including
  * interface plus the root path if   specified.  Example of a simple mixin:
  * package google.acl.v1;     service AccessControl {       // Get the
  * underlying ACL object.       rpc GetAcl(GetAclRequest) returns (Acl) {
  * option (google.api.http).get = &quot;/v1/{resource=**}:getAcl&quot;; } }
  * package google.storage.v2;     service Storage {       //       rpc
  * GetAcl(GetAclRequest) returns (Acl);        // Get a data record.       rpc
  * GetData(GetDataRequest) returns (Data) {         option
  * (google.api.http).get = &quot;/v2/{resource=**}&quot;;       }     }
  * Example of a mixin configuration:      apis:     - name:
  * google.storage.v2.Storage       mixins:       - name:
  * google.acl.v1.AccessControl  The mixin construct implies that all methods
  * in `AccessControl` are also declared with same name and request/response
  * types in `Storage`. A documentation generator or annotation processor will
  * see the effective `Storage.GetAcl` method after inherting documentation and
  * annotations as follows:      service Storage {       // Get the underlying
  * ACL object.       rpc GetAcl(GetAclRequest) returns (Acl) {         option
  * (google.api.http).get = &quot;/v2/{resource=**}:getAcl&quot;;       } ...
  * }  Note how the version in the path pattern changed from `v1` to `v2`.  If
  * the `root` field in the mixin is specified, it should be a relative path
  * under which inherited HTTP paths are placed. Example:      apis:     -
  * name: google.storage.v2.Storage       mixins:       - name:
  * google.acl.v1.AccessControl         root: acls  This implies the following
  * inherited HTTP annotation:      service Storage {       // Get the
  * underlying ACL object.       rpc GetAcl(GetAclRequest) returns (Acl) {
  * option (google.api.http).get = &quot;/v2/acls/{resource=**}:getAcl&quot;;
  * }       ...     }
  */
@js.native
trait SchemaMixin extends js.Object {
  
  /**
    * The fully qualified name of the interface which is included.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If non-empty specifies a path under which inherited HTTP paths are
    * rooted.
    */
  var root: js.UndefOr[String] = js.native
}
object SchemaMixin {
  
  @scala.inline
  def apply(): SchemaMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMixin]
  }
  
  @scala.inline
  implicit class SchemaMixinOps[Self <: SchemaMixin] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
