package typingsSlinky.antd

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/_util/type", JSImport.Namespace)
@js.native
object typeMod extends js.Object {
  
  def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  
  def tupleNum[T /* <: js.Array[Double] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  
  type ElementOf[T] = js.Any
  
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
