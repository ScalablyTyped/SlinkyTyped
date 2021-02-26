package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.teamMod.Team
import typingsSlinky.contentfulManagement.teamMod.TeamProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofteam extends StObject {
  
  def wrapTeam(http: AxiosInstance, data: TeamProps): Team = js.native
  
  def wrapTeamCollection(http: AxiosInstance, data: CollectionProp[TeamProps]): Collection[Team, TeamProps] = js.native
}
object Typeofteam {
  
  @scala.inline
  def apply(
    wrapTeam: (AxiosInstance, TeamProps) => Team,
    wrapTeamCollection: (AxiosInstance, CollectionProp[TeamProps]) => Collection[Team, TeamProps]
  ): Typeofteam = {
    val __obj = js.Dynamic.literal(wrapTeam = js.Any.fromFunction2(wrapTeam), wrapTeamCollection = js.Any.fromFunction2(wrapTeamCollection))
    __obj.asInstanceOf[Typeofteam]
  }
  
  @scala.inline
  implicit class TypeofteamMutableBuilder[Self <: Typeofteam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapTeam(value: (AxiosInstance, TeamProps) => Team): Self = StObject.set(x, "wrapTeam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTeamCollection(value: (AxiosInstance, CollectionProp[TeamProps]) => Collection[Team, TeamProps]): Self = StObject.set(x, "wrapTeamCollection", js.Any.fromFunction2(value))
  }
}
