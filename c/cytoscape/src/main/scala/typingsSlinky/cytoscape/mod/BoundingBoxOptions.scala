package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBoxOptions extends js.Object {
  /** A boolean indicating whether to include edges in the bounding box (default true). */
  var includeEdges: js.UndefOr[Boolean] = js.native
  /** A boolean indicating whether to include labels in the bounding box (default true). */
  var includeLabels: js.UndefOr[Boolean] = js.native
  /** A boolean indicating whether to include main (node or edge) labels in the bounding box (default true). */
  var includeMainLabels: js.UndefOr[Boolean] = js.native
  /** A boolean indicating whether to include nodes in the bounding box (default true). */
  var includeNodes: js.UndefOr[Boolean] = js.native
  /** A boolean indicating whether to include overlays (such as the one which appears when a node is clicked) in the bounding box (default true). */
  var includeOverlays: js.UndefOr[Boolean] = js.native
  /** A boolean indicating whether to include (edge) source-labels in the bounding box (default true). */
  var includeSourceLabels: js.UndefOr[Boolean] = js.native
  /** A boolean indicating whether to include (edge) target-labels in the bounding box (default true). */
  var includeTargetLabels: js.UndefOr[Boolean] = js.native
}

object BoundingBoxOptions {
  @scala.inline
  def apply(): BoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBoxOptions]
  }
  @scala.inline
  implicit class BoundingBoxOptionsOps[Self <: BoundingBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMainLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMainLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMainLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMainLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeOverlays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOverlays")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSourceLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSourceLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSourceLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSourceLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTargetLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTargetLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTargetLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTargetLabels")(js.undefined)
        ret
    }
  }
  
}

