package typingsSlinky.onfleetNodeOnfleet.containersMod

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.organizations
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.teams
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.workers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  @JSName("get")
  def get_organizations(id: String, group: organizations): js.Promise[OnfleetContainer] = js.native
  @JSName("get")
  def get_teams(id: String, group: teams): js.Promise[OnfleetContainer] = js.native
  @JSName("get")
  def get_workers(id: String, group: workers): js.Promise[OnfleetContainer] = js.native
}
