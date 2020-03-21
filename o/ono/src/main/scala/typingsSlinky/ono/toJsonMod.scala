package typingsSlinky.ono

import typingsSlinky.ono.typesMod.ErrorPOJO
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/to-json", JSImport.Namespace)
@js.native
object toJsonMod extends js.Object {
  def getDeepKeys(obj: js.Object): Set[String | js.Symbol] = js.native
  def getDeepKeys(obj: js.Object, omit: js.Array[String | js.Symbol]): Set[String | js.Symbol] = js.native
  def toJSON(): ErrorPOJO with js.Error = js.native
  @JSName("toJSON")
  def toJSON_ErrorPOJO(): ErrorPOJO = js.native
}

