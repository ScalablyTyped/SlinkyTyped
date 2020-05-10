package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveSections extends js.Object {
  var activeSections: js.Array[Double] = js.native
}

object AnonActiveSections {
  @scala.inline
  def apply(activeSections: js.Array[Double]): AnonActiveSections = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveSections]
  }
  @scala.inline
  implicit class AnonActiveSectionsOps[Self <: AnonActiveSections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveSections(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

