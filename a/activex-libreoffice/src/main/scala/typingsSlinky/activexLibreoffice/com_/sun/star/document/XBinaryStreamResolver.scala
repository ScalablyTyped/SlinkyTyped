package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface encapsulates functionality to get/resolve binary data streams. It is used to transform binary data to an URL or to transform an URL to
  * binary data. The binary data is represented through input and output streams.
  *
  * In the case of transforming an URL to binary data, the `getInputStream` method is used. This returns a {@link com.sun.star.io.XInputStream} from which
  * the binary data, transformed from the given URL, can be read.
  *
  * In the case of transforming binary data to an URL, a {@link com.sun.star.io.XOutputStream} is created first to write the binary data to. After this,
  * the `resolveOutputStream` method can be used to transform the binary data, represented through the {@link com.sun.star.io.XOutputStream} interface, to
  * an URL.
  */
@js.native
trait XBinaryStreamResolver extends XInterface {
  
  /**
    * creates an output stream, to which binary data can be written. After writing, an URL can be retrieved by a call to {@link
    * XBinaryStreamResolver.resolveOutputStream()} .
    */
  def createOutputStream(): XOutputStream = js.native
  
  /** converts the given URL from the source URL namespace to an input stream, from which binary data can be read */
  def getInputStream(aURL: String): XInputStream = js.native
  
  /** converts the output stream, data has been written to, to an URL in source URL namespace. */
  def resolveOutputStream(aBinaryStream: XOutputStream): String = js.native
}
object XBinaryStreamResolver {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createOutputStream: () => XOutputStream,
    getInputStream: String => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveOutputStream: XOutputStream => String
  ): XBinaryStreamResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createOutputStream = js.Any.fromFunction0(createOutputStream), getInputStream = js.Any.fromFunction1(getInputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveOutputStream = js.Any.fromFunction1(resolveOutputStream))
    __obj.asInstanceOf[XBinaryStreamResolver]
  }
  
  @scala.inline
  implicit class XBinaryStreamResolverMutableBuilder[Self <: XBinaryStreamResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateOutputStream(value: () => XOutputStream): Self = StObject.set(x, "createOutputStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputStream(value: String => XInputStream): Self = StObject.set(x, "getInputStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveOutputStream(value: XOutputStream => String): Self = StObject.set(x, "resolveOutputStream", js.Any.fromFunction1(value))
  }
}
