package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows creating instances of the {@link DataAccessDescriptor} service.
  *
  * Data access descriptors are finally only bags of properties with a defined semantics. Depending on the context in which you use them, certain of their
  * properties are needed or unneeded. ;  The descriptor factory allows you to create instances which offer all properties potentially needed at a
  * descriptor.
  */
@js.native
trait XDataAccessDescriptorFactory extends StObject {
  
  /** creates a {@link DataAccessDescriptor} which supports all properties defined for this service, even if they're normally optional only. */
  def createDataAccessDescriptor(): XPropertySet = js.native
}
object XDataAccessDescriptorFactory {
  
  @scala.inline
  def apply(createDataAccessDescriptor: () => XPropertySet): XDataAccessDescriptorFactory = {
    val __obj = js.Dynamic.literal(createDataAccessDescriptor = js.Any.fromFunction0(createDataAccessDescriptor))
    __obj.asInstanceOf[XDataAccessDescriptorFactory]
  }
  
  @scala.inline
  implicit class XDataAccessDescriptorFactoryMutableBuilder[Self <: XDataAccessDescriptorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDataAccessDescriptor(value: () => XPropertySet): Self = StObject.set(x, "createDataAccessDescriptor", js.Any.fromFunction0(value))
  }
}
