package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.roleMod.Role
import typingsSlinky.contentfulManagement.roleMod.RoleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrole extends StObject {
  
  def wrapRole(http: AxiosInstance, data: RoleProps): Role = js.native
  
  def wrapRoleCollection(http: AxiosInstance, data: CollectionProp[RoleProps]): Collection[Role, RoleProps] = js.native
}
object Typeofrole {
  
  @scala.inline
  def apply(
    wrapRole: (AxiosInstance, RoleProps) => Role,
    wrapRoleCollection: (AxiosInstance, CollectionProp[RoleProps]) => Collection[Role, RoleProps]
  ): Typeofrole = {
    val __obj = js.Dynamic.literal(wrapRole = js.Any.fromFunction2(wrapRole), wrapRoleCollection = js.Any.fromFunction2(wrapRoleCollection))
    __obj.asInstanceOf[Typeofrole]
  }
  
  @scala.inline
  implicit class TypeofroleMutableBuilder[Self <: Typeofrole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapRole(value: (AxiosInstance, RoleProps) => Role): Self = StObject.set(x, "wrapRole", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapRoleCollection(value: (AxiosInstance, CollectionProp[RoleProps]) => Collection[Role, RoleProps]): Self = StObject.set(x, "wrapRoleCollection", js.Any.fromFunction2(value))
  }
}
