package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.displayed
import typingsSlinky.cytoscape.cytoscapeStrings.none
import typingsSlinky.cytoscape.cytoscapeStrings.visible
import typingsSlinky.cytoscape.mod.EdgeSingular
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply[SingularType](
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
  implicit class VisibilityOps[Self[singulartype] <: Visibility[singulartype], SingularType] (val x: Self[SingularType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SingularType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SingularType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SingularType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SingularType] with Other]
    @scala.inline
    def withDisplayFunction1(value: SingularType => none | displayed): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplay(value: PropertyValue[SingularType, none | displayed]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacityFunction1(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpacity(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibilityFunction1(value: SingularType => none | visible): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibility(value: PropertyValue[SingularType, none | visible]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZ-indexFunction1`(value: SingularType => Double): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withZ-index`(value: PropertyValue[SingularType, Double]): Self[SingularType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

