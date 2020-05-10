package typingsSlinky.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Checkpoint model.
  */
@js.native
trait ICheckpointModel extends js.Object {
  /**
    * The unique identifier for the checkpoint.
    */
  val id: String = js.native
  /**
    * Last modified timestamp.
    */
  val last_modified: String = js.native
}

object ICheckpointModel {
  @scala.inline
  def apply(id: String, last_modified: String): ICheckpointModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckpointModel]
  }
  @scala.inline
  implicit class ICheckpointModelOps[Self <: ICheckpointModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_modified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_modified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

