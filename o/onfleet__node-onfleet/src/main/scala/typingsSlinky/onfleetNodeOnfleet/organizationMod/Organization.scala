package typingsSlinky.onfleetNodeOnfleet.organizationMod

import typingsSlinky.onfleetNodeOnfleet.anon.Tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Organization extends js.Object {
  
  def get(): js.Promise[js.Array[OnfleetOrganization]] = js.native
  def get(id: String): js.Promise[OnfleetOrganization | Delegatee] = js.native
  
  def insertTask(id: String, obj: Tasks): js.Promise[_] = js.native
}
