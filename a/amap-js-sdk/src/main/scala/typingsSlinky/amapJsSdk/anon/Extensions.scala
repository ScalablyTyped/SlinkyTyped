package typingsSlinky.amapJsSdk.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsSdk.AMap.DrivingPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extensions extends js.Object {
  var extensions: js.UndefOr[String] = js.native
  var hideMarkers: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[typingsSlinky.amapJsSdk.AMap.Map] = js.native
  var panel: js.UndefOr[String | HTMLElement] = js.native
  var policy: js.UndefOr[DrivingPolicy] = js.native
  var showTraffic: js.UndefOr[Boolean] = js.native
}

object Extensions {
  @scala.inline
  def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  @scala.inline
  implicit class ExtensionsOps[Self <: Extensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: typingsSlinky.amapJsSdk.AMap.Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanel(value: String | HTMLElement): Self = {
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
    @scala.inline
    def withPolicy(value: DrivingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(js.undefined)
        ret
    }
  }
  
}

