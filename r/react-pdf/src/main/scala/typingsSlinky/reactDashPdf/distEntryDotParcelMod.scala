package typingsSlinky.reactDashPdf

import typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.PDFJSStatic
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashPdf.distDocumentMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pdf/dist/entry.parcel", JSImport.Namespace)
@js.native
object distEntryDotParcelMod extends js.Object {
  @js.native
  class Document ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class Outline ()
    extends Component[typingsSlinky.reactDashPdf.distOutlineMod.Props, js.Object, js.Any]
  
  @js.native
  class Page ()
    extends Component[typingsSlinky.reactDashPdf.distPageMod.Props, js.Object, js.Any]
  
  @js.native
  object pdfjs extends js.Object {
    val PDFJS: PDFJSStatic = js.native
    @js.native
    object CMapCompressionType extends js.Object {
      /* 1 */ val BINARY: typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType.BINARY with Double = js.native
      /* 0 */ val NONE: typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType.NONE with Double = js.native
      /* 2 */ val STREAM: typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType.STREAM with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType with Double] = js.native
    }
    
    @js.native
    object VerbosityLevel extends js.Object {
      /* 0 */ val ERRORS: typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel.ERRORS with Double = js.native
      /* 5 */ val INFOS: typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel.INFOS with Double = js.native
      /* 1 */ val WARNINGS: typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel.WARNINGS with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel with Double] = js.native
    }
    
  }
  
}

