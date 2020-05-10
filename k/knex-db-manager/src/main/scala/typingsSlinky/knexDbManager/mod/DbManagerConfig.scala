package typingsSlinky.knexDbManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbManagerConfig extends js.Object {
  var collate: js.UndefOr[js.Array[String]] = js.native
  var superPassword: js.UndefOr[String] = js.native
  var superUser: js.UndefOr[String] = js.native
}

object DbManagerConfig {
  @scala.inline
  def apply(): DbManagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbManagerConfig]
  }
  @scala.inline
  implicit class DbManagerConfigOps[Self <: DbManagerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superUser")(js.undefined)
        ret
    }
  }
  
}

