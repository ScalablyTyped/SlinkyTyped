package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for providing an input stream.
  *
  * Every time {@link createInputStream()} is called a new input stream is returned, always pointing to the begin of the same data. All input streams
  * returned by {@link createInputStream()} are completely independent from each other.
  */
@js.native
trait XInputStreamProvider extends XInterface {
  
  /**
    * Creates a new input stream, every time providing the same data.
    * @returns a new input stream
    */
  def createInputStream(): XInputStream = js.native
}
object XInputStreamProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInputStream: () => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInputStreamProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInputStream = js.Any.fromFunction0(createInputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInputStreamProvider]
  }
  
  @scala.inline
  implicit class XInputStreamProviderMutableBuilder[Self <: XInputStreamProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateInputStream(value: () => XInputStream): Self = StObject.set(x, "createInputStream", js.Any.fromFunction0(value))
  }
}
