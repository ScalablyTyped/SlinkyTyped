package typingsSlinky.draftConvert.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.draftJs.mod.ContentBlock
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typingsSlinky.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConvertToHTMLConfig extends js.Object {
  // Block styles:
  var blockToHTML: js.UndefOr[js.Function1[/* block */ ContentBlock, Tag]] = js.native
  // Entity styling:
  var entityToHTML: js.UndefOr[
    js.Function2[/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String, Tag]
  ] = js.native
  // Inline styles:
  var styleToHTML: js.UndefOr[js.Function1[/* style */ DraftInlineStyleType, Tag | Unit]] = js.native
}

object IConvertToHTMLConfig {
  @scala.inline
  def apply(): IConvertToHTMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConvertToHTMLConfig]
  }
  @scala.inline
  implicit class IConvertToHTMLConfigOps[Self <: IConvertToHTMLConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockToHTML(value: /* block */ ContentBlock => Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockToHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlockToHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockToHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityToHTML(value: (/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String) => Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityToHTML")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEntityToHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityToHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleToHTML(value: /* style */ DraftInlineStyleType => Tag | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleToHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStyleToHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleToHTML")(js.undefined)
        ret
    }
  }
  
}

