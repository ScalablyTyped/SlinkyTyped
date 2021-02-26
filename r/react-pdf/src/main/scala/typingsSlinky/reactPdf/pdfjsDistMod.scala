package typingsSlinky.reactPdf

import typingsSlinky.pdfjsDist.mod.PDFJSStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfjsDistMod {
  
  object default {
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.CMapCompressionType")
    @js.native
    object CMapCompressionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.pdfjsDist.mod.CMapCompressionType with Double] = js.native
      
      /* 1 */ val BINARY: typingsSlinky.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
      
      /* 0 */ val NONE: typingsSlinky.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
      
      /* 2 */ val STREAM: typingsSlinky.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFJS")
    @js.native
    val PDFJS: PDFJSStatic = js.native
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.VerbosityLevel")
    @js.native
    object VerbosityLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.pdfjsDist.mod.VerbosityLevel with Double] = js.native
      
      /* 0 */ val ERRORS: typingsSlinky.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
      
      /* 5 */ val INFOS: typingsSlinky.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
      
      /* 1 */ val WARNINGS: typingsSlinky.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
    }
  }
}
