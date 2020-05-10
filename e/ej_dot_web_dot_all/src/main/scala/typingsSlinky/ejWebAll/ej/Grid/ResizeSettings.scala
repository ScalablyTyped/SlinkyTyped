package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define the mode of resizing.
    * @Default {ej.Grid.ResizeMode.Normal}
    */
  var resizeMode: js.UndefOr[ResizeMode | String] = js.native
}

object ResizeSettings {
  @scala.inline
  def apply(): ResizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeSettings]
  }
  @scala.inline
  implicit class ResizeSettingsOps[Self <: ResizeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResizeMode(value: ResizeMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(js.undefined)
        ret
    }
  }
  
}

