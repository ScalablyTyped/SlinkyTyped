package typingsSlinky.angularUiTree.AngularUITree

import typingsSlinky.angularUiTree.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventInfo extends js.Object {
  var dest: AnonIndex = js.native
  var elements: js.Any = js.native
  var pos: IPosition = js.native
  var source: IEventSourceInfo = js.native
}

object IEventInfo {
  @scala.inline
  def apply(dest: AnonIndex, elements: js.Any, pos: IPosition, source: IEventSourceInfo): IEventInfo = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventInfo]
  }
  @scala.inline
  implicit class IEventInfoOps[Self <: IEventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: AnonIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElements(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: IEventSourceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

