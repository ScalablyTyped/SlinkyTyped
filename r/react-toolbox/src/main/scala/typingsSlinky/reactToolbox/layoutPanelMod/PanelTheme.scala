package typingsSlinky.reactToolbox.layoutPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelTheme extends js.Object {
  /**
    * Used in the root class in case the panel has bodyScroll.
    */
  var bodyScroll: js.UndefOr[String] = js.native
  /**
    * Used as the root class of the panel component.
    */
  var panel: js.UndefOr[String] = js.native
}

object PanelTheme {
  @scala.inline
  def apply(): PanelTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelTheme]
  }
  @scala.inline
  implicit class PanelThemeOps[Self <: PanelTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyScroll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
  }
  
}

