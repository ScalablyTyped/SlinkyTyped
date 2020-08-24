package typingsSlinky.jsdevtoolsOno

import typingsSlinky.jsdevtoolsOno.typesMod.ErrorPOJO
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/ono/esm/to-json", JSImport.Namespace)
@js.native
object toJsonMod extends js.Object {
  def getDeepKeys(obj: js.Object): Set[String | js.Symbol] = js.native
  def getDeepKeys(obj: js.Object, omit: js.Array[String | js.Symbol]): Set[String | js.Symbol] = js.native
  def toJSON(): ErrorPOJO = js.native
  @JSName("toJSON")
  def toJSON_Intersection(): ErrorPOJO with js.Error = js.native
}

