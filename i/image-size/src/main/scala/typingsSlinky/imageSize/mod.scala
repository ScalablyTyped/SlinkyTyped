package typingsSlinky.imageSize

import typingsSlinky.imageSize.interfaceMod.ISizeCalculationResult
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("image-size", JSImport.Default)
  @js.native
  def default(input: String): ISizeCalculationResult = js.native
  @JSImport("image-size", JSImport.Default)
  @js.native
  def default(input: String, callback: CallbackFn): Unit = js.native
  @JSImport("image-size", JSImport.Default)
  @js.native
  def default(input: Buffer): ISizeCalculationResult = js.native
  
  @JSImport("image-size", "imageSize")
  @js.native
  def imageSize(input: String): ISizeCalculationResult = js.native
  @JSImport("image-size", "imageSize")
  @js.native
  def imageSize(input: String, callback: CallbackFn): Unit = js.native
  @JSImport("image-size", "imageSize")
  @js.native
  def imageSize(input: Buffer): ISizeCalculationResult = js.native
  
  @JSImport("image-size", "setConcurrency")
  @js.native
  def setConcurrency(c: Double): Unit = js.native
  
  @JSImport("image-size", "types")
  @js.native
  val types: js.Array[String] = js.native
  
  type CallbackFn = js.Function2[/* e */ js.Error | Null, /* r */ js.UndefOr[ISizeCalculationResult], Unit]
}
