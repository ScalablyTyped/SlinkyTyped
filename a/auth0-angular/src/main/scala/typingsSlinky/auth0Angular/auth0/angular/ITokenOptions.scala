package typingsSlinky.auth0Angular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenOptions extends js.Object {
  var api: js.UndefOr[String] = js.native
  var targetClientId: js.UndefOr[String] = js.native
}

object ITokenOptions {
  @scala.inline
  def apply(): ITokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenOptions]
  }
  @scala.inline
  implicit class ITokenOptionsOps[Self <: ITokenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClientId")(js.undefined)
        ret
    }
  }
  
}

