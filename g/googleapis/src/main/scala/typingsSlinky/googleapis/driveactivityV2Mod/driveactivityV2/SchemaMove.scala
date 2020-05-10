package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was moved.
  */
@js.native
trait SchemaMove extends js.Object {
  /**
    * The added parent object(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.native
  /**
    * The removed parent object(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.native
}

object SchemaMove {
  @scala.inline
  def apply(): SchemaMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMove]
  }
  @scala.inline
  implicit class SchemaMoveOps[Self <: SchemaMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedParents(value: js.Array[SchemaTargetReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddedParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedParents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovedParents(value: js.Array[SchemaTargetReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedParents")(js.undefined)
        ret
    }
  }
  
}

