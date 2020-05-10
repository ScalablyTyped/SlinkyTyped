package typingsSlinky.baseui.layoutGridMod

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.AnonGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends js.Object {
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  var behavior: js.UndefOr[BEHAVIOR] = js.native
  var children: ReactElement | js.Array[ReactElement] = js.native
  var gridColumns: js.UndefOr[Responsive[Double]] = js.native
  var gridGaps: js.UndefOr[Responsive[Double]] = js.native
  var gridGutters: js.UndefOr[Responsive[Double]] = js.native
  var gridMargins: js.UndefOr[Responsive[Double]] = js.native
  var gridMaxWidth: js.UndefOr[Double] = js.native
  var gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.native
  var overrides: js.UndefOr[AnonGrid] = js.native
}

object GridProps {
  @scala.inline
  def apply(children: ReactElement | js.Array[ReactElement]): GridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: Responsive[ALIGNMENT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBehavior(value: BEHAVIOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumns(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridGaps(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridGaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGaps")(js.undefined)
        ret
    }
    @scala.inline
    def withGridGutters(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGutters")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMargins(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMargins")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: AnonGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

