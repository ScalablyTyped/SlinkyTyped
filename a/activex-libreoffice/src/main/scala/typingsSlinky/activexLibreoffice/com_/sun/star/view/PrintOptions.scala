package typingsSlinky.activexLibreoffice.com_.sun.star.view

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the options for print jobs.
  *
  * These options are only valid for a single print job. They do not change layout or formatting of the document.
  */
@js.native
trait PrintOptions extends StObject {
  
  /** advises the printer to collate the pages of the copies. */
  var Collate: Boolean = js.native
  
  /** specifies the number of copies to print. */
  var CopyCount: Double = js.native
  
  /**
    * determines the duplex mode for the print job.
    * @see DuplexMode for more information about supported values
    */
  var DuplexMode: Double = js.native
  
  /** if set, specifies the name of a file to print to. */
  var FileName: String = js.native
  
  /**
    * specifies which pages to print.
    *
    * This range is given as at the user interface. For example: "1-4;10" to print the pages 1 to 4 and 10.
    */
  var Pages: String = js.native
  
  /** if set, specifies name of the printer to use. */
  var PrinterName: String = js.native
  
  /**
    * advises the printer to sort the pages of the copies.
    * @deprecated DeprecatedUse Collate instead.
    */
  var Sort: Boolean = js.native
  
  /** if set to TRUE, the corresponding {@link XPrintable.print()} request will be executed synchronous. <p>Default is the asynchronous print mode.</p> */
  var Wait: Boolean = js.native
}
object PrintOptions {
  
  @scala.inline
  def apply(
    Collate: Boolean,
    CopyCount: Double,
    DuplexMode: Double,
    FileName: String,
    Pages: String,
    PrinterName: String,
    Sort: Boolean,
    Wait: Boolean
  ): PrintOptions = {
    val __obj = js.Dynamic.literal(Collate = Collate.asInstanceOf[js.Any], CopyCount = CopyCount.asInstanceOf[js.Any], DuplexMode = DuplexMode.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Wait = Wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
  
  @scala.inline
  implicit class PrintOptionsMutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollate(value: Boolean): Self = StObject.set(x, "Collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyCount(value: Double): Self = StObject.set(x, "CopyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplexMode(value: Double): Self = StObject.set(x, "DuplexMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: String): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterName(value: String): Self = StObject.set(x, "PrinterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait(value: Boolean): Self = StObject.set(x, "Wait", value.asInstanceOf[js.Any])
  }
}
