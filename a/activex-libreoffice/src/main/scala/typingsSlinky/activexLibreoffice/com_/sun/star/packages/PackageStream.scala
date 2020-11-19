package typingsSlinky.activexLibreoffice.com_.sun.star.packages

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service represents a stream contained within a {@link Package} . Instances of this class can only be constructed by the implementation of the
  * {@link Package} service.
  */
@js.native
trait PackageStream
  extends XNamed
     with XChild
     with XActiveDataSink
     with XPropertySet
object PackageStream {
  
  @scala.inline
  def apply(
    InputStream: XInputStream,
    Name: String,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getInputStream: () => XInputStream,
    getName: () => String,
    getParent: () => XInterface,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setInputStream: XInputStream => Unit,
    setName: String => Unit,
    setParent: XInterface => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): PackageStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getInputStream = js.Any.fromFunction0(getInputStream), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setInputStream = js.Any.fromFunction1(setInputStream), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[PackageStream]
  }
}
