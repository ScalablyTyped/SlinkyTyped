package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.documentScan.DocumentScanCallbackArg
import typingsSlinky.chrome.chrome.documentScan.DocumentScanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdocumentScan extends StObject {
  
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit = js.native
}
object TypeofdocumentScan {
  
  @scala.inline
  def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Unit): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal(scan = js.Any.fromFunction2(scan))
    __obj.asInstanceOf[TypeofdocumentScan]
  }
  
  @scala.inline
  implicit class TypeofdocumentScanMutableBuilder[Self <: TypeofdocumentScan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScan(value: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Unit): Self = StObject.set(x, "scan", js.Any.fromFunction2(value))
  }
}
