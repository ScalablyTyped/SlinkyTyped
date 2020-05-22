package typingsSlinky.pkijs.anon

import org.scalajs.dom.crypto.KeyUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  var algorithm: org.scalajs.dom.crypto.Algorithm
  var usages: js.Array[KeyUsage]
}

object Algorithm {
  @scala.inline
  def apply(algorithm: org.scalajs.dom.crypto.Algorithm, usages: js.Array[KeyUsage]): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

