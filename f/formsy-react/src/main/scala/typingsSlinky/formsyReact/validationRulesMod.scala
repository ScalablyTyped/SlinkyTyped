package typingsSlinky.formsyReact

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.formsyReact.interfacesMod.ValidationFunction
import typingsSlinky.formsyReact.interfacesMod.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react/dist/validationRules", JSImport.Namespace)
@js.native
object validationRulesMod extends js.Object {
  val default: Validations[js.Any] = js.native
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = js.native
  def isDefaultRequiredValue(value: js.Any): Boolean = js.native
  def isEmpty[V](value: V): Boolean = js.native
  def isExisty[V](value: V): Boolean = js.native
  def matchRegexp[V](_values: Values, value: V, regexp: js.RegExp): Boolean = js.native
  type Validations[V] = StringDictionary[ValidationFunction[V]]
}

