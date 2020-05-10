package typingsSlinky.readPkgUp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedReadResult extends js.Object {
  var packageJson: NormalizedPackageJson = js.native
  var path: String = js.native
}

object NormalizedReadResult {
  @scala.inline
  def apply(packageJson: NormalizedPackageJson, path: String): NormalizedReadResult = {
    val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedReadResult]
  }
  @scala.inline
  implicit class NormalizedReadResultOps[Self <: NormalizedReadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackageJson(value: NormalizedPackageJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

