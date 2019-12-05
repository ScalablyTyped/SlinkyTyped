package typingsSlinky.jsDashNacl.jsDashNaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignKeyPair extends js.Object {
  var signPk: scala.scalajs.js.typedarray.Uint8Array
  var signSk: scala.scalajs.js.typedarray.Uint8Array
}

object SignKeyPair {
  @scala.inline
  def apply(signPk: scala.scalajs.js.typedarray.Uint8Array, signSk: scala.scalajs.js.typedarray.Uint8Array): SignKeyPair = {
    val __obj = js.Dynamic.literal(signPk = signPk.asInstanceOf[js.Any], signSk = signSk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignKeyPair]
  }
}

