package typingsSlinky.onfleetNodeOnfleet.onfleetMod

import typingsSlinky.onfleetNodeOnfleet.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@onfleet/node-onfleet/onfleet", JSImport.Namespace)
@js.native
class ^ protected () extends Onfleet {
  def this(api_key: String) = this()
  /* CompleteClass */
  override var admins: typingsSlinky.onfleetNodeOnfleet.administratorsMod.^ = js.native
  /* CompleteClass */
  override var api: BaseUrl = js.native
  /* CompleteClass */
  override var apiKey: String = js.native
  /* CompleteClass */
  override var containers: typingsSlinky.onfleetNodeOnfleet.containersMod.^ = js.native
  /* CompleteClass */
  override var destinations: typingsSlinky.onfleetNodeOnfleet.destinationsMod.^ = js.native
  /* CompleteClass */
  override var hubs: typingsSlinky.onfleetNodeOnfleet.hubsMod.^ = js.native
  /* CompleteClass */
  override var organization: typingsSlinky.onfleetNodeOnfleet.organizationMod.^ = js.native
  /* CompleteClass */
  override var recipients: typingsSlinky.onfleetNodeOnfleet.recipientsMod.^ = js.native
  /* CompleteClass */
  override var tasks: typingsSlinky.onfleetNodeOnfleet.tasksMod.^ = js.native
  /* CompleteClass */
  override var teams: typingsSlinky.onfleetNodeOnfleet.teamsMod.^ = js.native
  /* CompleteClass */
  override var webhooks: typingsSlinky.onfleetNodeOnfleet.webhooksMod.^ = js.native
  /* CompleteClass */
  override var workers: typingsSlinky.onfleetNodeOnfleet.workersMod.^ = js.native
  /* CompleteClass */
  override def verifyKey(): js.Promise[Boolean] = js.native
}

