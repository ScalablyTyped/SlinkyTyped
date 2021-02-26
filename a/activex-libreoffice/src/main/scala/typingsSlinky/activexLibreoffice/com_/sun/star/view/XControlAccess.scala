package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the controls in a view.
  * @see com.sun.star.frame.XController
  */
@js.native
trait XControlAccess extends XInterface {
  
  /** is called to get the control from the specified control model. */
  def getControl(xModel: XControlModel): XControl = js.native
}
object XControlAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getControl: XControlModel => XControl,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XControlAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XControlAccess]
  }
  
  @scala.inline
  implicit class XControlAccessMutableBuilder[Self <: XControlAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetControl(value: XControlModel => XControl): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
  }
}
