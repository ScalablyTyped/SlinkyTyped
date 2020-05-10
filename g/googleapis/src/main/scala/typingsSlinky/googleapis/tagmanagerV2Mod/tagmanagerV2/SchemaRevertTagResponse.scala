package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a tag in a workspace.
  */
@js.native
trait SchemaRevertTagResponse extends js.Object {
  /**
    * Tag as it appears in the latest container version since the last
    * workspace synchronization operation. If no tag is present, that means the
    * tag was deleted in the latest container version.
    */
  var tag: js.UndefOr[SchemaTag] = js.native
}

object SchemaRevertTagResponse {
  @scala.inline
  def apply(): SchemaRevertTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertTagResponse]
  }
  @scala.inline
  implicit class SchemaRevertTagResponseOps[Self <: SchemaRevertTagResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTag(value: SchemaTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

