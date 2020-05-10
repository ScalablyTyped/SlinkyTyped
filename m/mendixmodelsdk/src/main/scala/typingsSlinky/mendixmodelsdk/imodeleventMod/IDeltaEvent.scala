package typingsSlinky.mendixmodelsdk.imodeleventMod

import typingsSlinky.mendixmodelsdk.deltasDeltasMod.Delta
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deltas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeltaEvent extends IModelEvent {
  var deltas: js.Array[Delta] = js.native
  var id: Double = js.native
  var `type`: deltas = js.native
}

object IDeltaEvent {
  @scala.inline
  def apply(deltas: js.Array[Delta], id: Double, `type`: deltas): IDeltaEvent = {
    val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeltaEvent]
  }
  @scala.inline
  implicit class IDeltaEventOps[Self <: IDeltaEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltas(value: js.Array[Delta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: deltas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

