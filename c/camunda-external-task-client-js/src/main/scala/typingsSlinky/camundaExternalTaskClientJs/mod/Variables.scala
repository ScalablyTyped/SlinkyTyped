package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camunda-external-task-client-js", "Variables")
@js.native
class Variables () extends js.Object {
  
  def get(variableName: String): Value = js.native
  
  def getAll(): ValueMap = js.native
  
  def getAllTyped(): TypedValueMap = js.native
  
  def getTyped(variableName: String): TypedValue = js.native
  
  def set(variableName: String, value: Value): Variables = js.native
  
  def setAll(values: ValueMap): Variables = js.native
  
  def setAllTyped(typedValues: TypedValueMap): Variables = js.native
  
  def setTyped(variableName: String, typedValue: TypedValue): Variables = js.native
}
