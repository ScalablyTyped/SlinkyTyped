package typingsSlinky.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.markdownDraftJs.AnonClose
import typingsSlinky.markdownDraftJs.AnonOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftToMarkdownOptions extends js.Object {
  var entityItems: js.UndefOr[StringDictionary[AnonClose]] = js.native
  var styleItems: js.UndefOr[StringDictionary[AnonOpen]] = js.native
}

object DraftToMarkdownOptions {
  @scala.inline
  def apply(): DraftToMarkdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraftToMarkdownOptions]
  }
  @scala.inline
  implicit class DraftToMarkdownOptionsOps[Self <: DraftToMarkdownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityItems(value: StringDictionary[AnonClose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityItems")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleItems(value: StringDictionary[AnonOpen]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleItems")(js.undefined)
        ret
    }
  }
  
}

