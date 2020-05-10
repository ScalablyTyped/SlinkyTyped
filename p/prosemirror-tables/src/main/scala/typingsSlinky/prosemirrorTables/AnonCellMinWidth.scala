package typingsSlinky.prosemirrorTables

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorView.mod.NodeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellMinWidth[S /* <: Schema[_, _] */] extends js.Object {
  var View: js.UndefOr[NodeView[S]] = js.native
  var cellMinWidth: js.UndefOr[Double] = js.native
  var handleWidth: js.UndefOr[Double] = js.native
}

object AnonCellMinWidth {
  @scala.inline
  def apply[S](): AnonCellMinWidth[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCellMinWidth[S]]
  }
  @scala.inline
  implicit class AnonCellMinWidthOps[Self[s] <: AnonCellMinWidth[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withView(value: NodeView[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMinWidth(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellMinWidth: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleWidth(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleWidth: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWidth")(js.undefined)
        ret
    }
  }
  
}

