package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends {@link XStorable} . */
@js.native
trait XStorable2 extends XStorable {
  
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    *
    * This is an extension of the {@link XStorable.store()} . This method allows to specify some additional parameters for storing process.
    * @param lArguments optional parameters for saving, can take values from subset of {@link com.sun.star.document.MediaDescriptor}
    * @see XStorable.store
    * @throws com::sun::star::lang::IllegalArgumentException the optional parameters contain unacceptable for save entry
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation
    */
  def storeSelf(lArguments: SeqEquiv[PropertyValue]): Unit = js.native
}
object XStorable2 {
  
  @scala.inline
  def apply(
    Location: String,
    acquire: () => Unit,
    getLocation: () => String,
    hasLocation: () => Boolean,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    store: () => Unit,
    storeAsURL: (String, SeqEquiv[PropertyValue]) => Unit,
    storeSelf: SeqEquiv[PropertyValue] => Unit,
    storeToURL: (String, SeqEquiv[PropertyValue]) => Unit
  ): XStorable2 = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocation = js.Any.fromFunction0(getLocation), hasLocation = js.Any.fromFunction0(hasLocation), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction2(storeAsURL), storeSelf = js.Any.fromFunction1(storeSelf), storeToURL = js.Any.fromFunction2(storeToURL))
    __obj.asInstanceOf[XStorable2]
  }
  
  @scala.inline
  implicit class XStorable2MutableBuilder[Self <: XStorable2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoreSelf(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "storeSelf", js.Any.fromFunction1(value))
  }
}
