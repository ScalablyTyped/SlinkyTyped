package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankeyNode extends js.Object {
  /** The node's label. */
  var label: String = js.native
  /** The node's incoming links. */
  var linksIn: js.Array[_] = js.native
  /** The node's outgoing links. */
  var linksOut: js.Array[_] = js.native
  /** @deprecated Use [label](/api-reference/20%20Data%20Visualization%20Widgets/dxSankey/6%20Node/2%20Fields/label.md '/Documentation/ApiReference/Data_Visualization_Widgets/dxSankey/Node/Fields/#label') instead. */
  /** The node's label. */
  var title: String = js.native
  /** Hides the sankey node's tooltip. */
  def hideTooltip(): Unit = js.native
  /** Changes the sankey node's hover state. */
  def hover(state: Boolean): Unit = js.native
  /** Indicates whether the sankey node is in the hover state. */
  def isHovered(): Boolean = js.native
  /** Shows the sankey node's tooltip. */
  def showTooltip(): Unit = js.native
}

object dxSankeyNode {
  @scala.inline
  def apply(
    hideTooltip: () => Unit,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    label: String,
    linksIn: js.Array[_],
    linksOut: js.Array[_],
    showTooltip: () => Unit,
    title: String
  ): dxSankeyNode = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), label = label.asInstanceOf[js.Any], linksIn = linksIn.asInstanceOf[js.Any], linksOut = linksOut.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction0(showTooltip), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyNode]
  }
  @scala.inline
  implicit class dxSankeyNodeOps[Self <: dxSankeyNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHover(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsHovered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksIn(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksOut(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

