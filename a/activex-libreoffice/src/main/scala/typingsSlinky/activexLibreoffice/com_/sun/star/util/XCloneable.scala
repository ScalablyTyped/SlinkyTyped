package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to create a copy of the object which supports this interface. */
@js.native
trait XCloneable extends XInterface {
  
  /** creates a copy of the object. */
  def createClone(): XCloneable = js.native
}
object XCloneable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createClone: () => XCloneable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCloneable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClone = js.Any.fromFunction0(createClone), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCloneable]
  }
  
  @scala.inline
  implicit class XCloneableMutableBuilder[Self <: XCloneable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateClone(value: () => XCloneable): Self = StObject.set(x, "createClone", js.Any.fromFunction0(value))
  }
}
