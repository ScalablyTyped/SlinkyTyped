package typingsSlinky.jsxPdf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsxPdf.jsxPdfStrings.Asterisk
import typingsSlinky.jsxPdf.jsxPdfStrings.H
import typingsSlinky.jsxPdf.jsxPdfStrings.L
import typingsSlinky.jsxPdf.jsxPdfStrings.M
import typingsSlinky.jsxPdf.jsxPdfStrings.Q
import typingsSlinky.jsxPdf.jsxPdfStrings.alphanumeric
import typingsSlinky.jsxPdf.jsxPdfStrings.auto
import typingsSlinky.jsxPdf.jsxPdfStrings.numeric
import typingsSlinky.jsxPdf.jsxPdfStrings.octet
import typingsSlinky.jsxPdf.mod.global.JSX.Child
import typingsSlinky.jsxPdf.mod.global.JSX.DynamicChild
import typingsSlinky.jsxPdf.mod.global.JSX.Element
import typingsSlinky.pdfkit.PDFKit.DocumentPermissions
import typingsSlinky.pdfkit.PDFKit.Mixins.OpenTypeFeatures
import typingsSlinky.pdfmake.anon.X
import typingsSlinky.pdfmake.interfacesMod.Alignment
import typingsSlinky.pdfmake.interfacesMod.ContextPageSize
import typingsSlinky.pdfmake.interfacesMod.Decoration
import typingsSlinky.pdfmake.interfacesMod.DecorationStyle
import typingsSlinky.pdfmake.interfacesMod.DynamicBackground
import typingsSlinky.pdfmake.interfacesMod.DynamicRowSize
import typingsSlinky.pdfmake.interfacesMod.Margins
import typingsSlinky.pdfmake.interfacesMod.Node
import typingsSlinky.pdfmake.interfacesMod.OrderedListType
import typingsSlinky.pdfmake.interfacesMod.PDFVersion
import typingsSlinky.pdfmake.interfacesMod.PageBreak
import typingsSlinky.pdfmake.interfacesMod.PageOrientation
import typingsSlinky.pdfmake.interfacesMod.PageSize
import typingsSlinky.pdfmake.interfacesMod.Size
import typingsSlinky.pdfmake.interfacesMod.Style
import typingsSlinky.pdfmake.interfacesMod.StyleDictionary
import typingsSlinky.pdfmake.interfacesMod.TDocumentInformation
import typingsSlinky.pdfmake.interfacesMod.TableLayout
import typingsSlinky.pdfmake.interfacesMod.UnorderedListType
import typingsSlinky.pdfmake.interfacesMod.Watermark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{}> */
  @js.native
  trait Ele extends StObject {
    
    var children: DynamicChild = js.native
  }
  object Ele {
    
    @scala.inline
    def apply(children: DynamicChild): Ele = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ele]
    }
    
    @scala.inline
    implicit class EleMutableBuilder[Self <: Ele] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.EleNoChidlren<std.Omit<pdfmake.pdfmake/interfaces.ContentImage, 'image'> & {  src :string}> */
  @js.native
  trait EleNoChidlrenOmitContentI extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var linkToDestination: js.UndefOr[String] = js.native
    
    var linkToPage: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var src: String = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object EleNoChidlrenOmitContentI {
    
    @scala.inline
    def apply(src: String): EleNoChidlrenOmitContentI = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleNoChidlrenOmitContentI]
    }
    
    @scala.inline
    implicit class EleNoChidlrenOmitContentIMutableBuilder[Self <: EleNoChidlrenOmitContentI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
      
      @scala.inline
      def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.EleNoChidlren<std.Omit<pdfmake.pdfmake/interfaces.ContentQr, 'qr'> & {  content :string}> */
  @js.native
  trait EleNoChidlrenOmitContentQ extends StObject {
    
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
    implicit class EleNoChidlrenOmitContentQMutableBuilder[Self <: EleNoChidlrenOmitContentQ] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setEccLevel(value: L | M | Q | H): Self = StObject.set(x, "eccLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEccLevelUndefined: Self = StObject.set(x, "eccLevel", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFit(value: Double): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMode(value: numeric | alphanumeric | octet): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentColumns, 'columns'>> */
  @js.native
  trait EleOmitContentColumnscolu extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var children: DynamicChild = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
  }
  object EleOmitContentColumnscolu {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentColumnscolu = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentColumnscolu]
    }
    
    @scala.inline
    implicit class EleOmitContentColumnscoluMutableBuilder[Self <: EleOmitContentColumnscolu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentOrderedList, 'ol'>> */
  @js.native
  trait EleOmitContentOrderedList extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var children: DynamicChild = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
    
    var `type`: js.UndefOr[OrderedListType] = js.native
  }
  object EleOmitContentOrderedList {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentOrderedList = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentOrderedList]
    }
    
    @scala.inline
    implicit class EleOmitContentOrderedListMutableBuilder[Self <: EleOmitContentOrderedList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setSeparator(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setType(value: OrderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentStack, 'stack'>> */
  @js.native
  trait EleOmitContentStackstack extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var children: DynamicChild = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
    
    var unbreakable: js.UndefOr[Boolean] = js.native
  }
  object EleOmitContentStackstack {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentStackstack = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentStackstack]
    }
    
    @scala.inline
    implicit class EleOmitContentStackstackMutableBuilder[Self <: EleOmitContentStackstack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setUnbreakable(value: Boolean): Self = StObject.set(x, "unbreakable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnbreakableUndefined: Self = StObject.set(x, "unbreakable", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentTable, 'table'> & std.Omit<pdfmake.pdfmake/interfaces.Table, 'body'>> */
  @js.native
  trait EleOmitContentTabletableO extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var children: DynamicChild = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var dontBreakRows: js.UndefOr[Boolean] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headerRows: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var keepWithHeaderRows: js.UndefOr[Double] = js.native
    
    var layout: js.UndefOr[TableLayout] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
    
    var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.native
  }
  object EleOmitContentTabletableO {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentTabletableO = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentTabletableO]
    }
    
    @scala.inline
    implicit class EleOmitContentTabletableOMutableBuilder[Self <: EleOmitContentTabletableO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setDontBreakRows(value: Boolean): Self = StObject.set(x, "dontBreakRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontBreakRowsUndefined: Self = StObject.set(x, "dontBreakRows", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightsFunction1(value: /* row */ Double => Double | typingsSlinky.pdfmake.pdfmakeStrings.auto): Self = StObject.set(x, "heights", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
      
      @scala.inline
      def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setKeepWithHeaderRows(value: Double): Self = StObject.set(x, "keepWithHeaderRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepWithHeaderRowsUndefined: Self = StObject.set(x, "keepWithHeaderRows", js.undefined)
      
      @scala.inline
      def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setWidths(value: Asterisk | auto | js.Array[Size]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      @scala.inline
      def setWidthsVarargs(value: Size*): Self = StObject.set(x, "widths", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentText, 'text'>> */
  @js.native
  trait EleOmitContentTexttext extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var children: DynamicChild = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var linkToDestination: js.UndefOr[String] = js.native
    
    var linkToPage: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
  }
  object EleOmitContentTexttext {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentTexttext = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentTexttext]
    }
    
    @scala.inline
    implicit class EleOmitContentTexttextMutableBuilder[Self <: EleOmitContentTexttext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
      
      @scala.inline
      def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.ContentUnorderedList, 'ul'>> */
  @js.native
  trait EleOmitContentUnorderedLi extends StObject {
    
    var absolutePosition: js.UndefOr[X] = js.native
    
    var alignment: js.UndefOr[Alignment] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var characterSpacing: js.UndefOr[Double] = js.native
    
    var children: DynamicChild = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[Size] = js.native
    
    var decoration: js.UndefOr[Decoration] = js.native
    
    var decorationColor: js.UndefOr[String] = js.native
    
    var decorationStyle: js.UndefOr[DecorationStyle] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontFeatures: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var headlineLevel: js.UndefOr[Double] = js.native
    
    var italics: js.UndefOr[Boolean] = js.native
    
    var leadingIndent: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Margins] = js.native
    
    var markerColor: js.UndefOr[String] = js.native
    
    var noWrap: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pageBreak: js.UndefOr[PageBreak] = js.native
    
    var pageOrientation: js.UndefOr[PageOrientation] = js.native
    
    var preserveLeadingSpaces: js.UndefOr[Boolean] = js.native
    
    var relativePosition: js.UndefOr[X] = js.native
    
    var style: js.UndefOr[String | js.Array[String] | Style] = js.native
    
    var `type`: js.UndefOr[UnorderedListType] = js.native
  }
  object EleOmitContentUnorderedLi {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitContentUnorderedLi = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitContentUnorderedLi]
    }
    
    @scala.inline
    implicit class EleOmitContentUnorderedLiMutableBuilder[Self <: EleOmitContentUnorderedLi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePosition(value: X): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
      
      @scala.inline
      def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Size): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setDecoration(value: Decoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColor(value: String): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
      
      @scala.inline
      def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
      
      @scala.inline
      def setFontFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeadlineLevel(value: Double): Self = StObject.set(x, "headlineLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineLevelUndefined: Self = StObject.set(x, "headlineLevel", js.undefined)
      
      @scala.inline
      def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
      
      @scala.inline
      def setLeadingIndent(value: Double): Self = StObject.set(x, "leadingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIndentUndefined: Self = StObject.set(x, "leadingIndent", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMargin(value: Margins): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPreserveLeadingSpaces(value: Boolean): Self = StObject.set(x, "preserveLeadingSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingSpacesUndefined: Self = StObject.set(x, "preserveLeadingSpaces", js.undefined)
      
      @scala.inline
      def setRelativePosition(value: X): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePositionUndefined: Self = StObject.set(x, "relativePosition", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setType(value: UnorderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<std.Omit<pdfmake.pdfmake/interfaces.TDocumentDefinitions, 'content' | 'header' | 'footer'>> */
  @js.native
  trait EleOmitTDocumentDefinitio extends StObject {
    
    var background: js.UndefOr[DynamicBackground | typingsSlinky.pdfmake.interfacesMod.Content] = js.native
    
    var children: DynamicChild = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var defaultStyle: js.UndefOr[Style] = js.native
    
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
  object EleOmitTDocumentDefinitio {
    
    @scala.inline
    def apply(children: DynamicChild): EleOmitTDocumentDefinitio = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[EleOmitTDocumentDefinitio]
    }
    
    @scala.inline
    implicit class EleOmitTDocumentDefinitioMutableBuilder[Self <: EleOmitTDocumentDefinitio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: DynamicBackground | typingsSlinky.pdfmake.interfacesMod.Content): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundFunction2(
        value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[typingsSlinky.pdfmake.interfacesMod.Content | Null]
      ): Self = StObject.set(x, "background", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: Style): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setImages(value: StringDictionary[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setInfo(value: TDocumentInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
      
      @scala.inline
      def setPageBreakBefore(
        value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
      ): Self = StObject.set(x, "pageBreakBefore", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      @scala.inline
      def setPageMargins(value: Margins): Self = StObject.set(x, "pageMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageMarginsUndefined: Self = StObject.set(x, "pageMargins", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setStyles(value: StyleDictionary): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
      
      @scala.inline
      def setVersion(value: PDFVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWatermark(value: String | Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
    }
  }
  
  /* Inlined jsx-pdf.jsx-pdf.<global>.JSX.Ele<{  width :number | string}> */
  @js.native
  trait Elewidthnumberstring extends StObject {
    
    var children: DynamicChild = js.native
    
    var width: Double | String = js.native
  }
  object Elewidthnumberstring {
    
    @scala.inline
    def apply(children: DynamicChild, width: Double | String): Elewidthnumberstring = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elewidthnumberstring]
    }
    
    @scala.inline
    implicit class ElewidthnumberstringMutableBuilder[Self <: Elewidthnumberstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: DynamicChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => Child): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
