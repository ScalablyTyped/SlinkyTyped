package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a child container of a Zone.
  */
@js.native
trait SchemaZoneChildContainer extends js.Object {
  /**
    * The zone&#39;s nickname for the child container.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * The child container&#39;s public id.
    */
  var publicId: js.UndefOr[String] = js.native
}

object SchemaZoneChildContainer {
  @scala.inline
  def apply(): SchemaZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneChildContainer]
  }
  @scala.inline
  implicit class SchemaZoneChildContainerOps[Self <: SchemaZoneChildContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicId")(js.undefined)
        ret
    }
  }
  
}

