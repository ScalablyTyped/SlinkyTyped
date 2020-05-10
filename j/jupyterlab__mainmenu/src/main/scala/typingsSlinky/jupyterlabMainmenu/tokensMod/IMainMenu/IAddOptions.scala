package typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to add a menu to the main menu.
  */
@js.native
trait IAddOptions extends js.Object {
  /**
    * The rank order of the menu among its siblings.
    */
  var rank: js.UndefOr[Double] = js.native
}

object IAddOptions {
  @scala.inline
  def apply(): IAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddOptions]
  }
  @scala.inline
  implicit class IAddOptionsOps[Self <: IAddOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
  }
  
}

