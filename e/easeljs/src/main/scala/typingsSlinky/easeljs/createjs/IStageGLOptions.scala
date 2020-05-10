package typingsSlinky.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStageGLOptions extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.native
  var autoPurge: js.UndefOr[Double] = js.native
  var premultiply: js.UndefOr[Boolean] = js.native
  var preserveBuffer: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
}

object IStageGLOptions {
  @scala.inline
  def apply(): IStageGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStageGLOptions]
  }
  @scala.inline
  implicit class IStageGLOptionsOps[Self <: IStageGLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPurge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPurge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPurge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPurge")(js.undefined)
        ret
    }
    @scala.inline
    def withPremultiply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremultiply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiply")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
  }
  
}

