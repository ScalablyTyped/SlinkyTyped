package typingsSlinky.formol.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.formol.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchButtonProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var i18n: js.UndefOr[Dictk] = js.native
  var leftLabel: js.UndefOr[TagMod[Any]] = js.native
  var rightLabel: js.UndefOr[TagMod[Any]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SwitchButtonProps {
  @scala.inline
  def apply(): SwitchButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchButtonProps]
  }
  @scala.inline
  implicit class SwitchButtonPropsOps[Self <: SwitchButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: Dictk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRightLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

