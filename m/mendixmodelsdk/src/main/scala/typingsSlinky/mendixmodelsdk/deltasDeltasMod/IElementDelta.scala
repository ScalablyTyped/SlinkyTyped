package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementDelta extends IDelta {
  var elementId: String = js.native
}

object IElementDelta {
  @scala.inline
  def apply(elementId: String, unitId: String): IElementDelta = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementDelta]
  }
  @scala.inline
  implicit class IElementDeltaOps[Self <: IElementDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

