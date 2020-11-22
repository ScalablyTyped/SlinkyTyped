package typingsSlinky.contentfulManagement.teamMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/team", "wrapTeamCollection")
@js.native
object wrapTeamCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[TeamProps]): Collection[Team, TeamProps] = js.native
}
