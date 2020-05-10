package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResult extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.native
}

object CreateAppResult {
  @scala.inline
  def apply(): CreateAppResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResult]
  }
  @scala.inline
  implicit class CreateAppResultOps[Self <: CreateAppResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppId")(js.undefined)
        ret
    }
  }
  
}

