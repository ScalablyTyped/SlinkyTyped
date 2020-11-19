package typingsSlinky.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object beans {
  
  /**
    * This exception is thrown to indicate the use of a type which is not appropriate.
    *
    * This problem can occur, if you use an `any` .
    * @see PropertyContainer
    */
  type IllegalTypeException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * A legacy (single-instance) service variant of {@link theIntrospection} singleton.
    * @deprecated DeprecatedUse theIntrospection instead.
    */
  type Introspection = typingsSlinky.activexLibreoffice.com_.sun.star.beans.XIntrospection
  
  /**
    * This exception is thrown when an exception happens during introspection.
    * @deprecated Deprecated  This exception isn't specified and used anywhere
    */
  type IntrospectionException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** This exception is thrown to indicate that removing a property from an {@link XPropertyContainer} is not allowed. */
  type NotRemoveableException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * This exception is thrown to indicate that a property with this name already exists in the object.
    * @see PropertyContainer
    */
  type PropertyExistException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * specifies a sequence of {@link PropertyValue} instances.
    *
    * Such sequences are especially useful for remote interfaces.
    */
  type PropertyValues = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue]
  
  /**
    * This exception is thrown when a proposed change to a property represents an unacceptable value.
    * @see XPropertySet
    */
  type PropertyVetoException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * This exception is thrown to indicate that the property name is unknown to the implementation.
    * @see XPropertySet
    */
  type UnknownPropertyException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * provides functionality to get information about an object's properties and methods.
    *
    * **Important note:** An object can only be inspected completely if it supports the {@link com.sun.star.lang.XTypeProvider} interface.
    *
    * For details, see method {@link XIntrospection.inspect()} .
    * @since LibreOffice 4.3
    */
  type theIntrospection = typingsSlinky.activexLibreoffice.com_.sun.star.beans.XIntrospection
}
