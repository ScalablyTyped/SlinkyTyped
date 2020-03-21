package typingsSlinky.contractProxyKit

import typingsSlinky.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbase64 extends js.Object {
  def decode(textData: String): scala.scalajs.js.typedarray.Uint8Array
  def encode(data: Arrayish): String
}

object Typeofbase64 {
  @scala.inline
  def apply(decode: String => scala.scalajs.js.typedarray.Uint8Array, encode: Arrayish => String): Typeofbase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Typeofbase64]
  }
}

