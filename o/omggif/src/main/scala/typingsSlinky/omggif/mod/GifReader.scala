package typingsSlinky.omggif.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("omggif", "GifReader")
@js.native
class GifReader protected () extends js.Object {
  def this(buf: Buffer) = this()
  
  def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
  def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.typedarray.Uint8Array): Unit = js.native
  def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.typedarray.Uint8ClampedArray): Unit = js.native
  
  def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
  def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.typedarray.Uint8Array): Unit = js.native
  def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.typedarray.Uint8ClampedArray): Unit = js.native
  
  def frameInfo(frame_num: Double): Frame = js.native
  
  var height: Double = js.native
  
  def loopCount(): Double = js.native
  
  def numFrames(): Double = js.native
  
  var width: Double = js.native
}
