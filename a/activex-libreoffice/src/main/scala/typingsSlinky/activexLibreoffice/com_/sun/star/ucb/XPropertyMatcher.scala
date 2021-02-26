package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checks whether a set of properties matches a set of search criteria.
  * @see XPropertyMatcherFactory.
  */
@js.native
trait XPropertyMatcher extends XInterface {
  
  /**
    * Checks whether a set of properties matches the given search criteria.
    * @param Properties A {@link Command} Processor through which the set of properties is accessible.
    * @param Environment The environment to use when accessing the property set via the given {@link Command} Processor. It may be null.
    * @returns `TRUE` if the properties match, `FALSE` otherwise.
    */
  def matches(Properties: XCommandProcessor, Environment: XCommandEnvironment): Boolean = js.native
}
object XPropertyMatcher {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    matches: (XCommandProcessor, XCommandEnvironment) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyMatcher = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), matches = js.Any.fromFunction2(matches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyMatcher]
  }
  
  @scala.inline
  implicit class XPropertyMatcherMutableBuilder[Self <: XPropertyMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: (XCommandProcessor, XCommandEnvironment) => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
  }
}
