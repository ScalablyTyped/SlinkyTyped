package typingsSlinky.inquirer.mod.ui

import typingsSlinky.inquirer.mod.StreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the bottom-bar UI.
  */
@js.native
trait BottomBarOptions extends StreamOptions {
  /**
    * The initial text to display.
    */
  var bottomBar: js.UndefOr[String] = js.native
}

object BottomBarOptions {
  @scala.inline
  def apply(): BottomBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomBarOptions]
  }
  @scala.inline
  implicit class BottomBarOptionsOps[Self <: BottomBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBar")(js.undefined)
        ret
    }
  }
  
}

