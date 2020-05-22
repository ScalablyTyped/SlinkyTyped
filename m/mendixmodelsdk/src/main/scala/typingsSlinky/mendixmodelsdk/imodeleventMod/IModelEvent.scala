package typingsSlinky.mendixmodelsdk.imodeleventMod

import typingsSlinky.mendixmodelsdk.deltasDeltasMod.Delta
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deltas
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fileChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.imodeleventMod.IFileEvent
  - typingsSlinky.mendixmodelsdk.imodeleventMod.IDeltaEvent
*/
trait IModelEvent extends js.Object

object IModelEvent {
  @scala.inline
  def IFileEvent(files: js.Array[String], id: Double, `type`: fileChanges): IModelEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelEvent]
  }
  @scala.inline
  def IDeltaEvent(deltas: js.Array[Delta], id: Double, `type`: deltas): IModelEvent = {
    val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelEvent]
  }
}

