package typingsSlinky.officeUiFabricReact.stackHorizontalWrapAdvancedExampleMod

import typingsSlinky.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExampleOptions extends js.Object {
  var containerHeight: Double = js.native
  var horizontalAlignment: js.UndefOr[Alignment] = js.native
  var overflow: Overflow = js.native
  var stackWidth: Double = js.native
  var verticalAlignment: js.UndefOr[Alignment] = js.native
}

object IExampleOptions {
  @scala.inline
  def apply(containerHeight: Double, overflow: Overflow, stackWidth: Double): IExampleOptions = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], stackWidth = stackWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
  @scala.inline
  implicit class IExampleOptionsOps[Self <: IExampleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: Overflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
  }
  
}

