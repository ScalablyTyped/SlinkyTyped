package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to import styles from documents. */
@js.native
trait XStyleLoader extends XInterface {
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  val StyleLoaderOptions: SafeArray[PropertyValue] = js.native
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  def getStyleLoaderOptions(): SafeArray[PropertyValue] = js.native
  
  /**
    * loads styles from a document at the given URL.
    *
    * If **OverwriteStyles** is `TRUE` , then all styles will be loaded. Otherwise, only styles which are not already defined in this document are loaded.
    * @param URL The directory and the filename from document with the styles
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromURL(URL: String, aOptions: SeqEquiv[PropertyValue]): Unit = js.native
}
object XStyleLoader {
  
  @scala.inline
  def apply(
    StyleLoaderOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getStyleLoaderOptions: () => SafeArray[PropertyValue],
    loadStylesFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleLoader = {
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleLoaderOptions = js.Any.fromFunction0(getStyleLoaderOptions), loadStylesFromURL = js.Any.fromFunction2(loadStylesFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleLoader]
  }
  
  @scala.inline
  implicit class XStyleLoaderMutableBuilder[Self <: XStyleLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStyleLoaderOptions(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getStyleLoaderOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadStylesFromURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "loadStylesFromURL", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleLoaderOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "StyleLoaderOptions", value.asInstanceOf[js.Any])
  }
}
