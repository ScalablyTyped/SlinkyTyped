package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a LinkOutSuggestion. */
@js.native
trait ILinkOutSuggestion extends js.Object {
  /** LinkOutSuggestion destinationName */
  var destinationName: js.UndefOr[String | Null] = js.native
  /** LinkOutSuggestion uri */
  var uri: js.UndefOr[String | Null] = js.native
}

object ILinkOutSuggestion {
  @scala.inline
  def apply(): ILinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinkOutSuggestion]
  }
  @scala.inline
  implicit class ILinkOutSuggestionOps[Self <: ILinkOutSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(null)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(null)
        ret
    }
  }
  
}

