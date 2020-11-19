package typingsSlinky.jest.mod.jest

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mock_[T, Y /* <: js.Array[_] */]
  extends js.Function
     with MockInstance[T, Y]
     with Instantiable1[/* args */ Y, T] {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Y is not an array type */ args: Y
  ): T = js.native
}
