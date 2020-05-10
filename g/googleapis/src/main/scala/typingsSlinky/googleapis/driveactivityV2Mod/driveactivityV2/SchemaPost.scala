package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A regular posted comment.
  */
@js.native
trait SchemaPost extends js.Object {
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}

object SchemaPost {
  @scala.inline
  def apply(): SchemaPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPost]
  }
  @scala.inline
  implicit class SchemaPostOps[Self <: SchemaPost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
  }
  
}

