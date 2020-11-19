package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojCombobox_[V, SP /* <: ojComboboxSettableProperties[V, SV, RV] */, SV, RV] extends editableValue[V, SP, SV, RV] {
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCombobox_ : (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCombobox_ : (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: ojComboboxSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  
  def validate(): js.Promise[_] = js.native
}
