package typingsSlinky.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyRectangularLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyRectangularNode[Datum] = js.native
  /**
    * The target of the link.
    */
  var target: HierarchyRectangularNode[Datum] = js.native
}

object HierarchyRectangularLink {
  @scala.inline
  def apply[Datum](source: HierarchyRectangularNode[Datum], target: HierarchyRectangularNode[Datum]): HierarchyRectangularLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRectangularLink[Datum]]
  }
  @scala.inline
  implicit class HierarchyRectangularLinkOps[Self[datum] <: HierarchyRectangularLink[datum], Datum] (val x: Self[Datum]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Datum] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Datum]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Datum] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Datum] with Other]
    @scala.inline
    def withSource(value: HierarchyRectangularNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HierarchyRectangularNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

