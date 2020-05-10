package typingsSlinky.depcheck

import typingsSlinky.depcheck.mod.PackageDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDependencies extends js.Object {
  var dependencies: js.UndefOr[PackageDependencies] = js.native
  var devDependencies: js.UndefOr[PackageDependencies] = js.native
  var optionalDependencies: js.UndefOr[PackageDependencies] = js.native
  var peerDependencies: js.UndefOr[PackageDependencies] = js.native
}

object AnonDependencies {
  @scala.inline
  def apply(): AnonDependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDependencies]
  }
  @scala.inline
  implicit class AnonDependenciesOps[Self <: AnonDependencies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: PackageDependencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDevDependencies(value: PackageDependencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalDependencies(value: PackageDependencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerDependencies(value: PackageDependencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerDependencies")(js.undefined)
        ret
    }
  }
  
}

