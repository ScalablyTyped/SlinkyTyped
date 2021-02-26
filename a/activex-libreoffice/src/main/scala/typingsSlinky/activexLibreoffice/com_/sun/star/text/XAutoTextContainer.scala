package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * handles blocks of {@link AutoTextEntry} .
  * @see AutoTextContainer
  */
@js.native
trait XAutoTextContainer extends XNameAccess {
  
  /**
    * creates a new AutoText group.
    * @param aGroupName the name of the {@link AutoTextContainer}  The name must follow the pattern `groupname*pathid` , where:  `groupname` should contain on
    */
  def insertNewByName(aGroupName: String): XAutoTextGroup = js.native
  
  /**
    * deletes the specified AutoText group.
    * @param aGroupName see the documentation for {@link XAutoTextContainer.insertNewByName()}
    */
  def removeByName(aGroupName: String): Unit = js.native
}
object XAutoTextContainer {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: String => XAutoTextGroup,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XAutoTextContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XAutoTextContainer]
  }
  
  @scala.inline
  implicit class XAutoTextContainerMutableBuilder[Self <: XAutoTextContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertNewByName(value: String => XAutoTextGroup): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
  }
}
