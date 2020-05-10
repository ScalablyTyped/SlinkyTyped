package typingsSlinky.googleCloudKms.mod.v1

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digest extends js.Object {
  var sha256: js.UndefOr[Buffer] = js.native
  var sha384: js.UndefOr[Buffer] = js.native
  var sha512: js.UndefOr[Buffer] = js.native
}

object Digest {
  @scala.inline
  def apply(): Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digest]
  }
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256(value: Buffer): Self = {
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
    def withSha384(value: Buffer): Self = {
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
    def withSha512(value: Buffer): Self = {
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

