package typingsSlinky.ionicCliFramework.optionsMod

import typingsSlinky.ionicCliFramework.colorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptionNameOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val showAliases: js.UndefOr[Boolean] = js.native
  val showValueSpec: js.UndefOr[Boolean] = js.native
}

object FormatOptionNameOptions {
  @scala.inline
  def apply(): FormatOptionNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptionNameOptions]
  }
  @scala.inline
  implicit class FormatOptionNameOptionsOps[Self <: FormatOptionNameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withShowValueSpec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValueSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValueSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValueSpec")(js.undefined)
        ret
    }
  }
  
}

