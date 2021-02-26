package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XVbaMethodParameter extends XInterface {
  
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: String): js.Any = js.native
  
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: String, Value: js.Any): Unit = js.native
}
object XVbaMethodParameter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getVbaMethodParameter: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setVbaMethodParameter: (String, js.Any) => Unit
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getVbaMethodParameter = js.Any.fromFunction1(getVbaMethodParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVbaMethodParameter = js.Any.fromFunction2(setVbaMethodParameter))
    __obj.asInstanceOf[XVbaMethodParameter]
  }
  
  @scala.inline
  implicit class XVbaMethodParameterMutableBuilder[Self <: XVbaMethodParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVbaMethodParameter(value: String => js.Any): Self = StObject.set(x, "getVbaMethodParameter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVbaMethodParameter(value: (String, js.Any) => Unit): Self = StObject.set(x, "setVbaMethodParameter", js.Any.fromFunction2(value))
  }
}
