package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the creation and removal of elements with unique identifiers.
  * @see XContainer
  */
@js.native
trait XIdentifierContainer extends XIdentifierReplace {
  
  /**
    * inserts an element and creates a new unique identifier for it.
    * @param aElement The new element that will be inserted.
    * @returns the newly created identifier under which the element is inserted.
    * @throws com::sun::star::lang::IllegalArgumentException if the argument is not vailid for this container.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def insert(aElement: js.Any): Double = js.native
  
  /**
    * removes the element with the specified identifier.
    * @param Identifier The identifier that should be removed.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier does not exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def removeByIdentifier(Identifier: Double): Unit = js.native
}
object XIdentifierContainer {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: () => Unit,
    getByIdentifier: Double => js.Any,
    getElementType: () => `type`,
    getIdentifiers: () => SafeArray[Double],
    hasElements: () => Boolean,
    insert: js.Any => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIdentifier: Double => Unit,
    replaceByIdentifer: (Double, js.Any) => Unit
  ): XIdentifierContainer = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIdentifier = js.Any.fromFunction1(removeByIdentifier), replaceByIdentifer = js.Any.fromFunction2(replaceByIdentifer))
    __obj.asInstanceOf[XIdentifierContainer]
  }
  
  @scala.inline
  implicit class XIdentifierContainerOps[Self <: XIdentifierContainer] (val x: Self) extends AnyVal {
    
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
    def setInsert(value: js.Any => Double): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByIdentifier(value: Double => Unit): Self = this.set("removeByIdentifier", js.Any.fromFunction1(value))
  }
}
