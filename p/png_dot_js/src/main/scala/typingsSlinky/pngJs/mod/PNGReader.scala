package typingsSlinky.pngJs.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGReader extends js.Object {
  var bytes: scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | Buffer = js.native
  var dataChunks: js.Array[js.Array[Double]] = js.native
  var i: Double = js.native
  var png: PNG = js.native
  def parse(callback: ParseCallback): Unit = js.native
  def parse(options: ParseOptions, callback: ParseCallback): Unit = js.native
}

