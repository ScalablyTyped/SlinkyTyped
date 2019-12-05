package typingsSlinky.atOnfleetNodeDashOnfleet.onfleetMod

import typingsSlinky.atOnfleetNodeDashOnfleet.Anon_BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onfleet extends js.Object {
  var admins: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod.^
  var api: Anon_BaseUrl
  var apiKey: String
  var containers: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesContainersMod.^
  var destinations: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.^
  var hubs: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesHubsMod.^
  var organization: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesOrganizationMod.^
  var recipients: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesRecipientsMod.^
  var tasks: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesTasksMod.^
  var teams: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesTeamsMod.^
  var webhooks: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.^
  var workers: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesWorkersMod.^
  def verifyKey(): Boolean
}

object Onfleet {
  @scala.inline
  def apply(
    admins: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod.^,
    api: Anon_BaseUrl,
    apiKey: String,
    containers: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesContainersMod.^,
    destinations: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.^,
    hubs: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesHubsMod.^,
    organization: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesOrganizationMod.^,
    recipients: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesRecipientsMod.^,
    tasks: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesTasksMod.^,
    teams: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesTeamsMod.^,
    verifyKey: () => Boolean,
    webhooks: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.^,
    workers: typingsSlinky.atOnfleetNodeDashOnfleet.resourcesWorkersMod.^
  ): Onfleet = {
    val __obj = js.Dynamic.literal(admins = admins.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], hubs = hubs.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], verifyKey = js.Any.fromFunction0(verifyKey), webhooks = webhooks.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Onfleet]
  }
}

