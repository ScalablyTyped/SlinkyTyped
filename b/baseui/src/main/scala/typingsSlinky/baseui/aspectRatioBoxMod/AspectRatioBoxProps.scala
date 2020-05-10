package typingsSlinky.baseui.aspectRatioBoxMod

import typingsSlinky.baseui.blockMod.BlockProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AspectRatioBoxProps extends BlockProps {
  /** Aspect ratio is width divided by height. */
  var aspectRatio: js.UndefOr[Double] = js.native
}

object AspectRatioBoxProps {
  @scala.inline
  def apply(): AspectRatioBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AspectRatioBoxProps]
  }
  @scala.inline
  implicit class AspectRatioBoxPropsOps[Self <: AspectRatioBoxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
  }
  
}

