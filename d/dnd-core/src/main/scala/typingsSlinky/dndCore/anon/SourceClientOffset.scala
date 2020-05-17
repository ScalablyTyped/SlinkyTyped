package typingsSlinky.dndCore.anon

import typingsSlinky.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceClientOffset extends js.Object {
  var clientOffset: XYCoord = js.native
  var sourceClientOffset: XYCoord = js.native
}

object SourceClientOffset {
  @scala.inline
  def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): SourceClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceClientOffset]
  }
  @scala.inline
  implicit class SourceClientOffsetOps[Self <: SourceClientOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceClientOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

