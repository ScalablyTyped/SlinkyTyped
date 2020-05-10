package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSingularLayout extends js.Object {
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): AnonX = js.native
}

object NodeSingularLayout {
  @scala.inline
  def apply(layoutDimensions: LayoutDimensionOptions => AnonX): NodeSingularLayout = {
    val __obj = js.Dynamic.literal(layoutDimensions = js.Any.fromFunction1(layoutDimensions))
    __obj.asInstanceOf[NodeSingularLayout]
  }
  @scala.inline
  implicit class NodeSingularLayoutOps[Self <: NodeSingularLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutDimensions(value: LayoutDimensionOptions => AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutDimensions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

