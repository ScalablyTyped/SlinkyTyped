package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileMetadata extends js.Object {
  /** Output only. The profile object type. */
  var objectType: js.UndefOr[String] = js.native
  /** Output only. The user types. */
  var userTypes: js.UndefOr[js.Array[String]] = js.native
}

object ProfileMetadata {
  @scala.inline
  def apply(): ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileMetadata]
  }
  @scala.inline
  implicit class ProfileMetadataOps[Self <: ProfileMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTypes")(js.undefined)
        ret
    }
  }
  
}

