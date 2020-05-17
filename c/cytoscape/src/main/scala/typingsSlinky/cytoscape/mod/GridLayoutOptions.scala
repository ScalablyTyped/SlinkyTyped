package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.anon.Col
import typingsSlinky.cytoscape.cytoscapeStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/grid
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait GridLayoutOptions extends ShapedLayoutOptions {
  // extra spacing around nodes when avoidOverlap: true
  var avoidOverlapPadding: js.UndefOr[Double] = js.native
  // force num of columns in the grid
  var cols: js.UndefOr[Double] = js.native
  // uses all available space on false, uses minimal space on true
  var condense: Boolean = js.native
  @JSName("name")
  var name_GridLayoutOptions: grid = js.native
  // force num of rows in the grid
  var rows: js.UndefOr[Double] = js.native
  // returns { row, col } for element
  def position(node: NodeSingular): Col = js.native
}

object GridLayoutOptions {
  @scala.inline
  def apply(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => Col
  ): GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[GridLayoutOptions]
  }
  @scala.inline
  implicit class GridLayoutOptionsOps[Self <: GridLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: NodeSingular => Col): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAvoidOverlapPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverlapPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidOverlapPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverlapPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

