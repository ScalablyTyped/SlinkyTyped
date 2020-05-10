package typingsSlinky.dagre.mod

import typingsSlinky.dagre.dagreStrings.c
import typingsSlinky.dagre.dagreStrings.l
import typingsSlinky.dagre.dagreStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeConfig extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var labeloffest: js.UndefOr[Double] = js.native
  var lablepos: js.UndefOr[l | c | r] = js.native
  var minlen: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object EdgeConfig {
  @scala.inline
  def apply(): EdgeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeConfig]
  }
  @scala.inline
  implicit class EdgeConfigOps[Self <: EdgeConfig] (val x: Self) extends AnyVal {
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
    def withLabeloffest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeloffest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabeloffest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeloffest")(js.undefined)
        ret
    }
    @scala.inline
    def withLablepos(value: l | c | r): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lablepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLablepos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lablepos")(js.undefined)
        ret
    }
    @scala.inline
    def withMinlen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinlen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlen")(js.undefined)
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

