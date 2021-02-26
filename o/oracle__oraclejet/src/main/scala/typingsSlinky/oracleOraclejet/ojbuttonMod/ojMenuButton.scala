package typingsSlinky.oracleOraclejet.ojbuttonMod

import org.scalajs.dom.raw.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojMenuButton extends ojButton[ojMenuButtonSettableProperties] {
  
  @JSName("onOjAction")
  var onOjAction_ojMenuButton: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: ojMenuButtonSettablePropertiesLenient): Unit = js.native
}
object ojMenuButton {
  
  type ojAction = CustomEvent
}
