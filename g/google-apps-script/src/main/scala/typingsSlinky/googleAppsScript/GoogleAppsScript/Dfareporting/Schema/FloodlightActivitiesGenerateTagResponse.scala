package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesGenerateTagResponse extends js.Object {
  var floodlightActivityTag: js.UndefOr[String] = js.native
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object FloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(): FloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivitiesGenerateTagResponse]
  }
  @scala.inline
  implicit class FloodlightActivitiesGenerateTagResponseOps[Self <: FloodlightActivitiesGenerateTagResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloodlightActivityTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityTag")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSiteTagGlobalSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSiteTagGlobalSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSiteTagGlobalSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSiteTagGlobalSnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

