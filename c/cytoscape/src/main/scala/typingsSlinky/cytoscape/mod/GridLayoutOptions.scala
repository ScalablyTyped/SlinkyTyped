package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.anon.Col
import typingsSlinky.cytoscape.cytoscapeStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  // returns { row, col } for element
  def position(node: NodeSingular): Col = js.native
  
  // force num of rows in the grid
  var rows: js.UndefOr[Double] = js.native
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
  implicit class GridLayoutOptionsMutableBuilder[Self <: GridLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidOverlapPadding(value: Double): Self = StObject.set(x, "avoidOverlapPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidOverlapPaddingUndefined: Self = StObject.set(x, "avoidOverlapPadding", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setCondense(value: Boolean): Self = StObject.set(x, "condense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: grid): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: NodeSingular => Col): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
