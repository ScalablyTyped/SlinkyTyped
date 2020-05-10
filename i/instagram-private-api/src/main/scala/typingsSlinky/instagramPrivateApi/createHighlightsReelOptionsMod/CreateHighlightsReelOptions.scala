package typingsSlinky.instagramPrivateApi.createHighlightsReelOptionsMod

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHighlightsReelOptions extends js.Object {
  var coverId: js.UndefOr[String] = js.native
  var mediaIds: js.Array[String] = js.native
  var source: js.UndefOr[IgAppModule] = js.native
  var title: String = js.native
}

object CreateHighlightsReelOptions {
  @scala.inline
  def apply(mediaIds: js.Array[String], title: String): CreateHighlightsReelOptions = {
    val __obj = js.Dynamic.literal(mediaIds = mediaIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHighlightsReelOptions]
  }
  @scala.inline
  implicit class CreateHighlightsReelOptionsOps[Self <: CreateHighlightsReelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverId")(js.undefined)
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

