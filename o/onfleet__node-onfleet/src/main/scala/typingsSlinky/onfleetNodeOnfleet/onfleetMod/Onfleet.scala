package typingsSlinky.onfleetNodeOnfleet.onfleetMod

import typingsSlinky.onfleetNodeOnfleet.AnonBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onfleet extends js.Object {
  var admins: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^ = js.native
  var api: AnonBaseUrl = js.native
  var apiKey: String = js.native
  var containers: typingsSlinky.onfleetNodeOnfleet.containersMod.^ = js.native
  var destinations: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^ = js.native
  var hubs: typingsSlinky.onfleetNodeOnfleet.hubsMod.^ = js.native
  var organization: typingsSlinky.onfleetNodeOnfleet.organizationMod.^ = js.native
  var recipients: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^ = js.native
  var tasks: typingsSlinky.onfleetNodeOnfleet.tasksMod.^ = js.native
  var teams: typingsSlinky.onfleetNodeOnfleet.teamsMod.^ = js.native
  var webhooks: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^ = js.native
  var workers: typingsSlinky.onfleetNodeOnfleet.workersMod.^ = js.native
  def verifyKey(): Boolean = js.native
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
  @scala.inline
  implicit class OnfleetOps[Self <: Onfleet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmins(value: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi(value: AnonBaseUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainers(value: typingsSlinky.onfleetNodeOnfleet.containersMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinations(value: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHubs(value: typingsSlinky.onfleetNodeOnfleet.hubsMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: typingsSlinky.onfleetNodeOnfleet.organizationMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: typingsSlinky.onfleetNodeOnfleet.tasksMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: typingsSlinky.onfleetNodeOnfleet.teamsMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifyKey(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWebhooks(value: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkers(value: typingsSlinky.onfleetNodeOnfleet.workersMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

