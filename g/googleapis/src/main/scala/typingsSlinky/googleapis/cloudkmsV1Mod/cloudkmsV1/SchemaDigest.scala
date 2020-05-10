package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Digest holds a cryptographic message digest.
  */
@js.native
trait SchemaDigest extends js.Object {
  /**
    * A message digest produced with the SHA-256 algorithm.
    */
  var sha256: js.UndefOr[String] = js.native
  /**
    * A message digest produced with the SHA-384 algorithm.
    */
  var sha384: js.UndefOr[String] = js.native
  /**
    * A message digest produced with the SHA-512 algorithm.
    */
  var sha512: js.UndefOr[String] = js.native
}

object SchemaDigest {
  @scala.inline
  def apply(): SchemaDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDigest]
  }
  @scala.inline
  implicit class SchemaDigestOps[Self <: SchemaDigest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
        ret
    }
    @scala.inline
    def withSha384(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha384: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha384")(js.undefined)
        ret
    }
    @scala.inline
    def withSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha512: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(js.undefined)
        ret
    }
  }
  
}

