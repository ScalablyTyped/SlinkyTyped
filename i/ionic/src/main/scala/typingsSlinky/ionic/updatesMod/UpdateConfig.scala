package typingsSlinky.ionic.updatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfig extends js.Object {
  var lastNotify: js.UndefOr[String] = js.native
  var lastUpdate: js.UndefOr[String] = js.native
  var packages: js.Array[PersistedPackage] = js.native
}

object UpdateConfig {
  @scala.inline
  def apply(packages: js.Array[PersistedPackage]): UpdateConfig = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfig]
  }
  @scala.inline
  implicit class UpdateConfigOps[Self <: UpdateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackages(value: js.Array[PersistedPackage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastNotify(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastNotify")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdate")(js.undefined)
        ret
    }
  }
  
}

