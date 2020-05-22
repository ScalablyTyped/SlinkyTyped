package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ECBlocks")
@js.native
class ECBlocks protected ()
  extends typingsSlinky.jsqrcode.ECBlocks {
  def this(ecCodewordsPerBlock: Double, ecBlocks1: typingsSlinky.jsqrcode.ECB) = this()
  def this(
    ecCodewordsPerBlock: Double,
    ecBlocks1: typingsSlinky.jsqrcode.ECB,
    ecBlocks2: typingsSlinky.jsqrcode.ECB
  ) = this()
  /* CompleteClass */
  override val ECCodewordsPerBlock: Double = js.native
  /* CompleteClass */
  override val NumBlocks: Double = js.native
  /* CompleteClass */
  override val TotalECCodewords: Double = js.native
  /* CompleteClass */
  override var ecBlocks: js.Array[typingsSlinky.jsqrcode.ECB] | (js.Tuple2[typingsSlinky.jsqrcode.ECB, typingsSlinky.jsqrcode.ECB]) = js.native
  /* CompleteClass */
  override var ecCodewordsPerBlock: Double = js.native
  /* CompleteClass */
  override def getECBlocks(): js.Array[typingsSlinky.jsqrcode.ECB] | (js.Tuple2[typingsSlinky.jsqrcode.ECB, typingsSlinky.jsqrcode.ECB]) = js.native
}

