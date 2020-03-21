package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelect_[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV] extends editableValue[V, SP, SV, V] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelect_ : (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelect_ : (js.Function1[CustomEvent, _]) | Null = js.native
  def setProperties(properties: ojSelectSettablePropertiesLenient[V, SV]): Unit = js.native
  def validate(): js.Promise[_] = js.native
}

