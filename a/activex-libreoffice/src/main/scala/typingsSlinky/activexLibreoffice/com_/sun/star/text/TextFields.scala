package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a collection of {@link TextField} instances. */
@js.native
trait TextFields
  extends XEnumerationAccess
     with XRefreshable
object TextFields {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit
  ): TextFields = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
    __obj.asInstanceOf[TextFields]
  }
}
