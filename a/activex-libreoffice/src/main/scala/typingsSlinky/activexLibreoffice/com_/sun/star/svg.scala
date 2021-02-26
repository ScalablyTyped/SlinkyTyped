package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svg {
  
  /** @deprecated Deprecated */
  @js.native
  trait XSVGPrinter extends XInterface {
    
    def endJob(): Unit = js.native
    
    def printPage(aPrintPage: SeqEquiv[Double]): Unit = js.native
    
    def startJob(
      aHandler: XDocumentHandler,
      aJobSetup: SeqEquiv[Double],
      aJobName: String,
      nCopies: Double,
      bCollate: Boolean
    ): Boolean = js.native
  }
  object XSVGPrinter {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      endJob: () => Unit,
      printPage: SeqEquiv[Double] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      startJob: (XDocumentHandler, SeqEquiv[Double], String, Double, Boolean) => Boolean
    ): XSVGPrinter = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endJob = js.Any.fromFunction0(endJob), printPage = js.Any.fromFunction1(printPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startJob = js.Any.fromFunction5(startJob))
      __obj.asInstanceOf[XSVGPrinter]
    }
    
    @scala.inline
    implicit class XSVGPrinterMutableBuilder[Self <: XSVGPrinter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndJob(value: () => Unit): Self = StObject.set(x, "endJob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrintPage(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartJob(value: (XDocumentHandler, SeqEquiv[Double], String, Double, Boolean) => Boolean): Self = StObject.set(x, "startJob", js.Any.fromFunction5(value))
    }
  }
  
  /** @deprecated Deprecated */
  @js.native
  trait XSVGWriter extends XInterface {
    
    def write(aHandler: XDocumentHandler, aMtf: SeqEquiv[Double]): Unit = js.native
  }
  object XSVGWriter {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      write: (XDocumentHandler, SeqEquiv[Double]) => Unit
    ): XSVGWriter = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), write = js.Any.fromFunction2(write))
      __obj.asInstanceOf[XSVGWriter]
    }
    
    @scala.inline
    implicit class XSVGWriterMutableBuilder[Self <: XSVGWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: (XDocumentHandler, SeqEquiv[Double]) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
