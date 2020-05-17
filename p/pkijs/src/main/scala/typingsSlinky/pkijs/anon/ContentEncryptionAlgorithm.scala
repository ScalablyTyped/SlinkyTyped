package typingsSlinky.pkijs.anon

import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentEncryptionAlgorithm extends js.Object {
  var contentEncryptionAlgorithm: org.scalajs.dom.crypto.Algorithm = js.native
  var contentToEncrypt: BufferSource = js.native
  var hmacHashAlgorithm: String = js.native
  var iterationCount: Double = js.native
  var password: String = js.native
}

object ContentEncryptionAlgorithm {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: org.scalajs.dom.crypto.Algorithm,
    contentToEncrypt: BufferSource,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: String
  ): ContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncryptionAlgorithm]
  }
  @scala.inline
  implicit class ContentEncryptionAlgorithmOps[Self <: ContentEncryptionAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentEncryptionAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentToEncryptArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentToEncrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentToEncryptArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentToEncrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentToEncrypt(value: BufferSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentToEncrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHmacHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmacHashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

