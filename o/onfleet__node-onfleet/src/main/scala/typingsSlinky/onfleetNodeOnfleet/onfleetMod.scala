package typingsSlinky.onfleetNodeOnfleet

import typingsSlinky.onfleetNodeOnfleet.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onfleetMod {
  
  @JSImport("@onfleet/node-onfleet/onfleet", JSImport.Namespace)
  @js.native
  class ^ protected () extends Onfleet {
    def this(api_key: String) = this()
  }
  
  @js.native
  trait Onfleet extends StObject {
    
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
    implicit class OnfleetMutableBuilder[Self <: Onfleet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmins(value: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^): Self = StObject.set(x, "admins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi(value: BaseUrl): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainers(value: typingsSlinky.onfleetNodeOnfleet.containersMod.^): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinations(value: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubs(value: typingsSlinky.onfleetNodeOnfleet.hubsMod.^): Self = StObject.set(x, "hubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: typingsSlinky.onfleetNodeOnfleet.organizationMod.^): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipients(value: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: typingsSlinky.onfleetNodeOnfleet.tasksMod.^): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeams(value: typingsSlinky.onfleetNodeOnfleet.teamsMod.^): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyKey(value: () => js.Promise[Boolean]): Self = StObject.set(x, "verifyKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebhooks(value: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkers(value: typingsSlinky.onfleetNodeOnfleet.workersMod.^): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    }
  }
}
