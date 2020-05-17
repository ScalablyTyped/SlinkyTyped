package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeAccountLimits extends js.Object {
  var includeAccountLimits: js.UndefOr[Boolean] = js.native
  var includeContent: js.UndefOr[Boolean] = js.native
  var includeNoteAppDataValues: js.UndefOr[Boolean] = js.native
  var includeResourceAppDataValues: js.UndefOr[Boolean] = js.native
  var includeResourcesAlternateData: js.UndefOr[Boolean] = js.native
  var includeResourcesData: js.UndefOr[Boolean] = js.native
  var includeResourcesRecognition: js.UndefOr[Boolean] = js.native
  var includeSharedNotes: js.UndefOr[Boolean] = js.native
}

object IncludeAccountLimits {
  @scala.inline
  def apply(): IncludeAccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAccountLimits]
  }
  @scala.inline
  implicit class IncludeAccountLimitsOps[Self <: IncludeAccountLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAccountLimits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAccountLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAccountLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAccountLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNoteAppDataValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteAppDataValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNoteAppDataValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteAppDataValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResourceAppDataValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourceAppDataValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResourceAppDataValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourceAppDataValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResourcesAlternateData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourcesAlternateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResourcesAlternateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourcesAlternateData")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResourcesData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourcesData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResourcesData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourcesData")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResourcesRecognition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourcesRecognition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResourcesRecognition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourcesRecognition")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSharedNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSharedNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSharedNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSharedNotes")(js.undefined)
        ret
    }
  }
  
}

