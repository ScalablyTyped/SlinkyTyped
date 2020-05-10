package typingsSlinky.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HintSpecimenProps extends js.Object {
  var directive: js.UndefOr[Boolean] = js.native
  var important: js.UndefOr[Boolean] = js.native
  var neutral: js.UndefOr[Boolean] = js.native
  var warning: js.UndefOr[Boolean] = js.native
}

object HintSpecimenProps {
  @scala.inline
  def apply(): HintSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintSpecimenProps]
  }
  @scala.inline
  implicit class HintSpecimenPropsOps[Self <: HintSpecimenProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirective(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(js.undefined)
        ret
    }
    @scala.inline
    def withImportant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

