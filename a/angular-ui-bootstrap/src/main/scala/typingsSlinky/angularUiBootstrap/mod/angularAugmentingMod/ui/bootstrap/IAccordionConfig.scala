package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionConfig extends js.Object {
  /**
    * Controls whether expanding an item will cause the other items to close.
    *
    * @default true
    */
  var closeOthers: js.UndefOr[Boolean] = js.native
}

object IAccordionConfig {
  @scala.inline
  def apply(): IAccordionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionConfig]
  }
  @scala.inline
  implicit class IAccordionConfigOps[Self <: IAccordionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseOthers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOthers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOthers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOthers")(js.undefined)
        ret
    }
  }
  
}

