package typingsSlinky.amapJsSdk.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsSdk.AMap.LngLat
import typingsSlinky.amapJsSdk.AMap.Pixel
import typingsSlinky.amapJsSdk.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMove extends js.Object {
  var autoMove: js.UndefOr[Boolean] = js.native
  var closeWhenClickMap: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[String | HTMLElement] = js.native
  var isCustom: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Pixel] = js.native
  var position: js.UndefOr[LngLat] = js.native
  var showShadow: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Size] = js.native
}

object AutoMove {
  @scala.inline
  def apply(): AutoMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMove]
  }
  @scala.inline
  implicit class AutoMoveOps[Self <: AutoMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIsCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustom")(js.undefined)
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
    def withShowShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

