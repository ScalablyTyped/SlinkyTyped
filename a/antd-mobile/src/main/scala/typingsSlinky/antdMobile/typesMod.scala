package typingsSlinky.antdMobile

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/_util/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}

