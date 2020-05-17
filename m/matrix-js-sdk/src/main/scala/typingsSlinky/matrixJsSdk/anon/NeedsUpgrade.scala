package typingsSlinky.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeedsUpgrade extends js.Object {
  var needsUpgrade: Boolean = js.native
  var urgent: Boolean = js.native
  var version: String = js.native
}

object NeedsUpgrade {
  @scala.inline
  def apply(needsUpgrade: Boolean, urgent: Boolean, version: String): NeedsUpgrade = {
    val __obj = js.Dynamic.literal(needsUpgrade = needsUpgrade.asInstanceOf[js.Any], urgent = urgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsUpgrade]
  }
  @scala.inline
  implicit class NeedsUpgradeOps[Self <: NeedsUpgrade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedsUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrgent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

