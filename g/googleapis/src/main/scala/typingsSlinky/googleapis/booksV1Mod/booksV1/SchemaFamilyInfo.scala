package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.AnonAcquirePermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFamilyInfo extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Family membership info of the user that made the request.
    */
  var membership: js.UndefOr[AnonAcquirePermission] = js.native
}

object SchemaFamilyInfo {
  @scala.inline
  def apply(): SchemaFamilyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFamilyInfo]
  }
  @scala.inline
  implicit class SchemaFamilyInfoOps[Self <: SchemaFamilyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMembership(value: AnonAcquirePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membership")(js.undefined)
        ret
    }
  }
  
}

