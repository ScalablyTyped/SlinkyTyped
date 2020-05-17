package typingsSlinky.angularCore.anon

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.angularCore.mod.GlobalTargetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameGlobalTargetName extends js.Object {
  var name: GlobalTargetName = js.native
  var target: EventTarget = js.native
}

object NameGlobalTargetName {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): NameGlobalTargetName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameGlobalTargetName]
  }
  @scala.inline
  implicit class NameGlobalTargetNameOps[Self <: NameGlobalTargetName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: GlobalTargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

