package typingsSlinky.reactPdf

import typingsSlinky.pdfjsDist.mod.PDFJSStatic
import typingsSlinky.react.mod.Component
import typingsSlinky.reactPdf.documentMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pdf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Document ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class Outline ()
    extends Component[typingsSlinky.reactPdf.outlineMod.Props, js.Object, js.Any]
  
  @js.native
  class Page ()
    extends Component[typingsSlinky.reactPdf.pageMod.Props, js.Object, js.Any]
  
  @js.native
  object pdfjs extends js.Object {
    val PDFJS: PDFJSStatic = js.native
    @js.native
    object CMapCompressionType extends js.Object {
      /* 1 */ val BINARY: typingsSlinky.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
      /* 0 */ val NONE: typingsSlinky.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
      /* 2 */ val STREAM: typingsSlinky.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.pdfjsDist.mod.CMapCompressionType with Double] = js.native
    }
    
    @js.native
    object VerbosityLevel extends js.Object {
      /* 0 */ val ERRORS: typingsSlinky.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
      /* 5 */ val INFOS: typingsSlinky.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
      /* 1 */ val WARNINGS: typingsSlinky.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.pdfjsDist.mod.VerbosityLevel with Double] = js.native
    }
    
  }
  
}

