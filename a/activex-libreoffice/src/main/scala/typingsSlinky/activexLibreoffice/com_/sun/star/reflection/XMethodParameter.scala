package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a method parameter.
  *
  * This type is superseded by {@link XParameter} , which supports parameters of service constructors as well as parameters of interface methods.
  * @see XInterfaceMethodTypeDescription
  */
@js.native
trait XMethodParameter extends XInterface {
  
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  val Name: String = js.native
  
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  val Position: Double = js.native
  
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  val Type: XTypeDescription = js.native
  
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  def getName(): String = js.native
  
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  def getPosition(): Double = js.native
  
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  def getType(): XTypeDescription = js.native
  
  /**
    * Returns true, if the parameter is declared as [in] or [inout] in IDL.
    * @returns true, if declared [in] or [inout] parameter
    */
  def isIn(): Boolean = js.native
  
  /**
    * Returns true, if the parameter is declared as [out] or [inout] in IDL.
    * @returns true, if declared [out] or [inout] parameter
    */
  def isOut(): Boolean = js.native
}
object XMethodParameter {
  
  @scala.inline
  def apply(
    Name: String,
    Position: Double,
    Type: XTypeDescription,
    acquire: () => Unit,
    getName: () => String,
    getPosition: () => Double,
    getType: () => XTypeDescription,
    isIn: () => Boolean,
    isOut: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMethodParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getType = js.Any.fromFunction0(getType), isIn = js.Any.fromFunction0(isIn), isOut = js.Any.fromFunction0(isOut), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMethodParameter]
  }
  
  @scala.inline
  implicit class XMethodParameterMutableBuilder[Self <: XMethodParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => XTypeDescription): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIn(value: () => Boolean): Self = StObject.set(x, "isIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOut(value: () => Boolean): Self = StObject.set(x, "isOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XTypeDescription): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
