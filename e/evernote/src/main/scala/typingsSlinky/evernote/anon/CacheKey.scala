package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.NoteFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheKey extends js.Object {
  var cacheKey: js.UndefOr[String] = js.native
  var context: js.UndefOr[String] = js.native
  var filter: js.UndefOr[NoteFilter] = js.native
  var noteGuid: js.UndefOr[String] = js.native
  var plainText: js.UndefOr[String] = js.native
  var referenceUri: js.UndefOr[String] = js.native
}

object CacheKey {
  @scala.inline
  def apply(): CacheKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKey]
  }
  @scala.inline
  implicit class CacheKeyOps[Self <: CacheKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: NoteFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withPlainText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainText")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceUri")(js.undefined)
        ret
    }
  }
  
}

