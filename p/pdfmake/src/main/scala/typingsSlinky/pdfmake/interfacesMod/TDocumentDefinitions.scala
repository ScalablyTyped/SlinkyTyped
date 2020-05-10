package typingsSlinky.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pdfkit.PDFKit.DocumentPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TDocumentDefinitions extends js.Object {
  var background: js.UndefOr[DynamicBackground | Content] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var content: Content = js.native
  var defaultStyle: js.UndefOr[Style] = js.native
  var footer: js.UndefOr[DynamicContent | Content] = js.native
  var header: js.UndefOr[DynamicContent | Content] = js.native
  var images: js.UndefOr[StringDictionary[String]] = js.native
  var info: js.UndefOr[TDocumentInformation] = js.native
  var ownerPassword: js.UndefOr[String] = js.native
  var pageBreakBefore: js.UndefOr[
    js.Function4[
      /* currentNode */ Node, 
      /* followingNodesOnPage */ js.Array[Node], 
      /* nodesOnNextPage */ js.Array[Node], 
      /* previousNodesOnPage */ js.Array[Node], 
      Boolean
    ]
  ] = js.native
  var pageMargins: js.UndefOr[Margins] = js.native
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  var pageSize: js.UndefOr[PageSize] = js.native
  var permissions: js.UndefOr[DocumentPermissions] = js.native
  var styles: js.UndefOr[StyleDictionary] = js.native
  var userPassword: js.UndefOr[String] = js.native
  var version: js.UndefOr[PDFVersion] = js.native
  var watermark: js.UndefOr[String | Watermark] = js.native
}

object TDocumentDefinitions {
  @scala.inline
  def apply(content: Content): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentDefinitions]
  }
  @scala.inline
  implicit class TDocumentDefinitionsOps[Self <: TDocumentDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundFunction2(value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBackground(value: DynamicBackground | Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFunction3(
      value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFooter(value: DynamicContent | Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFunction3(
      value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHeader(value: DynamicContent | Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: TDocumentInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBreakBefore(
      value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakBefore")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPageBreakBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPageMargins(value: Margins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageMargins")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrientation(value: PageOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: DocumentPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: StyleDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: PDFVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermark(value: String | Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermark")(js.undefined)
        ret
    }
  }
  
}

