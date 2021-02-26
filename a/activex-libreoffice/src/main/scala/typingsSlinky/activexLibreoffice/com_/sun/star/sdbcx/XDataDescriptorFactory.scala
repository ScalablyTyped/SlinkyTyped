package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the creation of a descriptor for a definition object. */
@js.native
trait XDataDescriptorFactory extends XInterface {
  
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): XPropertySet = js.native
}
object XDataDescriptorFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDataDescriptor: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
  
  @scala.inline
  implicit class XDataDescriptorFactoryMutableBuilder[Self <: XDataDescriptorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDataDescriptor(value: () => XPropertySet): Self = StObject.set(x, "createDataDescriptor", js.Any.fromFunction0(value))
  }
}
