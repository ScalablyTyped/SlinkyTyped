package typingsSlinky.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: String
  var data: scala.scalajs.js.typedarray.Uint8Array
}

object AnonAlgorithm {
  @scala.inline
  def apply(algorithm: String, data: scala.scalajs.js.typedarray.Uint8Array): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

