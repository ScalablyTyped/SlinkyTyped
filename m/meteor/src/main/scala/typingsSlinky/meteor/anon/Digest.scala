package typingsSlinky.meteor.anon

import typingsSlinky.meteor.meteorStrings.`sha-256`
import typingsSlinky.meteor.mod.Accounts.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digest
  extends Password
     with typingsSlinky.meteor.Accounts.Password {
  var algorithm: `sha-256` = js.native
  var digest: String = js.native
}

object Digest {
  @scala.inline
  def apply(algorithm: `sha-256`, digest: String): Digest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: `sha-256`): Self = {
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

