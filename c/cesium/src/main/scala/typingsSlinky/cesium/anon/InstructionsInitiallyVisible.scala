package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstructionsInitiallyVisible extends js.Object {
  var container: Element | String = js.native
  var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.native
}

object InstructionsInitiallyVisible {
  @scala.inline
  def apply(container: Element | String): InstructionsInitiallyVisible = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionsInitiallyVisible]
  }
  @scala.inline
  implicit class InstructionsInitiallyVisibleOps[Self <: InstructionsInitiallyVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstructionsInitiallyVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsInitiallyVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructionsInitiallyVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsInitiallyVisible")(js.undefined)
        ret
    }
  }
  
}

