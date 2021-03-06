package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to get an object to generate a digest of a specified format.
  * @since OOo 3.4
  */
@js.native
trait XDigestContextSupplier extends XInterface {
  
  /**
    * returns an object that allows to generate the specified digest.
    * @param nDigestID the internal ID specifying the algorithm, should take value from {@link DigestID}
    * @param aParams optional parameters that could be used to initialize the digest, for example, it could contain a key and etc.
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getDigestContext(nDigestID: Double, aParams: SeqEquiv[NamedValue]): XDigestContext = js.native
}
object XDigestContextSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDigestContext: (Double, SeqEquiv[NamedValue]) => XDigestContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDigestContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDigestContext = js.Any.fromFunction2(getDigestContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDigestContextSupplier]
  }
  
  @scala.inline
  implicit class XDigestContextSupplierMutableBuilder[Self <: XDigestContextSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDigestContext(value: (Double, SeqEquiv[NamedValue]) => XDigestContext): Self = StObject.set(x, "getDigestContext", js.Any.fromFunction2(value))
  }
}
