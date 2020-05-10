package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Tags Response.
  */
@js.native
trait SchemaListTagsResponse extends js.Object {
  /**
    * All GTM Tags of a GTM Container.
    */
  var tags: js.UndefOr[js.Array[SchemaTag]] = js.native
}

object SchemaListTagsResponse {
  @scala.inline
  def apply(): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
  @scala.inline
  implicit class SchemaListTagsResponseOps[Self <: SchemaListTagsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[SchemaTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

