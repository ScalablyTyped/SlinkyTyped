package typingsSlinky.atOracleOraclejet.ojbuttonMod

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenuButton extends ojButton[ojMenuButtonSettableProperties] {
  @JSName("onOjAction")
  var onOjAction_ojMenuButton: (js.Function1[CustomEvent, _]) | Null = js.native
  def setProperties(properties: ojMenuButtonSettablePropertiesLenient): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojbutton", "ojMenuButton")
@js.native
object ojMenuButton extends js.Object {
  type ojAction = CustomEvent
}

