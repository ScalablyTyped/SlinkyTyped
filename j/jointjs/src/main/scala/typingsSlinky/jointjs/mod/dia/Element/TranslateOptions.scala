package typingsSlinky.jointjs.mod.dia.Element

import typingsSlinky.jointjs.mod.dia.BBox
import typingsSlinky.jointjs.mod.dia.Cell.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateOptions extends js.Object {
  var restrictedArea: js.UndefOr[BBox] = js.native
  var transition: js.UndefOr[TransitionOptions] = js.native
}

object TranslateOptions {
  @scala.inline
  def apply(): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions]
  }
  @scala.inline
  implicit class TranslateOptionsOps[Self <: TranslateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestrictedArea(value: BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedArea")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: TransitionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

