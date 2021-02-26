package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateTimeFieldExpression extends StObject {
  
  /** Checks whether the value of the field is equal to the specified value.
    The datetime value should be defined in ISO 8601 format! */
  def EqualTo(value: String): IExpression = js.native
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: js.Date): IExpression = js.native
  
  /** Checks whether the value of the field is greater than the specified value.
    The datetime value should be defined in ISO 8601 format! */
  def GreaterThan(value: String): IExpression = js.native
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: js.Date): IExpression = js.native
  
  /** Checks whether the value of the field is greater than or equal to the specified value.
    The datetime value should be defined in ISO 8601 format! */
  def GreaterThanOrEqualTo(value: String): IExpression = js.native
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: js.Date): IExpression = js.native
  
  /** Checks whether the value of the field is equal to one of the specified values */
  /** Checks whether the value of the field is equal to one of the specified values.
    The datetime value should be defined in ISO 8601 format! */
  def In(arrayOfValues: js.Array[js.Date | String]): IExpression = js.native
  
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  
  /** Checks whether the value of the field is less than the specified value.
    The datetime value should be defined in ISO 8601 format! */
  def LessThan(value: String): IExpression = js.native
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: js.Date): IExpression = js.native
  
  /** Checks whether the value of the field is less than or equal to the specified value.
    The datetime value should be defined in ISO 8601 format! */
  def LessThanOrEqualTo(value: String): IExpression = js.native
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: js.Date): IExpression = js.native
  
  /** Checks whether the value of the field is not equal to the specified value.
    The datetime value should be defined in ISO 8601 format! */
  def NotEqualTo(value: String): IExpression = js.native
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: js.Date): IExpression = js.native
}
