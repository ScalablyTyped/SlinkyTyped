package typingsSlinky.d3pie

import typingsSlinky.d3pie.d3pieStrings.inner
import typingsSlinky.d3pie.d3pieStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSection extends js.Object {
  var label: String = js.native
  var section: outer | inner = js.native
  var value: Double = js.native
}

object AnonSection {
  @scala.inline
  def apply(label: String, section: outer | inner, value: Double): AnonSection = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSection]
  }
  @scala.inline
  implicit class AnonSectionOps[Self <: AnonSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: outer | inner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

