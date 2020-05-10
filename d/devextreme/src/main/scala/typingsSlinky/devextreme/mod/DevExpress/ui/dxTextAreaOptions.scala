package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextAreaOptions extends dxTextBoxOptions[dxTextArea] {
  /** A Boolean value specifying whether or not the auto resizing mode is enabled. */
  var autoResizeEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the maximum height of the widget. */
  var maxHeight: js.UndefOr[Double | String] = js.native
  /** Specifies the minimum height of the widget. */
  var minHeight: js.UndefOr[Double | String] = js.native
}

object dxTextAreaOptions {
  @scala.inline
  def apply(): dxTextAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextAreaOptions]
  }
  @scala.inline
  implicit class dxTextAreaOptionsOps[Self <: dxTextAreaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResizeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResizeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResizeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResizeEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
  }
  
}

