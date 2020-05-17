package typingsSlinky.antDesignIcons.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryColor extends js.Object {
  var primaryColor: js.UndefOr[String] = js.native
  var secondaryColor: js.UndefOr[String] = js.native
}

object PrimaryColor {
  @scala.inline
  def apply(): PrimaryColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryColor]
  }
  @scala.inline
  implicit class PrimaryColorOps[Self <: PrimaryColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(js.undefined)
        ret
    }
  }
  
}

