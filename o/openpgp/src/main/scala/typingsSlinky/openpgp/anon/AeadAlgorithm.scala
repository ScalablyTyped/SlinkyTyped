package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AeadAlgorithm extends js.Object {
  var aeadAlgorithm: String = js.native
  var algorithm: String = js.native
  var data: js.typedarray.Uint8Array = js.native
}

object AeadAlgorithm {
  @scala.inline
  def apply(aeadAlgorithm: String, algorithm: String, data: js.typedarray.Uint8Array): AeadAlgorithm = {
    val __obj = js.Dynamic.literal(aeadAlgorithm = aeadAlgorithm.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AeadAlgorithm]
  }
  @scala.inline
  implicit class AeadAlgorithmOps[Self <: AeadAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAeadAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aeadAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

