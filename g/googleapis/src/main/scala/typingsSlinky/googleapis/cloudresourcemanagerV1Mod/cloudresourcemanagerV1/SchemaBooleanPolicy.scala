package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used in `policy_type` to specify how `boolean_policy` will behave at this
  * resource.
  */
@js.native
trait SchemaBooleanPolicy extends StObject {
  
  /**
    * If `true`, then the `Policy` is enforced. If `false`, then any
    * configuration is acceptable.  Suppose you have a `Constraint`
    * `constraints/compute.disableSerialPortAccess` with `constraint_default`
    * set to `ALLOW`. A `Policy` for that `Constraint` exhibits the following
    * behavior:   - If the `Policy` at this resource has enforced set to
    * `false`, serial     port connection attempts will be allowed.   - If the
    * `Policy` at this resource has enforced set to `true`, serial     port
    * connection attempts will be refused.   - If the `Policy` at this resource
    * is `RestoreDefault`, serial port     connection attempts will be allowed.
    * - If no `Policy` is set at this resource or anywhere higher in the
    * resource hierarchy, serial port connection attempts will be allowed.   -
    * If no `Policy` is set at this resource, but one exists higher in the
    * resource hierarchy, the behavior is as if the`Policy` were set at this
    * resource.  The following examples demonstrate the different possible
    * layerings:  Example 1 (nearest `Constraint` wins):   `organizations/foo`
    * has a `Policy` with:     {enforced: false}   `projects/bar` has no
    * `Policy` set. The constraint at `projects/bar` and `organizations/foo`
    * will not be enforced.  Example 2 (enforcement gets replaced):
    * `organizations/foo` has a `Policy` with:     {enforced: false}
    * `projects/bar` has a `Policy` with:     {enforced: true} The constraint
    * at `organizations/foo` is not enforced. The constraint at `projects/bar`
    * is enforced.  Example 3 (RestoreDefault):   `organizations/foo` has a
    * `Policy` with:     {enforced: true}   `projects/bar` has a `Policy` with:
    * {RestoreDefault: {}} The constraint at `organizations/foo` is enforced.
    * The constraint at `projects/bar` is not enforced, because
    * `constraint_default` for the `Constraint` is `ALLOW`.
    */
  var enforced: js.UndefOr[Boolean] = js.native
}
object SchemaBooleanPolicy {
  
  @scala.inline
  def apply(): SchemaBooleanPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanPolicy]
  }
  
  @scala.inline
  implicit class SchemaBooleanPolicyMutableBuilder[Self <: SchemaBooleanPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforced(value: Boolean): Self = StObject.set(x, "enforced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcedUndefined: Self = StObject.set(x, "enforced", js.undefined)
  }
}
