package typingsSlinky.imageQ.mod

import typingsSlinky.imageQ.anon.A
import typingsSlinky.imageQ.anon.B
import typingsSlinky.imageQ.anon.H
import typingsSlinky.imageQ.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q", "conversion")
@js.native
object conversion extends js.Object {
  def lab2rgb(L: Double, a: Double, b: Double): B = js.native
  def lab2xyz(L: Double, a: Double, b: Double): X = js.native
  def rgb2hsl(r: Double, g: Double, b: Double): H = js.native
  def rgb2lab(r: Double, g: Double, b: Double): A = js.native
  def rgb2xyz(r: Double, g: Double, b: Double): X = js.native
  def xyz2lab(x: Double, y: Double, z: Double): A = js.native
  def xyz2rgb(x: Double, y: Double, z: Double): B = js.native
}

