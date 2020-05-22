package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DetectorResult")
@js.native
class DetectorResult protected ()
  extends typingsSlinky.jsqrcode.DetectorResult {
  def this(
    bits: typingsSlinky.jsqrcode.BitMatrix,
    points: js.Tuple3[
        typingsSlinky.jsqrcode.DetectorResult, 
        typingsSlinky.jsqrcode.DetectorResult, 
        typingsSlinky.jsqrcode.DetectorResult
      ]
  ) = this()
  def this(
    bits: typingsSlinky.jsqrcode.BitMatrix,
    points: js.Tuple4[
        typingsSlinky.jsqrcode.DetectorResult, 
        typingsSlinky.jsqrcode.DetectorResult, 
        typingsSlinky.jsqrcode.DetectorResult, 
        typingsSlinky.jsqrcode.DetectorResult
      ]
  ) = this()
  /* CompleteClass */
  override var bits: typingsSlinky.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override var points: (js.Tuple3[
    typingsSlinky.jsqrcode.DetectorResult, 
    typingsSlinky.jsqrcode.DetectorResult, 
    typingsSlinky.jsqrcode.DetectorResult
  ]) | (js.Tuple4[
    typingsSlinky.jsqrcode.DetectorResult, 
    typingsSlinky.jsqrcode.DetectorResult, 
    typingsSlinky.jsqrcode.DetectorResult, 
    typingsSlinky.jsqrcode.DetectorResult
  ]) = js.native
}

