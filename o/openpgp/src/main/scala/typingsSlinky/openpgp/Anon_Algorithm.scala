package typingsSlinky.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: String
  var data: scala.scalajs.js.typedarray.Uint8Array
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: String, data: scala.scalajs.js.typedarray.Uint8Array): Anon_Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

