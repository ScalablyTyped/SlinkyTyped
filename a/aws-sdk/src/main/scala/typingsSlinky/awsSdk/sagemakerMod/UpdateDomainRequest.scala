package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainRequest extends js.Object {
  /**
    * A collection of settings.
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.native
  /**
    * The domain ID.
    */
  var DomainId: typingsSlinky.awsSdk.sagemakerMod.DomainId = js.native
}

object UpdateDomainRequest {
  @scala.inline
  def apply(DomainId: DomainId): UpdateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainRequest]
  }
  @scala.inline
  implicit class UpdateDomainRequestOps[Self <: UpdateDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultUserSettings(value: UserSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultUserSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUserSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultUserSettings")(js.undefined)
        ret
    }
  }
  
}

