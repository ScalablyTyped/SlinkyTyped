package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlineWidth extends js.Object {
  var color: js.UndefOr[Property] = js.native
  var outlineColor: js.UndefOr[Property] = js.native
  var outlineWidth: js.UndefOr[Property] = js.native
}

object OutlineWidth {
  @scala.inline
  def apply(): OutlineWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineWidth]
  }
  @scala.inline
  implicit class OutlineWidthOps[Self <: OutlineWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineWidth(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(js.undefined)
        ret
    }
  }
  
}

