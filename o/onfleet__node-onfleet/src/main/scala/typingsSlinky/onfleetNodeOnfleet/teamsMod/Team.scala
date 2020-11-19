package typingsSlinky.onfleetNodeOnfleet.teamsMod

import typingsSlinky.onfleetNodeOnfleet.anon.Tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Team extends js.Object {
  
  def create(obj: js.Any): js.Promise[OnfleetTeam] = js.native
  
  def deleteOne(id: String): js.Promise[Unit] = js.native
  
  def get(): js.Promise[js.Array[OnfleetTeam]] = js.native
  def get(id: String): js.Promise[OnfleetTeam] = js.native
  
  def insertTask(id: String, obj: Tasks): js.Promise[OnfleetTeam] = js.native
  
  def update(id: String, obj: UpdateTeamProps): js.Promise[OnfleetTeam] = js.native
}
