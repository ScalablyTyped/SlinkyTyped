package typingsSlinky.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextEncoder instance.
  */
@js.native
trait TextEncoderClass extends js.Object {
  var encoding: String = js.native
  def encode(string: String): js.typedarray.Uint8Array = js.native
  def encode(string: String, options: TextEncodingOptions): js.typedarray.Uint8Array = js.native
}

