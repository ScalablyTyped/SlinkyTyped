package typingsSlinky.actionsOnGoogle.browseMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowseCarouselOptions extends js.Object {
  /**
    * Sets the display options for the images in this carousel.
    * @public
    */
  var display: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.native
  /**
    * List of 2-20 items to show in this carousel.
    * @public
    */
  var items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem] = js.native
}

object BrowseCarouselOptions {
  @scala.inline
  def apply(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): BrowseCarouselOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseCarouselOptions]
  }
  @scala.inline
  implicit class BrowseCarouselOptionsOps[Self <: BrowseCarouselOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
  }
  
}

