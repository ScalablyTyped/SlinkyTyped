package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.richMod._RichResponseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2RichResponseItem extends _RichResponseItem {
  /**
    * A basic card.
    */
  var basicCard: js.UndefOr[GoogleActionsV2UiElementsBasicCard] = js.native
  /**
    * Carousel browse card, use collection_browse instead..
    */
  var carouselBrowse: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowse] = js.native
  /**
    * Html response used to render on Canvas.
    */
  var htmlResponse: js.UndefOr[GoogleActionsV2UiElementsHtmlResponse] = js.native
  /**
    * Response indicating a set of media to be played.
    */
  var mediaResponse: js.UndefOr[GoogleActionsV2MediaResponse] = js.native
  /**
    * Optional named identifier of this Item.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Voice and text-only response.
    */
  var simpleResponse: js.UndefOr[GoogleActionsV2SimpleResponse] = js.native
  /**
    * Structured payload to be processed by Google.
    */
  var structuredResponse: js.UndefOr[GoogleActionsV2StructuredResponse] = js.native
  /**
    * Table card.
    */
  var tableCard: js.UndefOr[GoogleActionsV2UiElementsTableCard] = js.native
}

object GoogleActionsV2RichResponseItem {
  @scala.inline
  def apply(): GoogleActionsV2RichResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RichResponseItem]
  }
  @scala.inline
  implicit class GoogleActionsV2RichResponseItemOps[Self <: GoogleActionsV2RichResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicCard(value: GoogleActionsV2UiElementsBasicCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCarouselBrowse(value: GoogleActionsV2UiElementsCarouselBrowse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselBrowse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarouselBrowse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselBrowse")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlResponse(value: GoogleActionsV2UiElementsHtmlResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaResponse(value: GoogleActionsV2MediaResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleResponse(value: GoogleActionsV2SimpleResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredResponse(value: GoogleActionsV2StructuredResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCard(value: GoogleActionsV2UiElementsTableCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCard")(js.undefined)
        ret
    }
  }
  
}

