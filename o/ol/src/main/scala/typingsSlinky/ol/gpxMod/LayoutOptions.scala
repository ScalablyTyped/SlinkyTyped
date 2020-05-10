package typingsSlinky.ol.gpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOptions extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
}

object LayoutOptions {
  @scala.inline
  def apply(): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  implicit class LayoutOptionsOps[Self <: LayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasM")(js.undefined)
        ret
    }
    @scala.inline
    def withHasZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(js.undefined)
        ret
    }
  }
  
}

