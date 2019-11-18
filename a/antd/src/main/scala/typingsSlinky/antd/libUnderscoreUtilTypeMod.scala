package typingsSlinky.antd

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/type", JSImport.Namespace)
@js.native
object libUnderscoreUtilTypeMod extends js.Object {
  def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  def tupleNum[T /* <: js.Array[Double] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}

