package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Uik
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XComponentRegistry extends XInterface {
  
  /** @deprecated Deprecated */
  def createObject(URL: String, Uik: Uik): XInterface = js.native
}
object XComponentRegistry {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createObject: (String, Uik) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction2(createObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentRegistry]
  }
  
  @scala.inline
  implicit class XComponentRegistryMutableBuilder[Self <: XComponentRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateObject(value: (String, Uik) => XInterface): Self = StObject.set(x, "createObject", js.Any.fromFunction2(value))
  }
}
