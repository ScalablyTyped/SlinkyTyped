package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for password fields. */
@js.native
trait XTextEditField extends XInterface {
  
  /** sets the character to display as a substitute on user input. */
  def setEchoChar(cEcho: String): Unit = js.native
}
object XTextEditField {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEchoChar: String => Unit
  ): XTextEditField = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEchoChar = js.Any.fromFunction1(setEchoChar))
    __obj.asInstanceOf[XTextEditField]
  }
  
  @scala.inline
  implicit class XTextEditFieldMutableBuilder[Self <: XTextEditField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetEchoChar(value: String => Unit): Self = StObject.set(x, "setEchoChar", js.Any.fromFunction1(value))
  }
}
