package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeAttributes extends js.Object {
  var includeAttributes: js.UndefOr[Boolean] = js.native
  var includeContentLength: js.UndefOr[Boolean] = js.native
  var includeCreated: js.UndefOr[Boolean] = js.native
  var includeDeleted: js.UndefOr[Boolean] = js.native
  var includeLargestResourceMime: js.UndefOr[Boolean] = js.native
  var includeLargestResourceSize: js.UndefOr[Boolean] = js.native
  var includeNotebookGuid: js.UndefOr[Boolean] = js.native
  var includeTagGuids: js.UndefOr[Boolean] = js.native
  var includeTitle: js.UndefOr[Boolean] = js.native
  var includeUpdateSequenceNum: js.UndefOr[Boolean] = js.native
  var includeUpdated: js.UndefOr[Boolean] = js.native
}

object AnonIncludeAttributes {
  @scala.inline
  def apply(): AnonIncludeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeAttributes]
  }
  @scala.inline
  implicit class AnonIncludeAttributesOps[Self <: AnonIncludeAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeContentLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeContentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeLargestResourceMime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLargestResourceMime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeLargestResourceMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLargestResourceMime")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeLargestResourceSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLargestResourceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeLargestResourceSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLargestResourceSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNotebookGuid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNotebookGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNotebookGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNotebookGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTagGuids(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTagGuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTagGuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTagGuids")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUpdateSequenceNum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUpdateSequenceNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUpdateSequenceNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUpdateSequenceNum")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUpdated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUpdated")(js.undefined)
        ret
    }
  }
  
}

