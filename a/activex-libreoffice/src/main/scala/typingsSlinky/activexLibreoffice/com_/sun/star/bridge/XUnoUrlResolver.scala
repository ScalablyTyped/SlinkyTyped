package typingsSlinky.activexLibreoffice.com_.sun.star.bridge

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to resolve an object using the uno-url. */
@js.native
trait XUnoUrlResolver extends XInterface {
  
  /**
    * resolves an object using the given uno-url.
    * @param sUnoUrl the uno-url. The uno-url is specified [here]{@link url="http://udk.openoffice.org/common/man/spec/uno-url.html"} .
    * @returns the resolved object, in general a proxy for a remote object. You can use it the same way as you use local references.
    */
  def resolve(sUnoUrl: String): XInterface = js.native
}
object XUnoUrlResolver {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolve: String => XInterface
  ): XUnoUrlResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[XUnoUrlResolver]
  }
  
  @scala.inline
  implicit class XUnoUrlResolverMutableBuilder[Self <: XUnoUrlResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolve(value: String => XInterface): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
