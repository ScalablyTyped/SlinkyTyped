package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the elements of a collection through a unique identifier. */
@js.native
trait XIdentifierAccess extends XElementAccess {
  
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  val Identifiers: SafeArray[Double] = js.native
  
  /**
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @returns the element with the specified identifier
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIdentifier(Identifier: Double): js.Any = js.native
  
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  def getIdentifiers(): SafeArray[Double] = js.native
}
object XIdentifierAccess {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: () => Unit,
    getByIdentifier: Double => js.Any,
    getElementType: () => `type`,
    getIdentifiers: () => SafeArray[Double],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIdentifierAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdentifierAccess]
  }
  
  @scala.inline
  implicit class XIdentifierAccessMutableBuilder[Self <: XIdentifierAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetByIdentifier(value: Double => js.Any): Self = StObject.set(x, "getByIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIdentifiers(value: () => SafeArray[Double]): Self = StObject.set(x, "getIdentifiers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdentifiers(value: SafeArray[Double]): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
  }
}
