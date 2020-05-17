package typingsSlinky.keymaster

import typingsSlinky.keymaster.anon.TagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterEvent extends js.Object {
  var srcElement: js.UndefOr[TagName] = js.native
  var target: js.UndefOr[TagName] = js.native
}

object FilterEvent {
  @scala.inline
  def apply(): FilterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterEvent]
  }
  @scala.inline
  implicit class FilterEventOps[Self <: FilterEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrcElement(value: TagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: TagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

