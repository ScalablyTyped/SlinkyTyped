package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.danger
import typingsSlinky.antd.antdStrings.dashed
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.ghost
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.leftBottom
import typingsSlinky.antd.antdStrings.leftTop
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.primary
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.antdStrings.rightBottom
import typingsSlinky.antd.antdStrings.rightTop
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.antdStrings.topLeft
import typingsSlinky.antd.antdStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  var disabled: Boolean = js.native
  var icon: ReactElement = js.native
  var okType: js.UndefOr[link | dashed | default | primary | ghost | danger] = js.native
  var placement: js.UndefOr[
    bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
  ] = js.native
  var transitionName: String = js.native
  var trigger: js.UndefOr[String | js.Array[String]] = js.native
}

object Disabled {
  @scala.inline
  def apply(disabled: Boolean, icon: ReactElement, transitionName: String): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkType(value: link | dashed | default | primary | ghost | danger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(
      value: bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

