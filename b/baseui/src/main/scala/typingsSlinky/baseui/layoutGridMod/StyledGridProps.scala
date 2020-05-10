package typingsSlinky.baseui.layoutGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledGridProps extends js.Object {
  @JSName("$align")
  var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  @JSName("$behavior")
  var $behavior: js.UndefOr[BEHAVIOR] = js.native
  @JSName("$gridGutters")
  var $gridGutters: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridMargins")
  var $gridMargins: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridMaxWidth")
  var $gridMaxWidth: js.UndefOr[Double] = js.native
  @JSName("$gridUnit")
  var $gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.native
}

object StyledGridProps {
  @scala.inline
  def apply(): StyledGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledGridProps]
  }
  @scala.inline
  implicit class StyledGridPropsOps[Self <: StyledGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$align(value: Responsive[ALIGNMENT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$align: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$align")(js.undefined)
        ret
    }
    @scala.inline
    def with$behavior(value: BEHAVIOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$behavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$behavior")(js.undefined)
        ret
    }
    @scala.inline
    def with$gridGutters(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridGutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gridGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridGutters")(js.undefined)
        ret
    }
    @scala.inline
    def with$gridMargins(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gridMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridMargins")(js.undefined)
        ret
    }
    @scala.inline
    def with$gridMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gridMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def with$gridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gridUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridUnit")(js.undefined)
        ret
    }
  }
  
}

