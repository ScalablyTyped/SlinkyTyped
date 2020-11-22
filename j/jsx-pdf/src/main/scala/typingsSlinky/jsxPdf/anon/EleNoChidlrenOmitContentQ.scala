package typingsSlinky.jsxPdf.anon

import typingsSlinky.jsxPdf.jsxPdfStrings.H
import typingsSlinky.jsxPdf.jsxPdfStrings.L
import typingsSlinky.jsxPdf.jsxPdfStrings.M
import typingsSlinky.jsxPdf.jsxPdfStrings.Q
import typingsSlinky.jsxPdf.jsxPdfStrings.alphanumeric
import typingsSlinky.jsxPdf.jsxPdfStrings.numeric
import typingsSlinky.jsxPdf.jsxPdfStrings.octet
import typingsSlinky.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typingsSlinky.pdfmake.anon.X
import typingsSlinky.pdfmake.interfacesMod.Alignment
import typingsSlinky.pdfmake.interfacesMod.Decoration
import typingsSlinky.pdfmake.interfacesMod.DecorationStyle
import typingsSlinky.pdfmake.interfacesMod.Margins
import typingsSlinky.pdfmake.interfacesMod.PageBreak
import typingsSlinky.pdfmake.interfacesMod.PageOrientation
import typingsSlinky.pdfmake.interfacesMod.Size
import typingsSlinky.pdfmake.interfacesMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsx-pdf.jsx-pdf.<global>.JSX.EleNoChidlren<std.Omit<pdfmake.pdfmake/interfaces.ContentQr, 'qr'> & {  content :string}> */
@js.native
trait EleNoChidlrenOmitContentQ extends js.Object {
  
  var absolutePosition: js.UndefOr[X] = js.native
  
  var alignment: js.UndefOr[Alignment] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var characterSpacing: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var columnGap: js.UndefOr[Size] = js.native
  
  var content: String = js.native
  
  var decoration: js.UndefOr[Decoration] = js.native
  
  var decorationColor: js.UndefOr[String] = js.native
  
  var decorationStyle: js.UndefOr[DecorationStyle] = js.native
  
  var eccLevel: js.UndefOr[L | M | Q | H] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var fit: js.UndefOr[Double] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var foreground: js.UndefOr[String] = js.native
  
  var headlineLevel: js.UndefOr[Double] = js.native
  
  var italics: js.UndefOr[Boolean] = js.native
  
  var leadingIndent: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Margins] = js.native
  
  var markerColor: js.UndefOr[String] = js.native
  
  var mask: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[numeric | alphanumeric | octet] = js.native
  
  var noWrap: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pageBreak: js.UndefOr[PageBreak] = js.native
  
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  
  var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
  
  var relativePosition: js.UndefOr[X] = js.native
  
  var style: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object EleNoChidlrenOmitContentQ {
  
  @scala.inline
  def apply(content: String): EleNoChidlrenOmitContentQ = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[EleNoChidlrenOmitContentQ]
  }
  
  @scala.inline
  implicit class EleNoChidlrenOmitContentQOps[Self <: EleNoChidlrenOmitContentQ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePosition(value: X): Self = this.set("absolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePosition: Self = this.set("absolutePosition", js.undefined)
    
    @scala.inline
    def setAlignment(value: Alignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCharacterSpacing(value: Double): Self = this.set("characterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSpacing: Self = this.set("characterSpacing", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColumnGap(value: Size): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGap: Self = this.set("columnGap", js.undefined)
    
    @scala.inline
    def setDecoration(value: Decoration): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setDecorationColor(value: String): Self = this.set("decorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationColor: Self = this.set("decorationColor", js.undefined)
    
    @scala.inline
    def setDecorationStyle(value: DecorationStyle): Self = this.set("decorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationStyle: Self = this.set("decorationStyle", js.undefined)
    
    @scala.inline
    def setEccLevel(value: L | M | Q | H): Self = this.set("eccLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEccLevel: Self = this.set("eccLevel", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFit(value: Double): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = this.set("fontFeatures", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = this.set("fontFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatures: Self = this.set("fontFeatures", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setHeadlineLevel(value: Double): Self = this.set("headlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadlineLevel: Self = this.set("headlineLevel", js.undefined)
    
    @scala.inline
    def setItalics(value: Boolean): Self = this.set("italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalics: Self = this.set("italics", js.undefined)
    
    @scala.inline
    def setLeadingIndent(value: Double): Self = this.set("leadingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingIndent: Self = this.set("leadingIndent", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMargin(value: Margins): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    
    @scala.inline
    def setMask(value: Double): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMode(value: numeric | alphanumeric | octet): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPageBreak(value: PageBreak): Self = this.set("pageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBreak: Self = this.set("pageBreak", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    
    @scala.inline
    def setPreserveLeadingSpaces(value: Boolean): Self = this.set("preserveLeadingSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveLeadingSpaces: Self = this.set("preserveLeadingSpaces", js.undefined)
    
    @scala.inline
    def setRelativePosition(value: X): Self = this.set("relativePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePosition: Self = this.set("relativePosition", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String | js.Array[String] | Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
