package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Insertion and removal of hierarchical elements. */
@js.native
trait XHierarchicalNameContainer extends XHierarchicalNameReplace {
  
  /** inserts the element at the specified name. */
  def insertByHierarchicalName(aName: String, aElement: js.Any): Unit = js.native
  
  /** removes the element at the specified name. */
  def removeByHierarchicalName(Name: String): Unit = js.native
}
object XHierarchicalNameContainer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    insertByHierarchicalName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByHierarchicalName: String => Unit,
    replaceByHierarchicalName: (String, js.Any) => Unit
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), insertByHierarchicalName = js.Any.fromFunction2(insertByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByHierarchicalName = js.Any.fromFunction1(removeByHierarchicalName), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
  
  @scala.inline
  implicit class XHierarchicalNameContainerMutableBuilder[Self <: XHierarchicalNameContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertByHierarchicalName(value: (String, js.Any) => Unit): Self = StObject.set(x, "insertByHierarchicalName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveByHierarchicalName(value: String => Unit): Self = StObject.set(x, "removeByHierarchicalName", js.Any.fromFunction1(value))
  }
}
