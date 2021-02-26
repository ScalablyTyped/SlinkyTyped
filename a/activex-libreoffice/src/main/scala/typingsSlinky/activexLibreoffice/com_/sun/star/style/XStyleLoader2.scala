package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XStyleLoader} interface to import styles from an already opened component.
  * @see com.sun.star.style.XStyleLoader
  * @since LibreOffice 4.4
  */
@js.native
trait XStyleLoader2 extends XStyleLoader {
  
  /**
    * loads styles from a given document
    * @param aSourceComponent a valid XComponent reference to source document
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromDocument(aSourceComponent: XComponent, aOptions: SeqEquiv[PropertyValue]): Unit = js.native
}
object XStyleLoader2 {
  
  @scala.inline
  def apply(
    StyleLoaderOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getStyleLoaderOptions: () => SafeArray[PropertyValue],
    loadStylesFromDocument: (XComponent, SeqEquiv[PropertyValue]) => Unit,
    loadStylesFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleLoader2 = {
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleLoaderOptions = js.Any.fromFunction0(getStyleLoaderOptions), loadStylesFromDocument = js.Any.fromFunction2(loadStylesFromDocument), loadStylesFromURL = js.Any.fromFunction2(loadStylesFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleLoader2]
  }
  
  @scala.inline
  implicit class XStyleLoader2MutableBuilder[Self <: XStyleLoader2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadStylesFromDocument(value: (XComponent, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "loadStylesFromDocument", js.Any.fromFunction2(value))
  }
}
