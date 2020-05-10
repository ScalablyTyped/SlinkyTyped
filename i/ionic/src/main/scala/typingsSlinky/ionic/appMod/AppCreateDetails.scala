package typingsSlinky.ionic.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCreateDetails extends js.Object {
  val name: String = js.native
  val org_id: js.UndefOr[String] = js.native
}

object AppCreateDetails {
  @scala.inline
  def apply(name: String): AppCreateDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCreateDetails]
  }
  @scala.inline
  implicit class AppCreateDetailsOps[Self <: AppCreateDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrg_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org_id")(js.undefined)
        ret
    }
  }
  
}

