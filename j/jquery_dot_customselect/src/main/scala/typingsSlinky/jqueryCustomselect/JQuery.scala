package typingsSlinky.jqueryCustomselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def customSelect(`val`: JQueryCustomSelectOption): JQuery = js.native
}

object JQuery {
  @scala.inline
  def apply(customSelect: JQueryCustomSelectOption => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(customSelect = js.Any.fromFunction1(customSelect))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSelect(value: JQueryCustomSelectOption => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSelect")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

