package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DataBlock")
@js.native
class DataBlock protected ()
  extends typingsSlinky.jsqrcode.DataBlock {
  def this(numDataCodewords: Double, codewords: js.Array[Double]) = this()
}
/* static members */
@JSGlobal("DataBlock")
@js.native
object DataBlock extends js.Object {
  
  def getDataBlocks(
    rawCodewords: js.Array[Double],
    version: typingsSlinky.jsqrcode.Version,
    ecLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel
  ): js.Array[typingsSlinky.jsqrcode.DataBlock] = js.native
}
