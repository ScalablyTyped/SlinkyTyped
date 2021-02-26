package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a parameter of an interface method or a service constructor.
  *
  * This type supersedes {@link XMethodParameter} , which only supports parameters of interface methods (which cannot have rest parameters).
  * @since OOo 2.0
  */
@js.native
trait XParameter extends XMethodParameter {
  
  /**
    * Returns whether this is a rest parameter.
    *
    * A rest parameter must always come last in a parameter list.
    *
    * Currently, only service constructors can have rest parameters, and those rest parameters must be in parameters of type `any` .
    * @returns `TRUE` if and only if this parameter is a rest parameter
    */
  def isRestParameter(): Boolean = js.native
}
object XParameter {
  
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
    isRestParameter: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getType = js.Any.fromFunction0(getType), isIn = js.Any.fromFunction0(isIn), isOut = js.Any.fromFunction0(isOut), isRestParameter = js.Any.fromFunction0(isRestParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XParameter]
  }
  
  @scala.inline
  implicit class XParameterMutableBuilder[Self <: XParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRestParameter(value: () => Boolean): Self = StObject.set(x, "isRestParameter", js.Any.fromFunction0(value))
  }
}
