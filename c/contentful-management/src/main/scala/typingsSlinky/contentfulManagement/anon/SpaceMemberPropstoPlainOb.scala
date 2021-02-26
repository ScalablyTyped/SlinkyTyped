package typingsSlinky.contentfulManagement.anon

import typingsSlinky.contentfulManagement.commonTypesMod.MetaLinkProps
import typingsSlinky.contentfulManagement.commonTypesMod.MetaSysProps
import typingsSlinky.contentfulManagement.spaceMemberMod.SpaceMemberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/entities/space-member.SpaceMemberProps & {toPlainObject (): contentful-management.contentful-management/dist/typings/entities/space-member.SpaceMemberProps} */
@js.native
trait SpaceMemberPropstoPlainOb extends StObject {
  
  /**
    * User is an admin
    */
  var admin: Boolean = js.native
  
  /**
    * Array of Role Links
    */
  var roles: js.Array[MetaLinkProps] = js.native
  
  var sys: MetaSysProps = js.native
  
  def toPlainObject(): SpaceMemberProps = js.native
}
object SpaceMemberPropstoPlainOb {
  
  @scala.inline
  def apply(
    admin: Boolean,
    roles: js.Array[MetaLinkProps],
    sys: MetaSysProps,
    toPlainObject: () => SpaceMemberProps
  ): SpaceMemberPropstoPlainOb = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[SpaceMemberPropstoPlainOb]
  }
  
  @scala.inline
  implicit class SpaceMemberPropstoPlainObMutableBuilder[Self <: SpaceMemberPropstoPlainOb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPlainObject(value: () => SpaceMemberProps): Self = StObject.set(x, "toPlainObject", js.Any.fromFunction0(value))
  }
}
