package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.displayed
import typingsSlinky.cytoscape.cytoscapeStrings.none
import typingsSlinky.cytoscape.cytoscapeStrings.visible
import typingsSlinky.cytoscape.mod.EdgeSingular
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#style/visibility
  */
@js.native
trait Visibility[SingularType /* <: NodeSingular | EdgeSingular */] extends js.Object {
  
  /**
    * Whether to display the element; may be element for displayed or none for not displayed.
    * Note that a "display: none" bezier edge does not take up space in its bundle.
    */
  var display: PropertyValue[SingularType, none | displayed] = js.native
  
  /**
    * The opacity of the element, ranging from 0 to 1.
    * Note that the opacity of a compound node parent affects the effective opacity of its children.
    */
  var opacity: PropertyValue[SingularType, Double] = js.native
  
  /**
    * Whether the element is visible; may be visible or hidden.
    * Note that a "visibility : hidden" bezier edge still takes up space in its bundle.
    */
  var visibility: PropertyValue[SingularType, none | visible] = js.native
  
  /**
    * An integer value that affects the relative draw order of elements.
    * In general, an element with a higher "z-index" will be drawn on top of an element with a lower "z-index".
    * Note that edges are under nodes despite "z-index", except when necessary for compound nodes.
    */
  var `z-index`: PropertyValue[SingularType, Double] = js.native
}
object Visibility {
  
  @scala.inline
  def apply[SingularType /* <: NodeSingular | EdgeSingular */](
    display: PropertyValue[SingularType, none | displayed],
    opacity: PropertyValue[SingularType, Double],
    visibility: PropertyValue[SingularType, none | visible],
    `z-index`: PropertyValue[SingularType, Double]
  ): Visibility[SingularType] = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("z-index")(`z-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility[SingularType]]
  }
  
  @scala.inline
  implicit class VisibilityOps[Self <: Visibility[_], SingularType /* <: NodeSingular | EdgeSingular */] (val x: Self with Visibility[SingularType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayFunction1(value: SingularType => none | displayed): Self = this.set("display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(value: PropertyValue[SingularType, none | displayed]): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityFunction1(value: SingularType => Double): Self = this.set("opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpacity(value: PropertyValue[SingularType, Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityFunction1(value: SingularType => none | visible): Self = this.set("visibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibility(value: PropertyValue[SingularType, none | visible]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-indexFunction1`(value: SingularType => Double): Self = this.set("z-index", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setZ-index`(value: PropertyValue[SingularType, Double]): Self = this.set("z-index", value.asInstanceOf[js.Any])
  }
}
