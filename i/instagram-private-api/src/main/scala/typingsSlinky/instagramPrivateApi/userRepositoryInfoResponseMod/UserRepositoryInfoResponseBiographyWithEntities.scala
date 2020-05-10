package typingsSlinky.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRepositoryInfoResponseBiographyWithEntities extends js.Object {
  var entities: js.Array[_] = js.native
  var raw_text: String = js.native
}

object UserRepositoryInfoResponseBiographyWithEntities {
  @scala.inline
  def apply(entities: js.Array[_], raw_text: String): UserRepositoryInfoResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseBiographyWithEntities]
  }
  @scala.inline
  implicit class UserRepositoryInfoResponseBiographyWithEntitiesOps[Self <: UserRepositoryInfoResponseBiographyWithEntities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

