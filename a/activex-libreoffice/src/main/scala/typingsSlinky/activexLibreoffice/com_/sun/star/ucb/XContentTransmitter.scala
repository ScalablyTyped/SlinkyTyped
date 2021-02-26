package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @author Dirk Voelzke
  * @deprecated Deprecated
  * @see
  * @version 1.0
  */
@js.native
trait XContentTransmitter extends XInterface {
  
  def transmit(Source: String, Destination: String, Flags: Double): Unit = js.native
}
object XContentTransmitter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    transmit: (String, String, Double) => Unit
  ): XContentTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transmit = js.Any.fromFunction3(transmit))
    __obj.asInstanceOf[XContentTransmitter]
  }
  
  @scala.inline
  implicit class XContentTransmitterMutableBuilder[Self <: XContentTransmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransmit(value: (String, String, Double) => Unit): Self = StObject.set(x, "transmit", js.Any.fromFunction3(value))
  }
}
