package typingsSlinky.atOnfleetNodeDashOnfleet.resourcesContainersMod

import typingsSlinky.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.organizations
import typingsSlinky.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.teams
import typingsSlinky.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.workers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  @JSName("get")
  def get_organizations(id: String, group: organizations): js.Promise[OnfleetContainer] = js.native
  @JSName("get")
  def get_teams(id: String, group: teams): js.Promise[OnfleetContainer] = js.native
  @JSName("get")
  def get_workers(id: String, group: workers): js.Promise[OnfleetContainer] = js.native
}

