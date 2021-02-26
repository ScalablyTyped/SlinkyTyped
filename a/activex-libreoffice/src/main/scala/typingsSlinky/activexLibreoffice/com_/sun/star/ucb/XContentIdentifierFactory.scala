package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory for content identifiers.
  * @author Kai Sommerfeld
  * @see XContentIdentifier
  * @version 1.0
  */
@js.native
trait XContentIdentifierFactory extends XInterface {
  
  /**
    * creates an identifier.
    * @param ContentId the content identifier string.
    * @returns the identifier.
    */
  def createContentIdentifier(ContentId: String): XContentIdentifier = js.native
}
object XContentIdentifierFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createContentIdentifier: String => XContentIdentifier,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentIdentifierFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentIdentifierFactory]
  }
  
  @scala.inline
  implicit class XContentIdentifierFactoryMutableBuilder[Self <: XContentIdentifierFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateContentIdentifier(value: String => XContentIdentifier): Self = StObject.set(x, "createContentIdentifier", js.Any.fromFunction1(value))
  }
}
