package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers read and write access to the same stream. */
@js.native
trait XStream extends XInterface {
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  val InputStream: XInputStream = js.native
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  val OutputStream: XOutputStream = js.native
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  def getInputStream(): XInputStream = js.native
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  def getOutputStream(): XOutputStream = js.native
}
object XStream {
  
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStream]
  }
  
  @scala.inline
  implicit class XStreamMutableBuilder[Self <: XStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInputStream(value: () => XInputStream): Self = StObject.set(x, "getInputStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOutputStream(value: () => XOutputStream): Self = StObject.set(x, "getOutputStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputStream(value: XInputStream): Self = StObject.set(x, "InputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputStream(value: XOutputStream): Self = StObject.set(x, "OutputStream", value.asInstanceOf[js.Any])
  }
}
