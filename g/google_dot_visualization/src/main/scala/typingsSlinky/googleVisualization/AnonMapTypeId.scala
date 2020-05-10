package typingsSlinky.googleVisualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMapTypeId extends js.Object {
  var mapTypeId: AnonName = js.native
}

object AnonMapTypeId {
  @scala.inline
  def apply(mapTypeId: AnonName): AnonMapTypeId = {
    val __obj = js.Dynamic.literal(mapTypeId = mapTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMapTypeId]
  }
  @scala.inline
  implicit class AnonMapTypeIdOps[Self <: AnonMapTypeId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapTypeId(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

