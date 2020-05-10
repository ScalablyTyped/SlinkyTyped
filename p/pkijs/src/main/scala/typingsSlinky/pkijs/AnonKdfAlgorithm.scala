package typingsSlinky.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKdfAlgorithm extends js.Object {
  var kdfAlgorithm: js.UndefOr[String] = js.native
  var kekEncryptionLength: js.UndefOr[Double] = js.native
  var oaepHashAlgorithm: js.UndefOr[String] = js.native
}

object AnonKdfAlgorithm {
  @scala.inline
  def apply(): AnonKdfAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKdfAlgorithm]
  }
  @scala.inline
  implicit class AnonKdfAlgorithmOps[Self <: AnonKdfAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKdfAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdfAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKdfAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdfAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withKekEncryptionLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kekEncryptionLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKekEncryptionLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kekEncryptionLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOaepHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepHashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOaepHashAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepHashAlgorithm")(js.undefined)
        ret
    }
  }
  
}

