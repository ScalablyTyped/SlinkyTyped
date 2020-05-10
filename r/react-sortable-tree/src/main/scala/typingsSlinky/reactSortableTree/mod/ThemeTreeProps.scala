package typingsSlinky.reactSortableTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSortableTree.PartialListProps
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeTreeProps extends js.Object {
  var innerStyle: js.UndefOr[CSSProperties] = js.native
  var nodeContentRenderer: js.UndefOr[NodeRenderer] = js.native
  var placeholderRenderer: js.UndefOr[PlaceholderRenderer] = js.native
  var reactVirtualizedListProps: js.UndefOr[PartialListProps] = js.native
  var rowHeight: js.UndefOr[(js.Function1[/* info */ Index, Double]) | Double] = js.native
  var scaffoldBlockPxWidth: js.UndefOr[Double] = js.native
  var slideRegionSize: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ThemeTreeProps {
  @scala.inline
  def apply(): ThemeTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTreeProps]
  }
  @scala.inline
  implicit class ThemeTreePropsOps[Self <: ThemeTreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeContentRendererFunctionComponent(value: ReactComponentClass[NodeRendererProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeContentRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeContentRendererComponentClass(value: ReactComponentClass[NodeRendererProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeContentRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeContentRenderer(value: NodeRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeContentRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeContentRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeContentRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderRendererFunctionComponent(value: ReactComponentClass[PlaceholderRendererProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderRendererComponentClass(value: ReactComponentClass[PlaceholderRendererProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderRenderer(value: PlaceholderRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withReactVirtualizedListProps(value: PartialListProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactVirtualizedListProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactVirtualizedListProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactVirtualizedListProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeightFunction1(value: /* info */ Index => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeight(value: (js.Function1[/* info */ Index, Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScaffoldBlockPxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaffoldBlockPxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaffoldBlockPxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaffoldBlockPxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideRegionSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideRegionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideRegionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideRegionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

