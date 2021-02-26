package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies an autotext entry.
  * @deprecated Deprecated
  */
@js.native
trait XAutoTextEntry extends XInterface {
  
  /** inserts the contents represented by this auto text entry at the specified text range. */
  def applyTo(xRange: XTextRange): Unit = js.native
}
object XAutoTextEntry {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    applyTo: XTextRange => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoTextEntry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applyTo = js.Any.fromFunction1(applyTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoTextEntry]
  }
  
  @scala.inline
  implicit class XAutoTextEntryMutableBuilder[Self <: XAutoTextEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyTo(value: XTextRange => Unit): Self = StObject.set(x, "applyTo", js.Any.fromFunction1(value))
  }
}
