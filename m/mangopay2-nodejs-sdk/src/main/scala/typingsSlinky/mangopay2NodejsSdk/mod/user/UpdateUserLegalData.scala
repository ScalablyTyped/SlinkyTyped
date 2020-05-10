package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserLegalData extends BaseUserLegalData {
  var Id: String = js.native
}

object UpdateUserLegalData {
  @scala.inline
  def apply(Id: String, PersonType: LEGAL): UpdateUserLegalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserLegalData]
  }
  @scala.inline
  implicit class UpdateUserLegalDataOps[Self <: UpdateUserLegalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

