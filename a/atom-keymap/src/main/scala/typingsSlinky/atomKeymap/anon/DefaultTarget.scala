package typingsSlinky.atomKeymap.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTarget extends js.Object {
  var defaultTarget: js.UndefOr[HTMLElement] = js.native
}

object DefaultTarget {
  @scala.inline
  def apply(): DefaultTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTarget]
  }
  @scala.inline
  implicit class DefaultTargetOps[Self <: DefaultTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTarget")(js.undefined)
        ret
    }
  }
  
}

