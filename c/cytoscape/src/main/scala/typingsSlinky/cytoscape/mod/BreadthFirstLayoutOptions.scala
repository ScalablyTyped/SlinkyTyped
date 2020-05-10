package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.breadthfirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait BreadthFirstLayoutOptions extends ShapedLayoutOptions {
  // put depths in concentric circles if true, put depths top down if false
  var circle: Boolean = js.native
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: Boolean = js.native
  // how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: Double = js.native
  @JSName("name")
  var name_BreadthFirstLayoutOptions: breadthfirst = js.native
  // the roots of the trees
  var roots: js.UndefOr[String] = js.native
}

object BreadthFirstLayoutOptions {
  @scala.inline
  def apply(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean
  ): BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadthFirstLayoutOptions]
  }
  @scala.inline
  implicit class BreadthFirstLayoutOptionsOps[Self <: BreadthFirstLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximalAdjustments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximalAdjustments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: breadthfirst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoots(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(js.undefined)
        ret
    }
  }
  
}

