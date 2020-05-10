package typingsSlinky.antDesignCompatible

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/compatible/lib/_util/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}

