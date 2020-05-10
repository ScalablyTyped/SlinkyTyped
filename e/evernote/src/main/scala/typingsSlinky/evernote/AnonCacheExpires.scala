package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.Note
import typingsSlinky.evernote.mod.Types.Notebook
import typingsSlinky.evernote.mod.Types.NotebookDescriptor
import typingsSlinky.evernote.mod.Types.RelatedContent
import typingsSlinky.evernote.mod.Types.Tag
import typingsSlinky.evernote.mod.Types.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheExpires extends js.Object {
  var cacheExpires: js.UndefOr[Double] = js.native
  var cacheKey: js.UndefOr[String] = js.native
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.native
  var debugInfo: js.UndefOr[String] = js.native
  var experts: js.UndefOr[js.Array[UserProfile]] = js.native
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  var notes: js.UndefOr[js.Array[Note]] = js.native
  var relatedContent: js.UndefOr[js.Array[RelatedContent]] = js.native
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}

object AnonCacheExpires {
  @scala.inline
  def apply(): AnonCacheExpires = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCacheExpires]
  }
  @scala.inline
  implicit class AnonCacheExpiresOps[Self <: AnonCacheExpires] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheExpires")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withContainingNotebooks(value: js.Array[NotebookDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainingNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withExperts(value: js.Array[UserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experts")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebooks(value: js.Array[Notebook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[Note]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedContent(value: js.Array[RelatedContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

