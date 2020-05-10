package typingsSlinky.leaflet.mod.Control_

import typingsSlinky.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersOptions extends ControlOptions {
  var autoZIndex: js.UndefOr[Boolean] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var hideSingleBase: js.UndefOr[Boolean] = js.native
}

object LayersOptions {
  @scala.inline
  def apply(): LayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersOptions]
  }
  @scala.inline
  implicit class LayersOptionsOps[Self <: LayersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoZIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSingleBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSingleBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSingleBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSingleBase")(js.undefined)
        ret
    }
  }
  
}

