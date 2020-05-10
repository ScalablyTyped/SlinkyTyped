package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.RelatedContentType
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeContainingNotebooks extends js.Object {
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.native
  var includeDebugInfo: js.UndefOr[Boolean] = js.native
  var maxExperts: js.UndefOr[Double] = js.native
  var maxNotebooks: js.UndefOr[Double] = js.native
  var maxNotes: js.UndefOr[Double] = js.native
  var maxRelatedContent: js.UndefOr[Double] = js.native
  var maxTags: js.UndefOr[Double] = js.native
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.native
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.native
}

object AnonIncludeContainingNotebooks {
  @scala.inline
  def apply(): AnonIncludeContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeContainingNotebooks]
  }
  @scala.inline
  implicit class AnonIncludeContainingNotebooksOps[Self <: AnonIncludeContainingNotebooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeContainingNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContainingNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeContainingNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContainingNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDebugInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDebugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDebugInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExperts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExperts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExperts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExperts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNotebooks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNotes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRelatedContent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRelatedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRelatedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRelatedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedContentTypes(value: Set[RelatedContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedContentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedContentTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedContentTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableNotebooksOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableNotebooksOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableNotebooksOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableNotebooksOnly")(js.undefined)
        ret
    }
  }
  
}

