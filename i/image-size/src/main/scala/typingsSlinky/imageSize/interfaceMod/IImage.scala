package typingsSlinky.imageSize.interfaceMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImage extends js.Object {
  
  def calculate(buffer: Buffer): ISizeCalculationResult = js.native
  def calculate(buffer: Buffer, filepath: String): ISizeCalculationResult = js.native
  
  def validate(buffer: Buffer): Boolean = js.native
}
