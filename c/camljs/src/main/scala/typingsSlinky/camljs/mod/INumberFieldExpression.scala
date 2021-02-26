package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumberFieldExpression extends StObject {
  
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Double): IExpression = js.native
  
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: Double): IExpression = js.native
  
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: Double): IExpression = js.native
  
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[Double]): IExpression = js.native
  
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: Double): IExpression = js.native
  
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: Double): IExpression = js.native
  
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Double): IExpression = js.native
}
object INumberFieldExpression {
  
  @scala.inline
  def apply(
    EqualTo: Double => IExpression,
    GreaterThan: Double => IExpression,
    GreaterThanOrEqualTo: Double => IExpression,
    In: js.Array[Double] => IExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    LessThan: Double => IExpression,
    LessThanOrEqualTo: Double => IExpression,
    NotEqualTo: Double => IExpression
  ): INumberFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), GreaterThan = js.Any.fromFunction1(GreaterThan), GreaterThanOrEqualTo = js.Any.fromFunction1(GreaterThanOrEqualTo), In = js.Any.fromFunction1(In), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), LessThan = js.Any.fromFunction1(LessThan), LessThanOrEqualTo = js.Any.fromFunction1(LessThanOrEqualTo), NotEqualTo = js.Any.fromFunction1(NotEqualTo))
    __obj.asInstanceOf[INumberFieldExpression]
  }
  
  @scala.inline
  implicit class INumberFieldExpressionMutableBuilder[Self <: INumberFieldExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqualTo(value: Double => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGreaterThan(value: Double => IExpression): Self = StObject.set(x, "GreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGreaterThanOrEqualTo(value: Double => IExpression): Self = StObject.set(x, "GreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn(value: js.Array[Double] => IExpression): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNotNull(value: () => IExpression): Self = StObject.set(x, "IsNotNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNull(value: () => IExpression): Self = StObject.set(x, "IsNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLessThan(value: Double => IExpression): Self = StObject.set(x, "LessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLessThanOrEqualTo(value: Double => IExpression): Self = StObject.set(x, "LessThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotEqualTo(value: Double => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
  }
}
