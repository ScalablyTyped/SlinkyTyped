package typingsSlinky.jsDashNacl.jsDashNaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSharedSecret extends js.Object {
  var boxK: scala.scalajs.js.typedarray.Uint8Array
}

object BoxSharedSecret {
  @scala.inline
  def apply(boxK: scala.scalajs.js.typedarray.Uint8Array): BoxSharedSecret = {
    val __obj = js.Dynamic.literal(boxK = boxK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoxSharedSecret]
  }
}

