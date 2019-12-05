package typingsSlinky.ono

import typingsSlinky.ono.esmTypesMod.ErrorPOJO
import typingsSlinky.std.Error
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/to-json", JSImport.Namespace)
@js.native
object esmToDashJsonMod extends js.Object {
  def getDeepKeys(obj: js.Object): Set[String | js.Symbol] = js.native
  def getDeepKeys(obj: js.Object, omit: js.Array[String | js.Symbol]): Set[String | js.Symbol] = js.native
  def toJSON(`this`: ErrorPOJO): ErrorPOJO = js.native
  def toJSON(`this`: Error): ErrorPOJO with js.Error = js.native
}

