package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A padding defines an addition to a node’s dimension.
  * For example, padding-left adds to a node’s outer (i.e. total) width.
  * This can be used to add spacing around the label of width: label; height: label; nodes,
  * or it can be used to add spacing between a compound node parent and its children.
  */
@js.native
trait PaddingNode extends js.Object {
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.native
}

object PaddingNode {
  @scala.inline
  def apply(): PaddingNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingNode]
  }
  @scala.inline
  implicit class PaddingNodeOps[Self <: PaddingNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withPadding-bottomFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-bottom`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-leftFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-left`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-rightFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-right`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-topFunction1`(value: NodeSingular => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withPadding-top`(value: PropertyValueNode[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(js.undefined)
        ret
    }
  }
  
}

