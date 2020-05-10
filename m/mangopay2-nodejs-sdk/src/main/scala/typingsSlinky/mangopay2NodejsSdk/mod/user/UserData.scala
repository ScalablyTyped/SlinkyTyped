package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserData extends EntityBaseData {
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  var Email: String = js.native
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  var KYCLevel: typingsSlinky.mangopay2NodejsSdk.mod.user.KYCLevel = js.native
  /**
    * Type of user
    */
  var PersonType: typingsSlinky.mangopay2NodejsSdk.mod.user.PersonType = js.native
}

object UserData {
  @scala.inline
  def apply(
    CreationDate: Double,
    Email: String,
    Id: String,
    KYCLevel: KYCLevel,
    PersonType: PersonType,
    Tag: String
  ): UserData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
  @scala.inline
  implicit class UserDataOps[Self <: UserData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKYCLevel(value: KYCLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KYCLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonType(value: PersonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

