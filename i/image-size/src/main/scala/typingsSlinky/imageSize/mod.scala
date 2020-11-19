package typingsSlinky.imageSize

import typingsSlinky.imageSize.interfaceMod.ISizeCalculationResult
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-size", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def imageSize(input: String): ISizeCalculationResult = js.native
  def imageSize(input: String, callback: CallbackFn): Unit = js.native
  def imageSize(input: Buffer): ISizeCalculationResult = js.native
  
  def setConcurrency(c: Double): Unit = js.native
  
  val types: js.Array[String] = js.native
  
  type CallbackFn = js.Function2[/* e */ js.Error | Null, /* r */ js.UndefOr[ISizeCalculationResult], Unit]
}
