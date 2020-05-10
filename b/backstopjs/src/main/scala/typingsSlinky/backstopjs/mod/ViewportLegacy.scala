package typingsSlinky.backstopjs.mod

import typingsSlinky.backstopjs.backstopjsStrings.desktop
import typingsSlinky.backstopjs.backstopjsStrings.phone
import typingsSlinky.backstopjs.backstopjsStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportLegacy extends Viewport {
  var height: Double = js.native
  var name: phone | tablet | desktop = js.native
  var width: Double = js.native
}

object ViewportLegacy {
  @scala.inline
  def apply(height: Double, name: phone | tablet | desktop, width: Double): ViewportLegacy = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportLegacy]
  }
  @scala.inline
  implicit class ViewportLegacyOps[Self <: ViewportLegacy] (val x: Self) extends AnyVal {
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
    def withName(value: phone | tablet | desktop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

