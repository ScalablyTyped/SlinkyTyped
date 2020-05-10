package typingsSlinky.firebaseApp.firebaseComponentMod

import typingsSlinky.firebaseAppTypes.mod.VersionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var `test-shell`: js.Promise[Unit] = js.native
  var vs1: VersionService = js.native
  var vs2: VersionService = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(`test-shell`: js.Promise[Unit], vs1: VersionService, vs2: VersionService): NameServiceMapping = {
    val __obj = js.Dynamic.literal(vs1 = vs1.asInstanceOf[js.Any], vs2 = vs2.asInstanceOf[js.Any])
    __obj.updateDynamic("test-shell")(`test-shell`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withTest-shell`(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test-shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVs1(value: VersionService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vs1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVs2(value: VersionService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vs2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

