package typingsSlinky.arangodb

import typingsSlinky.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlgorithm extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.native
  var secret: js.UndefOr[String] = js.native
}

object AnonAlgorithm {
  @scala.inline
  def apply(): AnonAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlgorithm]
  }
  @scala.inline
  implicit class AnonAlgorithmOps[Self <: AnonAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: HashAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
  }
  
}

