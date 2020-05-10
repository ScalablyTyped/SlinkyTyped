package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookModel extends js.Object {
  var category: String = js.native
  var company: String = js.native
  var contentStatus: String = js.native
  var created: js.Date = js.native
  var creator: String = js.native
  var definedNames: DefinedNamesModel = js.native
  var description: String = js.native
  var keywords: String = js.native
  var language: String = js.native
  var lastModifiedBy: String = js.native
  var lastPrinted: js.Date = js.native
  var manager: String = js.native
  var media: js.Array[Media] = js.native
  var modified: js.Date = js.native
  var properties: WorkbookProperties = js.native
  var revision: js.Date = js.native
  var sheets: js.Array[WorksheetModel] = js.native
  var subject: String = js.native
  var themes: js.Array[String] = js.native
  var title: String = js.native
  var views: js.Array[WorkbookView] = js.native
  var worksheets: js.Array[Worksheet] = js.native
}

object WorkbookModel {
  @scala.inline
  def apply(
    category: String,
    company: String,
    contentStatus: String,
    created: js.Date,
    creator: String,
    definedNames: DefinedNamesModel,
    description: String,
    keywords: String,
    language: String,
    lastModifiedBy: String,
    lastPrinted: js.Date,
    manager: String,
    media: js.Array[Media],
    modified: js.Date,
    properties: WorkbookProperties,
    revision: js.Date,
    sheets: js.Array[WorksheetModel],
    subject: String,
    themes: js.Array[String],
    title: String,
    views: js.Array[WorkbookView],
    worksheets: js.Array[Worksheet]
  ): WorkbookModel = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], contentStatus = contentStatus.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], definedNames = definedNames.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastPrinted = lastPrinted.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookModel]
  }
  @scala.inline
  implicit class WorkbookModelOps[Self <: WorkbookModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinedNames(value: DefinedNamesModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPrinted(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPrinted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManager(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: WorkbookProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheets(value: js.Array[WorksheetModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViews(value: js.Array[WorkbookView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorksheets(value: js.Array[Worksheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

