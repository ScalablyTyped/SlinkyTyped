package typingsSlinky.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of generated IDs which can be provided in insert requests
  */
@js.native
trait SchemaGeneratedIds extends js.Object {
  /**
    * The IDs generated for the requesting user in the specified space.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * This is always drive#generatedIds
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The type of file that can be created with these IDs.
    */
  var space: js.UndefOr[String] = js.native
}

object SchemaGeneratedIds {
  @scala.inline
  def apply(): SchemaGeneratedIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedIds]
  }
  @scala.inline
  implicit class SchemaGeneratedIdsOps[Self <: SchemaGeneratedIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
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
    def withSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

