package typingsSlinky.mangopay2NodejsSdk.mod.cardRegistration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'Tag' | 'RegistrationData'> */
@js.native
trait UpdateCardRegistration extends js.Object {
  var RegistrationData: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object UpdateCardRegistration {
  @scala.inline
  def apply(): UpdateCardRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCardRegistration]
  }
  @scala.inline
  implicit class UpdateCardRegistrationOps[Self <: UpdateCardRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistrationData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationData")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

