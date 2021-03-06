package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Print several pages on one printer page. */
@js.native
trait XPagePrintable extends XInterface {
  
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  var PagePrintSettings: SafeArray[PropertyValue] = js.native
  
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  def getPagePrintSettings(): SafeArray[PropertyValue] = js.native
  
  /**
    * prints the pages according to the {@link PagePrintSettings} .
    * @see com.sun.star.view.PrintOptions
    */
  def printPages(xOptions: SeqEquiv[PropertyValue]): Unit = js.native
  
  /**
    * adjusts the settings of the page printing.
    * @see getPagePrintSettings
    */
  def setPagePrintSettings(aSettings: SeqEquiv[PropertyValue]): Unit = js.native
}
object XPagePrintable {
  
  @scala.inline
  def apply(
    PagePrintSettings: SafeArray[PropertyValue],
    acquire: () => Unit,
    getPagePrintSettings: () => SafeArray[PropertyValue],
    printPages: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPagePrintSettings: SeqEquiv[PropertyValue] => Unit
  ): XPagePrintable = {
    val __obj = js.Dynamic.literal(PagePrintSettings = PagePrintSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPagePrintSettings = js.Any.fromFunction0(getPagePrintSettings), printPages = js.Any.fromFunction1(printPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPagePrintSettings = js.Any.fromFunction1(setPagePrintSettings))
    __obj.asInstanceOf[XPagePrintable]
  }
  
  @scala.inline
  implicit class XPagePrintableMutableBuilder[Self <: XPagePrintable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPagePrintSettings(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPagePrintSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPagePrintSettings(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PagePrintSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintPages(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "printPages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPagePrintSettings(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setPagePrintSettings", js.Any.fromFunction1(value))
  }
}
