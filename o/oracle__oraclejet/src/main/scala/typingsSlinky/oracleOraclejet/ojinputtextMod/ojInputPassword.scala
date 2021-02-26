package typingsSlinky.oracleOraclejet.ojinputtextMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputPassword extends inputBase[String | Null, ojInputPasswordSettableProperties, String | Null, String | Null] {
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputPassword: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputPassword: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: ojInputPasswordSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: String): Unit = js.native
}
object ojInputPassword {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
