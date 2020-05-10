package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a profile.
  */
@js.native
trait SchemaProfileMetadata extends js.Object {
  /**
    * The profile object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The user types.
    */
  var userTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaProfileMetadata {
  @scala.inline
  def apply(): SchemaProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileMetadata]
  }
  @scala.inline
  implicit class SchemaProfileMetadataOps[Self <: SchemaProfileMetadata] (val x: Self) extends AnyVal {
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

