package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2RichResponse extends js.Object {
  /**
    * A list of UI elements which compose the response
    * The items must meet the following requirements:
    * 1. The first item must be a
    * SimpleResponse
    * 2. At most two SimpleResponse
    * 3. At most one rich response item (e.g.
    * BasicCard,
    *  StructuredResponse,
    *  MediaResponse, or
    *  HtmlResponse)
    * 4. You cannot use a rich response item if you're using an
    * actions.intent.OPTION intent
    *  ie ListSelect or
    *     CarouselSelect
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2RichResponseItem]] = js.native
  /**
    * An additional suggestion chip that can link out to the associated app
    * or site.
    */
  var linkOutSuggestion: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.native
  /**
    * A list of suggested replies. These will always appear at the end of the
    * response. If used in a FinalResponse,
    * they will be ignored.
    */
  var suggestions: js.UndefOr[js.Array[GoogleActionsV2UiElementsSuggestion]] = js.native
}

object GoogleActionsV2RichResponse {
  @scala.inline
  def apply(): GoogleActionsV2RichResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RichResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2RichResponseOps[Self <: GoogleActionsV2RichResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[GoogleActionsV2RichResponseItem]): Self = {
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
    @scala.inline
    def withLinkOutSuggestion(value: GoogleActionsV2UiElementsLinkOutSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOutSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkOutSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOutSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[GoogleActionsV2UiElementsSuggestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
  }
  
}

