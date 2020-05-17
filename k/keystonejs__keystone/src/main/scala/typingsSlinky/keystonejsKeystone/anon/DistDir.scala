package typingsSlinky.keystonejsKeystone.anon

import typingsSlinky.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistDir extends js.Object {
  var distDir: String = js.native
  var keystone: Keystone[String] = js.native
}

object DistDir {
  @scala.inline
  def apply(distDir: String, keystone: Keystone[String]): DistDir = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], keystone = keystone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistDir]
  }
  @scala.inline
  implicit class DistDirOps[Self <: DistDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystone(value: Keystone[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

