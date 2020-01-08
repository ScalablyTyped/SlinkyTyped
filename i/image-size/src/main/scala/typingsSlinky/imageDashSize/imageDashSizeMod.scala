package typingsSlinky.imageDashSize

import typingsSlinky.imageDashSize.distTypesInterfaceMod.ISizeCalculationResult
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-size", JSImport.Namespace)
@js.native
object imageDashSizeMod extends js.Object {
  val types: js.Array[String] = js.native
  def imageSize(input: String): ISizeCalculationResult = js.native
  def imageSize(input: String, callback: CallbackFn): Unit = js.native
  def imageSize(input: Buffer): ISizeCalculationResult = js.native
  def setConcurrency(c: Double): Unit = js.native
  type CallbackFn = js.Function2[/* e */ js.Error | Null, /* r */ js.UndefOr[ISizeCalculationResult], Unit]
}

