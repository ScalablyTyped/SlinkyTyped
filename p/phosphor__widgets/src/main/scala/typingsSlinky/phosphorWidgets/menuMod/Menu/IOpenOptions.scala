package typingsSlinky.phosphorWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for the `open` method on a menu.
  */
@js.native
trait IOpenOptions extends js.Object {
  /**
    * Whether to force the X position of the menu.
    *
    * Setting to `true` will disable the logic which repositions the
    * X coordinate of the menu if it will not fit entirely on screen.
    *
    * The default is `false`.
    */
  var forceX: js.UndefOr[Boolean] = js.native
  /**
    * Whether to force the Y position of the menu.
    *
    * Setting to `true` will disable the logic which repositions the
    * Y coordinate of the menu if it will not fit entirely on screen.
    *
    * The default is `false`.
    */
  var forceY: js.UndefOr[Boolean] = js.native
}

object IOpenOptions {
  @scala.inline
  def apply(): IOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenOptions]
  }
  @scala.inline
  implicit class IOpenOptionsOps[Self <: IOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceX")(js.undefined)
        ret
    }
    @scala.inline
    def withForceY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceY")(js.undefined)
        ret
    }
  }
  
}

