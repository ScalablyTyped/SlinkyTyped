package typingsSlinky.mongoose

import typingsSlinky.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlattenMaps extends js.Object {
  var flattenMaps: `true` = js.native
}

object AnonFlattenMaps {
  @scala.inline
  def apply(flattenMaps: `true`): AnonFlattenMaps = {
    val __obj = js.Dynamic.literal(flattenMaps = flattenMaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlattenMaps]
  }
  @scala.inline
  implicit class AnonFlattenMapsOps[Self <: AnonFlattenMaps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlattenMaps(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenMaps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

