package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GridSampler")
@js.native
object GridSampler extends js.Object {
  def checkAndNudgePoints(image: js.typedarray.Uint8Array, points: js.Array[Double]): Unit = js.native
  def sampleGrid3(
    image: js.typedarray.Uint8Array,
    dimension: Double,
    transform: typingsSlinky.jsqrcode.PerspectiveTransform
  ): typingsSlinky.jsqrcode.BitMatrix = js.native
  def sampleGridx(
    image: js.typedarray.Uint8Array,
    dimension: Double,
    p1ToX: Double,
    p1ToY: Double,
    p2ToX: Double,
    p2ToY: Double,
    p3ToX: Double,
    p3ToY: Double,
    p4ToX: Double,
    p4ToY: Double,
    p1FromX: Double,
    p1FromY: Double,
    p2FromX: Double,
    p2FromY: Double,
    p3FromX: Double,
    p3FromY: Double,
    p4FromX: Double,
    p4FromY: Double
  ): typingsSlinky.jsqrcode.BitMatrix = js.native
}

