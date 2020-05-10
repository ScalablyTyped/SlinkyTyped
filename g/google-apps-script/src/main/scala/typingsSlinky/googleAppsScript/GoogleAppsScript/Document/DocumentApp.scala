package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document service creates and opens Documents that can be edited.
  *
  *     // Open a document by ID.
  *     var doc = DocumentApp.openById('DOCUMENT_ID_GOES_HERE');
  *
  *     // Create and open a document.
  *     doc = DocumentApp.create('Document Name');
  */
@js.native
trait DocumentApp extends js.Object {
  var Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any = js.native
  var ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any = js.native
  /** @deprecated DO NOT USE */ var FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any = js.native
  var GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any = js.native
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any = js.native
  var ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any = js.native
  var PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any = js.native
  var TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any = js.native
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any = js.native
  def create(name: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document = js.native
  def getActiveDocument(): typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document = js.native
  def getUi(): Ui = js.native
  def openById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document = js.native
  def openByUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document = js.native
}

object DocumentApp {
  @scala.inline
  def apply(
    Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any,
    ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any,
    FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any,
    GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any,
    ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any,
    PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any,
    TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any,
    VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any,
    create: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document,
    getActiveDocument: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document,
    getUi: () => Ui,
    openById: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document,
    openByUrl: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document
  ): DocumentApp = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FontFamily = FontFamily.asInstanceOf[js.Any], GlyphType = GlyphType.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], ParagraphHeading = ParagraphHeading.asInstanceOf[js.Any], PositionedLayout = PositionedLayout.asInstanceOf[js.Any], TextAlignment = TextAlignment.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), getActiveDocument = js.Any.fromFunction0(getActiveDocument), getUi = js.Any.fromFunction0(getUi), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
    __obj.asInstanceOf[DocumentApp]
  }
  @scala.inline
  implicit class DocumentAppOps[Self <: DocumentApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlyphType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphHeading(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParagraphHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionedLayout(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PositionedLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetActiveDocument(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUi(value: () => Ui): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUi")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenById(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenByUrl(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openByUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

