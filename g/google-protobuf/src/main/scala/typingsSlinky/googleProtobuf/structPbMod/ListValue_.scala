package typingsSlinky.googleProtobuf.structPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
class ListValue_ () extends Message {
  
  def addValues(): Value = js.native
  def addValues(value: js.UndefOr[scala.Nothing], index: Double): Value = js.native
  def addValues(value: Value): Value = js.native
  def addValues(value: Value, index: Double): Value = js.native
  
  def clearValuesList(): ListValue = js.native
  
  def getValuesList(): js.Array[Value] = js.native
  
  def setValuesList(value: js.Array[Value]): ListValue = js.native
  
  def toJavaScript(): js.Array[JavaScriptValue] = js.native
}
