package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELEMENT_MARKER extends js.Object {
  var marker: element = js.native
}

object ELEMENT_MARKER {
  @scala.inline
  def apply(marker: element): ELEMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ELEMENT_MARKER]
  }
  @scala.inline
  implicit class ELEMENT_MARKEROps[Self <: ELEMENT_MARKER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

