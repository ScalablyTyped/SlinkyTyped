package typingsSlinky.imagemapster.mod._Global_.ImageMapster

import typingsSlinky.imagemapster.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnShowToolTipData extends js.Object {
  var areaOptions: AreaRenderingOptions = js.native
  /**
    * map key for this area
    */
  var key: String = js.native
  /**
    * current state of the area
    */
  var selected: Boolean = js.native
  /**
    * jQuery object of the tooltip container
    */
  var toolTip: JQuery = js.native
}

object OnShowToolTipData {
  @scala.inline
  def apply(areaOptions: AreaRenderingOptions, key: String, selected: Boolean, toolTip: JQuery): OnShowToolTipData = {
    val __obj = js.Dynamic.literal(areaOptions = areaOptions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnShowToolTipData]
  }
  @scala.inline
  implicit class OnShowToolTipDataOps[Self <: OnShowToolTipData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaOptions(value: AreaRenderingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTip(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

