package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footnote extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.native
  var footnoteId: js.UndefOr[String] = js.native
}

object Footnote {
  @scala.inline
  def apply(): Footnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footnote]
  }
  @scala.inline
  implicit class FootnoteOps[Self <: Footnote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Array[StructuralElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFootnoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFootnoteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnoteId")(js.undefined)
        ret
    }
  }
  
}

