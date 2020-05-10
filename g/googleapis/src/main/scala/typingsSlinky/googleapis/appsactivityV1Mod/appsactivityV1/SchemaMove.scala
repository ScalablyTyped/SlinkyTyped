package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about changes in an object&#39;s parents as a result
  * of a move type event.
  */
@js.native
trait SchemaMove extends js.Object {
  /**
    * The added parent(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaParent]] = js.native
  /**
    * The removed parent(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaParent]] = js.native
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
    def withAddedParents(value: js.Array[SchemaParent]): Self = {
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
    def withRemovedParents(value: js.Array[SchemaParent]): Self = {
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

