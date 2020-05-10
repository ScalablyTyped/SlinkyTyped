package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppGroupCreationContent extends js.Object {
  /**
    * The description of the group.
    */
  var description: String = js.native
  /**
    * The name of the group.
    */
  var name: String = js.native
  /**
    * The privacy for the group.
    */
  var privacy: AppGroupPrivacy = js.native
}

object AppGroupCreationContent {
  @scala.inline
  def apply(description: String, name: String, privacy: AppGroupPrivacy): AppGroupCreationContent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppGroupCreationContent]
  }
  @scala.inline
  implicit class AppGroupCreationContentOps[Self <: AppGroupCreationContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacy(value: AppGroupPrivacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

