package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.teamMembershipMod.TeamMembership
import typingsSlinky.contentfulManagement.teamMembershipMod.TeamMembershipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofteamMembership extends StObject {
  
  def wrapTeamMembership(http: AxiosInstance, data: TeamMembershipProps): TeamMembership = js.native
  
  def wrapTeamMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamMembershipProps]): Collection[TeamMembership, TeamMembershipProps] = js.native
}
object TypeofteamMembership {
  
  @scala.inline
  def apply(
    wrapTeamMembership: (AxiosInstance, TeamMembershipProps) => TeamMembership,
    wrapTeamMembershipCollection: (AxiosInstance, CollectionProp[TeamMembershipProps]) => Collection[TeamMembership, TeamMembershipProps]
  ): TypeofteamMembership = {
    val __obj = js.Dynamic.literal(wrapTeamMembership = js.Any.fromFunction2(wrapTeamMembership), wrapTeamMembershipCollection = js.Any.fromFunction2(wrapTeamMembershipCollection))
    __obj.asInstanceOf[TypeofteamMembership]
  }
  
  @scala.inline
  implicit class TypeofteamMembershipMutableBuilder[Self <: TypeofteamMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapTeamMembership(value: (AxiosInstance, TeamMembershipProps) => TeamMembership): Self = StObject.set(x, "wrapTeamMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamMembershipCollection(
      value: (AxiosInstance, CollectionProp[TeamMembershipProps]) => Collection[TeamMembership, TeamMembershipProps]
    ): Self = StObject.set(x, "wrapTeamMembershipCollection", js.Any.fromFunction2(value))
  }
}
