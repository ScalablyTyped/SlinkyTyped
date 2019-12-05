package typingsSlinky.pdfjsDashDist

import typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.PDFJSStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdfjs-dist/webpack", JSImport.Namespace)
@js.native
object webpackMod extends js.Object {
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

