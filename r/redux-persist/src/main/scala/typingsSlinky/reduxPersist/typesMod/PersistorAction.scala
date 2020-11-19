package typingsSlinky.reduxPersist.typesMod

import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxPersist.typesMod.RehydrateAction
  - typingsSlinky.reduxPersist.typesMod.RegisterAction
*/
trait PersistorAction extends js.Object
object PersistorAction {
  
  @scala.inline
  def RehydrateAction(key: String, `type`: persistSlashREHYDRATE): PersistorAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorAction]
  }
  
  @scala.inline
  def RegisterAction(key: String, `type`: persistSlashREGISTER): PersistorAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorAction]
  }
}
