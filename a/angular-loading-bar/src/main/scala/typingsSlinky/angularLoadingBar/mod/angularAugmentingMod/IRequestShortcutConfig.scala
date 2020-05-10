package typingsSlinky.angularLoadingBar.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestShortcutConfig extends js.Object {
  /**
    * Indicates that the loading bar should be hidden.
    */
  var ignoreLoadingBar: js.UndefOr[Boolean] = js.native
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
  @scala.inline
  implicit class IRequestShortcutConfigOps[Self <: IRequestShortcutConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreLoadingBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLoadingBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLoadingBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLoadingBar")(js.undefined)
        ret
    }
  }
  
}

