package typingsSlinky.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraClasses extends js.Object {
  var extraClasses: String = js.native
  var layout: js.Any = js.native
}

object ExtraClasses {
  @scala.inline
  def apply(extraClasses: String, layout: js.Any): ExtraClasses = {
    val __obj = js.Dynamic.literal(extraClasses = extraClasses.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraClasses]
  }
  @scala.inline
  implicit class ExtraClassesOps[Self <: ExtraClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

