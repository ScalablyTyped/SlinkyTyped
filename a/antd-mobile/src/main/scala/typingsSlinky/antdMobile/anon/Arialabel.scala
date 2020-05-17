package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arialabel extends js.Object {
  var `aria-label`: js.UndefOr[scala.Nothing] = js.native
  var iconOnly: Boolean = js.native
  var label: String = js.native
  var role: js.UndefOr[scala.Nothing] = js.native
}

object Arialabel {
  @scala.inline
  def apply(iconOnly: Boolean, label: String): Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  @scala.inline
  implicit class ArialabelOps[Self <: Arialabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

