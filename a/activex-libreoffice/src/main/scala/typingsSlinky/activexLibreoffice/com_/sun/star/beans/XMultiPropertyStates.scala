package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to query information about the state of one or more properties.
  *
  * The state of a property contains information about the source of the value, e.g. the object itself, a default or a stylesheet. For more information
  * see PropertyState.
  */
@js.native
trait XMultiPropertyStates extends XInterface {
  
  /**
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns the default values of the propertes with the specified names.  If no default exists, is not known, or is void, then the return type at the corres
    * @throws UnknownPropertyException if one of the propertes does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefaults(aPropertyNames: SeqEquiv[String]): SafeArray[_] = js.native
  
  /**
    * @param aPropertyName specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    */
  def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState] = js.native
  
  /**
    * sets all properties to their default values.
    *
    * Each value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired.
    * If it is a constrained property, you must fire the vetoable event before you change the property value.
    */
  def setAllPropertiesToDefault(): Unit = js.native
  
  /**
    * sets the specified properties to their default values.
    *
    * Each value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired.
    * If it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @throws UnknownPropertyException if one of the properties does not exist.
    */
  def setPropertiesToDefault(aPropertyNames: SeqEquiv[String]): Unit = js.native
}
object XMultiPropertyStates {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit
  ): XMultiPropertyStates = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertyStates = js.Any.fromFunction1(getPropertyStates), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault))
    __obj.asInstanceOf[XMultiPropertyStates]
  }
  
  @scala.inline
  implicit class XMultiPropertyStatesMutableBuilder[Self <: XMultiPropertyStates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPropertyDefaults(value: SeqEquiv[String] => SafeArray[_]): Self = StObject.set(x, "getPropertyDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllPropertiesToDefault(value: () => Unit): Self = StObject.set(x, "setAllPropertiesToDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPropertiesToDefault(value: SeqEquiv[String] => Unit): Self = StObject.set(x, "setPropertiesToDefault", js.Any.fromFunction1(value))
  }
}
