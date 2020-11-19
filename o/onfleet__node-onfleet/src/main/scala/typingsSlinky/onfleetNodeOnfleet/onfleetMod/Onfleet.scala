package typingsSlinky.onfleetNodeOnfleet.onfleetMod

import typingsSlinky.onfleetNodeOnfleet.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onfleet extends js.Object {
  
  var admins: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^ = js.native
  
  var api: BaseUrl = js.native
  
  var apiKey: String = js.native
  
  var containers: typingsSlinky.onfleetNodeOnfleet.containersMod.^ = js.native
  
  var destinations: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^ = js.native
  
  var hubs: typingsSlinky.onfleetNodeOnfleet.hubsMod.^ = js.native
  
  var organization: typingsSlinky.onfleetNodeOnfleet.organizationMod.^ = js.native
  
  var recipients: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^ = js.native
  
  var tasks: typingsSlinky.onfleetNodeOnfleet.tasksMod.^ = js.native
  
  var teams: typingsSlinky.onfleetNodeOnfleet.teamsMod.^ = js.native
  
  def verifyKey(): js.Promise[Boolean] = js.native
  
  var webhooks: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^ = js.native
  
  var workers: typingsSlinky.onfleetNodeOnfleet.workersMod.^ = js.native
}
object Onfleet {
  
  @scala.inline
  def apply(
    admins: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^,
    api: BaseUrl,
    apiKey: String,
    containers: typingsSlinky.onfleetNodeOnfleet.containersMod.^,
    destinations: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^,
    hubs: typingsSlinky.onfleetNodeOnfleet.hubsMod.^,
    organization: typingsSlinky.onfleetNodeOnfleet.organizationMod.^,
    recipients: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^,
    tasks: typingsSlinky.onfleetNodeOnfleet.tasksMod.^,
    teams: typingsSlinky.onfleetNodeOnfleet.teamsMod.^,
    verifyKey: () => js.Promise[Boolean],
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdmins(value: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^): Self = this.set("admins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi(value: BaseUrl): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainers(value: typingsSlinky.onfleetNodeOnfleet.containersMod.^): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinations(value: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHubs(value: typingsSlinky.onfleetNodeOnfleet.hubsMod.^): Self = this.set("hubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: typingsSlinky.onfleetNodeOnfleet.organizationMod.^): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasks(value: typingsSlinky.onfleetNodeOnfleet.tasksMod.^): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: typingsSlinky.onfleetNodeOnfleet.teamsMod.^): Self = this.set("teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyKey(value: () => js.Promise[Boolean]): Self = this.set("verifyKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebhooks(value: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^): Self = this.set("webhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkers(value: typingsSlinky.onfleetNodeOnfleet.workersMod.^): Self = this.set("workers", value.asInstanceOf[js.Any])
  }
}
