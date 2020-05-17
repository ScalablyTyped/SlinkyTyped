package typingsSlinky.jointjs.mod.dia.LinkView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractivityOptions extends js.Object {
  var arrowheadMove: js.UndefOr[Boolean] = js.native
  var labelMove: js.UndefOr[Boolean] = js.native
  var linkMove: js.UndefOr[Boolean] = js.native
  var useLinkTools: js.UndefOr[Boolean] = js.native
  var vertexAdd: js.UndefOr[Boolean] = js.native
  var vertexMove: js.UndefOr[Boolean] = js.native
  var vertexRemove: js.UndefOr[Boolean] = js.native
}

object InteractivityOptions {
  @scala.inline
  def apply(): InteractivityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractivityOptions]
  }
  @scala.inline
  implicit class InteractivityOptionsOps[Self <: InteractivityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowheadMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowheadMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowheadMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowheadMove")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMove")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkMove")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLinkTools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLinkTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLinkTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLinkTools")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexMove")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexRemove")(js.undefined)
        ret
    }
  }
  
}

