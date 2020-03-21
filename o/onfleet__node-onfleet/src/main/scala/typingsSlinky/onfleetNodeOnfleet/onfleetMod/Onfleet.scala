package typingsSlinky.onfleetNodeOnfleet.onfleetMod

import typingsSlinky.onfleetNodeOnfleet.AnonBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onfleet extends js.Object {
  var admins: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^
  var api: AnonBaseUrl
  var apiKey: String
  var containers: typingsSlinky.onfleetNodeOnfleet.containersMod.^
  var destinations: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^
  var hubs: typingsSlinky.onfleetNodeOnfleet.hubsMod.^
  var organization: typingsSlinky.onfleetNodeOnfleet.organizationMod.^
  var recipients: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^
  var tasks: typingsSlinky.onfleetNodeOnfleet.tasksMod.^
  var teams: typingsSlinky.onfleetNodeOnfleet.teamsMod.^
  var webhooks: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^
  var workers: typingsSlinky.onfleetNodeOnfleet.workersMod.^
  def verifyKey(): Boolean
}

object Onfleet {
  @scala.inline
  def apply(
    admins: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^,
    api: AnonBaseUrl,
    apiKey: String,
    containers: typingsSlinky.onfleetNodeOnfleet.containersMod.^,
    destinations: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^,
    hubs: typingsSlinky.onfleetNodeOnfleet.hubsMod.^,
    organization: typingsSlinky.onfleetNodeOnfleet.organizationMod.^,
    recipients: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^,
    tasks: typingsSlinky.onfleetNodeOnfleet.tasksMod.^,
    teams: typingsSlinky.onfleetNodeOnfleet.teamsMod.^,
    verifyKey: () => Boolean,
    webhooks: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^,
    workers: typingsSlinky.onfleetNodeOnfleet.workersMod.^
  ): Onfleet = {
    val __obj = js.Dynamic.literal(admins = admins.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], hubs = hubs.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], verifyKey = js.Any.fromFunction0(verifyKey), webhooks = webhooks.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Onfleet]
  }
}

