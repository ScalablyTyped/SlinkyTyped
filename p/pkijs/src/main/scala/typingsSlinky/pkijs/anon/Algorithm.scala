package typingsSlinky.pkijs.anon

import org.scalajs.dom.crypto.KeyUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  var algorithm: org.scalajs.dom.crypto.Algorithm = js.native
  var usages: js.Array[KeyUsage] = js.native
}

object Algorithm {
  @scala.inline
  def apply(algorithm: org.scalajs.dom.crypto.Algorithm, usages: js.Array[KeyUsage]): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsagesVarargs(value: KeyUsage*): Self = this.set("usages", js.Array(value :_*))
    @scala.inline
    def setUsages(value: js.Array[KeyUsage]): Self = this.set("usages", value.asInstanceOf[js.Any])
  }
  
}

