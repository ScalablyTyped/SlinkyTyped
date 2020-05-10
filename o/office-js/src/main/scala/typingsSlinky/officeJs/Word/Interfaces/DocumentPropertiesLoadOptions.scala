package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents document properties.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait DocumentPropertiesLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the application name of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var applicationName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the creation date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var creationDate: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the last author of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastAuthor: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the last print date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastPrintDate: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the last save time of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastSaveTime: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the revision number of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var revisionNumber: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets security settings of the document. Read only. Some are access restrictions on the file on disk. Others are Document Protection settings. Some possible values are 0 = File on disk is read/write; 1 = Protect Document: File is encrypted and requires a password to open; 2 = Protect Document: Always Open as Read-Only; 3 = Protect Document: Both #1 and #2; 4 = File on disk is read only; 5 = Both #1 and #4; 6 = Both #2 and #4; 7 = All of #1, #2, and #4; 8 = Protect Document: Restrict Edit to read-only; 9 = Both #1 and #8; 10 = Both #2 and #8; 11 = All of #1, #2, and #8; 12 = Both #4 and #8; 13 = All of #1, #4, and #8; 14 = All of #2, #4, and #8; 15 = All of #1, #2, #4, and #8.
    *
    * [Api set: WordApi 1.3]
    */
  var security: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the template of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var template: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[Boolean] = js.native
}

object DocumentPropertiesLoadOptions {
  @scala.inline
  def apply(): DocumentPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPropertiesLoadOptions]
  }
  @scala.inline
  implicit class DocumentPropertiesLoadOptionsOps[Self <: DocumentPropertiesLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAuthor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPrintDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPrintDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPrintDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPrintDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSaveTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSaveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSaveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSaveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

