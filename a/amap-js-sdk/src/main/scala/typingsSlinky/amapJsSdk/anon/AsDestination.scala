package typingsSlinky.amapJsSdk.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsSdk.AMap.LngLat
import typingsSlinky.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsDestination extends js.Object {
  var asDestination: js.UndefOr[Boolean] = js.native
  var asOrigin: js.UndefOr[Boolean] = js.native
  var autoMove: js.UndefOr[Boolean] = js.native
  var closeWhenClickMap: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[String | HTMLElement] = js.native
  var driving: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Pixel] = js.native
  var panel: js.UndefOr[String | HTMLElement] = js.native
  var placeSearch: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[LngLat] = js.native
  var searchRadius: js.UndefOr[Double] = js.native
  var transit: js.UndefOr[Boolean] = js.native
  var walking: js.UndefOr[Boolean] = js.native
}

object AsDestination {
  @scala.inline
  def apply(): AsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsDestination]
  }
  @scala.inline
  implicit class AsDestinationOps[Self <: AsDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsDestination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withAsOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMove")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseWhenClickMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWhenClickMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseWhenClickMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWhenClickMap")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDriving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driving")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
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
    def withPlaceSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTransit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(js.undefined)
        ret
    }
    @scala.inline
    def withWalking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walking")(js.undefined)
        ret
    }
  }
  
}

