package typingsSlinky.packageJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integrity extends js.Object {
  val integrity: js.UndefOr[String] = js.native
  val shasum: String = js.native
  val tarball: String = js.native
}

object Integrity {
  @scala.inline
  def apply(shasum: String, tarball: String): Integrity = {
    val __obj = js.Dynamic.literal(shasum = shasum.asInstanceOf[js.Any], tarball = tarball.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrity]
  }
  @scala.inline
  implicit class IntegrityOps[Self <: Integrity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShasum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shasum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarball(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarball")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
  }
  
}

