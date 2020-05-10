package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapedLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // prevents node overlap, may overflow boundingBox if not enough space
  var avoidOverlap: js.UndefOr[Boolean] = js.native
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.native
  // whether to fit to viewport
  var fit: Boolean = js.native
  // Excludes the label when calculating node bounding boxes for the layout algorithm
  var nodeDimensionsIncludeLabels: Boolean = js.native
  // padding used on fit
  var padding: js.UndefOr[Double] = js.native
  // a sorting function to order the nodes
  var sort: js.UndefOr[SortingFunction] = js.native
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  var spacingFactor: js.UndefOr[Double] = js.native
}

object ShapedLayoutOptions {
  @scala.inline
  def apply(fit: Boolean, name: String, nodeDimensionsIncludeLabels: Boolean): ShapedLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapedLayoutOptions]
  }
  @scala.inline
  implicit class ShapedLayoutOptionsOps[Self <: ShapedLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDimensionsIncludeLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDimensionsIncludeLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvoidOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (/* a */ SortableNode, /* b */ SortableNode) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingFactor")(js.undefined)
        ret
    }
  }
  
}

