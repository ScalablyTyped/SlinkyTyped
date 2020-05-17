package typingsSlinky.pkijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KdfAlgorithm extends js.Object {
  var kdfAlgorithm: js.UndefOr[String] = js.native
  var kekEncryptionLength: js.UndefOr[Double] = js.native
  var oaepHashAlgorithm: js.UndefOr[String] = js.native
}

object KdfAlgorithm {
  @scala.inline
  def apply(): KdfAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KdfAlgorithm]
  }
  @scala.inline
  implicit class KdfAlgorithmOps[Self <: KdfAlgorithm] (val x: Self) extends AnyVal {
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

