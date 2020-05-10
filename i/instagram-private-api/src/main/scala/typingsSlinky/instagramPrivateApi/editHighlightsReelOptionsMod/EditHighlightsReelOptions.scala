package typingsSlinky.instagramPrivateApi.editHighlightsReelOptionsMod

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditHighlightsReelOptions extends js.Object {
  var added: js.UndefOr[js.Array[String]] = js.native
  var coverId: String = js.native
  var highlightId: String = js.native
  var removed: js.UndefOr[js.Array[String]] = js.native
  var source: js.UndefOr[IgAppModule] = js.native
  var title: String = js.native
}

object EditHighlightsReelOptions {
  @scala.inline
  def apply(coverId: String, highlightId: String, title: String): EditHighlightsReelOptions = {
    val __obj = js.Dynamic.literal(coverId = coverId.asInstanceOf[js.Any], highlightId = highlightId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHighlightsReelOptions]
  }
  @scala.inline
  implicit class EditHighlightsReelOptionsOps[Self <: EditHighlightsReelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdded(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: IgAppModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

