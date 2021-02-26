package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides timestamp information for an object in the form of an arbitrary string.
  *
  * The format and meaning of the timestamp depends on the implementation. Services implementing this interface must document the meaning and format they
  * use.
  *
  * If the timestamp is unchanged between two calls, the associated object has not changed. Any properties beyond this, particularly the presence of a
  * meaningful order between timestamps, depend on the implementation.
  * @since OOo 1.1.2
  */
@js.native
trait XTimeStamped extends XInterface {
  
  /**
    * returns the timestamp of the object.
    * @returns a `string` that represents a timestamp.
    */
  val Timestamp: String = js.native
  
  /**
    * returns the timestamp of the object.
    * @returns a `string` that represents a timestamp.
    */
  def getTimestamp(): String = js.native
}
object XTimeStamped {
  
  @scala.inline
  def apply(
    Timestamp: String,
    acquire: () => Unit,
    getTimestamp: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTimeStamped = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTimestamp = js.Any.fromFunction0(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTimeStamped]
  }
  
  @scala.inline
  implicit class XTimeStampedMutableBuilder[Self <: XTimeStamped] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTimestamp(value: () => String): Self = StObject.set(x, "getTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
