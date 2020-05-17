package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  var algorithm: String = js.native
  var digest: String = js.native
}

object Algorithm {
  @scala.inline
  def apply(algorithm: String, digest: String): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

