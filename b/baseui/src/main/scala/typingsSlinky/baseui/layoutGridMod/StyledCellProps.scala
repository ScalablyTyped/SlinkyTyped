package typingsSlinky.baseui.layoutGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledCellProps extends js.Object {
  @JSName("$align")
  var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  @JSName("$gridColumns")
  var $gridColumns: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridGaps")
  var $gridGaps: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridGutters")
  var $gridGutters: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$gridUnit")
  var $gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.native
  @JSName("$order")
  var $order: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$skip")
  var $skip: js.UndefOr[Responsive[Double]] = js.native
  @JSName("$span")
  var $span: js.UndefOr[Responsive[Double]] = js.native
}

object StyledCellProps {
  @scala.inline
  def apply(): StyledCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledCellProps]
  }
  @scala.inline
  implicit class StyledCellPropsOps[Self <: StyledCellProps] (val x: Self) extends AnyVal {
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
    def with$gridColumns(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gridColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridColumns")(js.undefined)
        ret
    }
    @scala.inline
    def with$gridGaps(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridGaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gridGaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gridGaps")(js.undefined)
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
    @scala.inline
    def with$order(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$order")(js.undefined)
        ret
    }
    @scala.inline
    def with$skip(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$skip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$skip")(js.undefined)
        ret
    }
    @scala.inline
    def with$span(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$span: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$span")(js.undefined)
        ret
    }
  }
  
}

