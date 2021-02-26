package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XElementAccess
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this interface enables inspecting a set of changes forming one batch transaction.
  *
  * An object implementing this interface should implement more container interfaces to access individual changes as well.
  * @see XChangesBatch
  * @see ChangesEvent
  * @see XChangesListener
  * @see XChangesNotifier
  */
@js.native
trait XChangesSet extends XElementAccess {
  
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  val AllChanges: SafeArray[ElementChange] = js.native
  
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  def getAllChanges(): SafeArray[ElementChange] = js.native
}
object XChangesSet {
  
  @scala.inline
  def apply(
    AllChanges: SafeArray[ElementChange],
    ElementType: `type`,
    acquire: () => Unit,
    getAllChanges: () => SafeArray[ElementChange],
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChangesSet = {
    val __obj = js.Dynamic.literal(AllChanges = AllChanges.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAllChanges = js.Any.fromFunction0(getAllChanges), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChangesSet]
  }
  
  @scala.inline
  implicit class XChangesSetMutableBuilder[Self <: XChangesSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllChanges(value: SafeArray[ElementChange]): Self = StObject.set(x, "AllChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllChanges(value: () => SafeArray[ElementChange]): Self = StObject.set(x, "getAllChanges", js.Any.fromFunction0(value))
  }
}
