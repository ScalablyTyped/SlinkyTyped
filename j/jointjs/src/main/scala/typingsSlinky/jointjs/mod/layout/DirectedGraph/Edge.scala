package typingsSlinky.jointjs.mod.layout.DirectedGraph

import typingsSlinky.jointjs.jointjsStrings.c_
import typingsSlinky.jointjs.jointjsStrings.l_
import typingsSlinky.jointjs.jointjsStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var labeloffset: js.UndefOr[Double] = js.native
  var labelpos: js.UndefOr[l_ | c_ | r] = js.native
  var minLen: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Edge {
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLabeloffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeloffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabeloffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeloffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelpos(value: l_ | c_ | r): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelpos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelpos")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLen")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

