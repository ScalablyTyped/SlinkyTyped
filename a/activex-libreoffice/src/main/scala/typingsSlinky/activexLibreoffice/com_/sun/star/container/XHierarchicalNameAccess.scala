package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to have hierarchical access to elements within a container.
  *
  * You address an object of a specific level in the hierarchy by giving its fully qualified name, e.g., "com.sun.star.uno.XInterface".
  *
  * To implement inaccurate name access, support the {@link com.sun.star.beans.XExactName} interface.
  * @see com.sun.star.beans.XExactName
  */
@js.native
trait XHierarchicalNameAccess extends XInterface {
  
  /**
    * @param aName the name of the object.
    * @returns the object with the specified name.
    * @throws NoSuchElementException if an element under Name does not exist.
    */
  def getByHierarchicalName(aName: String): js.Any = js.native
  
  /**
    * @param aName the name of the object.
    * @returns `TRUE` if an element with this name is in the container, `FALSE` otherwise.  In many cases, the next call is {@link XNameAccess.getByName()} . Yo
    */
  def hasByHierarchicalName(aName: String): Boolean = js.native
}
object XHierarchicalNameAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHierarchicalNameAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHierarchicalNameAccess]
  }
  
  @scala.inline
  implicit class XHierarchicalNameAccessOps[Self <: XHierarchicalNameAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetByHierarchicalName(value: String => js.Any): Self = this.set("getByHierarchicalName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasByHierarchicalName(value: String => Boolean): Self = this.set("hasByHierarchicalName", js.Any.fromFunction1(value))
  }
}
