package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the parent of the object.
  *
  * This interface normally is only supported if the objects all have exactly one dedicated parent container.
  */
@js.native
trait XChild extends XInterface {
  
  /** grants access to the object containing this content. */
  var Parent: XInterface = js.native
  
  /** grants access to the object containing this content. */
  def getParent(): XInterface = js.native
  
  /**
    * sets the parent to this object.
    * @throws com::sun::star::lang::NoSupportException if the name of this object cannot be changed.
    */
  def setParent(Parent: XInterface): Unit = js.native
}
object XChild {
  
  @scala.inline
  def apply(
    Parent: XInterface,
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XChild = {
    val __obj = js.Dynamic.literal(Parent = Parent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XChild]
  }
  
  @scala.inline
  implicit class XChildMutableBuilder[Self <: XChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetParent(value: () => XInterface): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: XInterface): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetParent(value: XInterface => Unit): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
  }
}
