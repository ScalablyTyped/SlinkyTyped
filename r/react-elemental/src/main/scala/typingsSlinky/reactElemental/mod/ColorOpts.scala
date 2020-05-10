package typingsSlinky.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorOpts extends js.Object {
  var primary: js.UndefOr[String] = js.native
  var primaryDark: js.UndefOr[String] = js.native
  var primaryLight: js.UndefOr[String] = js.native
}

object ColorOpts {
  @scala.inline
  def apply(): ColorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpts]
  }
  @scala.inline
  implicit class ColorOptsOps[Self <: ColorOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDark")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLight")(js.undefined)
        ret
    }
  }
  
}

