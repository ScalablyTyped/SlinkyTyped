package typingsSlinky.rcSlider.mod

import slinky.core.TagMod
import typingsSlinky.rcSlider.PartialProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTooltipProps extends js.Object {
  var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, TagMod[Any]]] = js.native
  var tipProps: js.UndefOr[PartialProps] = js.native
}

object WithTooltipProps {
  @scala.inline
  def apply(): WithTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithTooltipProps]
  }
  @scala.inline
  implicit class WithTooltipPropsOps[Self <: WithTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTipFormatter(value: /* value */ Double => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTipFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTipProps(value: PartialProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipProps")(js.undefined)
        ret
    }
  }
  
}

