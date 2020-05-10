package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsCarouselBrowse extends js.Object {
  /**
    * Type of image display option.
    * Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.native
  /**
    * Min: 2. Max: 10.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]] = js.native
}

object GoogleActionsV2UiElementsCarouselBrowse {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCarouselBrowse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowse]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsCarouselBrowseOps[Self <: GoogleActionsV2UiElementsCarouselBrowse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageDisplayOptions(value: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

