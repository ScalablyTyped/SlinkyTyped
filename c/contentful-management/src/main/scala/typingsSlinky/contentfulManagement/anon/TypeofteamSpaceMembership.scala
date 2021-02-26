package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembership
import typingsSlinky.contentfulManagement.teamSpaceMembershipMod.TeamSpaceMembershipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofteamSpaceMembership extends StObject {
  
  def wrapTeamSpaceMembership(http: AxiosInstance, data: TeamSpaceMembershipProps): TeamSpaceMembership = js.native
  
  def wrapTeamSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[TeamSpaceMembershipProps]): Collection[TeamSpaceMembership, TeamSpaceMembershipProps] = js.native
}
object TypeofteamSpaceMembership {
  
  @scala.inline
  def apply(
    wrapTeamSpaceMembership: (AxiosInstance, TeamSpaceMembershipProps) => TeamSpaceMembership,
    wrapTeamSpaceMembershipCollection: (AxiosInstance, CollectionProp[TeamSpaceMembershipProps]) => Collection[TeamSpaceMembership, TeamSpaceMembershipProps]
  ): TypeofteamSpaceMembership = {
    val __obj = js.Dynamic.literal(wrapTeamSpaceMembership = js.Any.fromFunction2(wrapTeamSpaceMembership), wrapTeamSpaceMembershipCollection = js.Any.fromFunction2(wrapTeamSpaceMembershipCollection))
    __obj.asInstanceOf[TypeofteamSpaceMembership]
  }
  
  @scala.inline
  implicit class TypeofteamSpaceMembershipMutableBuilder[Self <: TypeofteamSpaceMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapTeamSpaceMembership(value: (AxiosInstance, TeamSpaceMembershipProps) => TeamSpaceMembership): Self = StObject.set(x, "wrapTeamSpaceMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamSpaceMembershipCollection(
      value: (AxiosInstance, CollectionProp[TeamSpaceMembershipProps]) => Collection[TeamSpaceMembership, TeamSpaceMembershipProps]
    ): Self = StObject.set(x, "wrapTeamSpaceMembershipCollection", js.Any.fromFunction2(value))
  }
}
