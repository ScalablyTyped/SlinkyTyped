package typingsSlinky.jointjs.mod.linkTools.Vertices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
  var handleClass: js.UndefOr[js.Any] = js.native
  var redundancyRemoval: js.UndefOr[Boolean] = js.native
  var snapRadius: js.UndefOr[Double] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var vertexAdding: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRedundancyRemoval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundancyRemoval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedundancyRemoval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundancyRemoval")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexAdding")(js.undefined)
        ret
    }
  }
  
}

